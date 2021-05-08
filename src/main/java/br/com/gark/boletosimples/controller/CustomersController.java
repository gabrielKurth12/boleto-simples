package br.com.gark.boletosimples.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gark.boletosimples.domain.dto.CustomerDTO;
import br.com.gark.boletosimples.service.CustomersService;

@RestController
@RequestMapping("customers")
public class CustomersController {

	@Autowired
	private CustomersService customersService;

	@GetMapping
	public List<CustomerDTO> getAllCustomers() {
		return customersService.listAll();
	}

	@GetMapping("{id}")
	public CustomerDTO findById(@PathVariable final Long id) {
		return customersService.findById(id);
	}

}
