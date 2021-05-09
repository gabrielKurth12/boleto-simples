package br.com.gark.boletosimples.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gark.boletosimples.domain.dto.BankBilletDTO;
import br.com.gark.boletosimples.service.BankBilletService;

@RestController
@RequestMapping("bank-billet")
public class BankBilletController {

	@Autowired
	private BankBilletService bankBilletService;

	@GetMapping
	public List<BankBilletDTO> getAll() {
		return bankBilletService.listAll();
	}

	@GetMapping("{id}")
	public BankBilletDTO findBy(@PathVariable final Long id){
		return bankBilletService.findById(id);
	}
//	
//	@PostMapping
//	public Long create(@RequestBody @Valid final CustomerDTO customerDTO) {
//		return customersService.create(customerDTO);
//	}

}
