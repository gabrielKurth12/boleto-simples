package br.com.gark.boletosimples.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.gark.boletosimples.domain.dto.BankBilletDTO;
import br.com.gark.boletosimples.domain.dto.BankBilletDTOWrapper;
import br.com.gark.boletosimples.domain.enumeration.MethodEnum;
import br.com.gark.boletosimples.domain.enumeration.UrlEnum;

@Service
public class BankBilletService extends AbstractService {

	private static final String BASE_URL = UrlEnum.URL_TESTE.getUrl() + MethodEnum.BANK_BILLETS.getMethod();

	public List<BankBilletDTO> listAll() {
		ParameterizedTypeReference<List<BankBilletDTO>> responseType = new ParameterizedTypeReference<>() {
		};
		ResponseEntity<List<BankBilletDTO>> response = restTemplate.exchange(BASE_URL, //
				HttpMethod.GET, //
				new HttpEntity<>(connectionService.createHttpHeaders()), //
				responseType);

		return response.getBody();
	}

	public BankBilletDTO findById(final Long id) {
		return restTemplate.exchange(BASE_URL + "/" + id, //
				HttpMethod.GET, //
				new HttpEntity<>(connectionService.createHttpHeaders()), //
				BankBilletDTO.class).getBody();
	}

	public Long create(final BankBilletDTO bankBilletDTO) {
		ResponseEntity<BankBilletDTO> response = restTemplate.exchange(BASE_URL, //
				HttpMethod.POST, //
				new HttpEntity<>(BankBilletDTOWrapper.builder().bankBillet(bankBilletDTO).build(),
						connectionService.createHttpHeaders()), //
				BankBilletDTO.class);

		return response.getBody().getId();
	}

}
