package br.com.gark.boletosimples;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.gark.boletosimples.service.CustomersService;

@SpringBootApplication
public class BoletoSimplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoletoSimplesApplication.class, args);
		
		CustomersService cs = new CustomersService();
		try {
			cs.listAll();
		} catch (KeyManagementException | NoSuchAlgorithmException | IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
