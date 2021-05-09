package br.com.gark.boletosimples.service;

import java.text.ParseException;
import java.util.List;

import javax.swing.text.MaskFormatter;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.gark.boletosimples.domain.dto.CustomerDTO;
import br.com.gark.boletosimples.domain.enumeration.MethodEnum;
import br.com.gark.boletosimples.domain.enumeration.UrlEnum;

@Service
public class CustomersService extends AbstractService {

	private static final String BASE_URL = UrlEnum.URL_TESTE.getUrl() + MethodEnum.CUSTOMERS.getMethod();

	public List<CustomerDTO> listAll() {
		ParameterizedTypeReference<List<CustomerDTO>> responseType = new ParameterizedTypeReference<>() {
		};
		ResponseEntity<List<CustomerDTO>> response = restTemplate.exchange(BASE_URL, //
				HttpMethod.GET, //
				new HttpEntity<>(connectionService.createHttpHeaders()), //
				responseType);

		return response.getBody();
	}

	public CustomerDTO findByCnpj(final String cnpj) throws ParseException {
		MaskFormatter mask = new MaskFormatter("##.###.###/####-##");
		mask.setValueContainsLiteralCharacters(false);

		StringBuilder url = new StringBuilder(BASE_URL).append("/").append("cnpj_cpf?q=")
				.append(mask.valueToString(cnpj));
		return restTemplate.exchange(url.toString(), //
				HttpMethod.GET, //
				new HttpEntity<>(connectionService.createHttpHeaders()), //
				CustomerDTO.class).getBody();
	}

	public Long create(final CustomerDTO customerDTO) {
		ResponseEntity<CustomerDTO> response = restTemplate.exchange(BASE_URL, HttpMethod.POST,
				new HttpEntity<>(customerDTO, connectionService.createHttpHeaders()), CustomerDTO.class);

		return response.getBody().getId();
	}

}
