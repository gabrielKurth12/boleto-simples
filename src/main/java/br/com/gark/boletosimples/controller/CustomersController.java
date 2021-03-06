package br.com.gark.boletosimples.controller;

import java.text.ParseException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public List<CustomerDTO> getAll() {
		return customersService.listAll();
	}

	@GetMapping("{cnpj}")
	public CustomerDTO findByCnpj(@PathVariable final String cnpj) throws ParseException {
		return customersService.findByCnpj(cnpj);
	}

	@PostMapping
	public Long create(@RequestBody @Valid final CustomerDTO customerDTO) {
		return customersService.create(customerDTO);
	}

}
