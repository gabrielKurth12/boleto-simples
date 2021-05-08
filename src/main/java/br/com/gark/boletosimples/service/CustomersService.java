package br.com.gark.boletosimples.service;

import java.util.List;

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

	public CustomerDTO findById(final Long id) {
		StringBuilder url = new StringBuilder(BASE_URL).append("/").append(id);
		return restTemplate.exchange(url.toString(), //
				HttpMethod.GET, //
				new HttpEntity<>(connectionService.createHttpHeaders()), //
				CustomerDTO.class).getBody();
	}

}
