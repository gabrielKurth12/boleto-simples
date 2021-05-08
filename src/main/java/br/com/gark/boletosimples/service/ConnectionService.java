package br.com.gark.boletosimples.service;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

@Service
public class ConnectionService {

	private static final String TOKEN = "qjKt31ya34seFxVXqcnK67MqfuuyL2ULP6zRb588GRQ";

	protected HttpHeaders createHttpHeaders() {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		httpHeaders.add("Authorization", "Bearer " + ConnectionService.TOKEN);
		httpHeaders.add("User-Agent", "gabrielrosakurth@gmail.com");

		return httpHeaders;
	}

}
