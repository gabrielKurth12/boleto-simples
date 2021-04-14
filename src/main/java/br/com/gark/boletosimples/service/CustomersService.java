package br.com.gark.boletosimples.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import org.springframework.http.HttpMethod;

import br.com.gark.boletosimples.domain.enumeration.MethodEnum;

public class CustomersService {

	public void listAll() throws KeyManagementException, UnsupportedEncodingException, NoSuchAlgorithmException, IOException, InterruptedException {
		ConnectionService cn = new ConnectionService();
		cn.sendRequest(MethodEnum.CUSTOMERS, HttpMethod.GET, null);
	}
	
}
