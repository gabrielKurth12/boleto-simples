package br.com.gark.boletosimples.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public abstract class AbstractService {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	protected ConnectionService connectionService;
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
