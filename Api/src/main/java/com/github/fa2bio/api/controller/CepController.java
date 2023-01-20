package com.github.fa2bio.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.fa2bio.api.assembler.AddressAssembler;
import com.github.fa2bio.api.model.AddressModel;
import com.github.fa2bio.api.model.input.AddressInputModel;
import com.github.fa2bio.domain.service.CepService;

@RestController
@RequestMapping("/cep")
public class CepController {

	@Autowired
	private CepService cepService;
	
	@Autowired
	private AddressAssembler addressAssembler;
	
	@GetMapping(path="/{cep}")
	public AddressModel buscarEnderecoCloud(@PathVariable String cep) {
		AddressInputModel address = cepService.findAddress(cep);
		return addressAssembler.toModel(address);
	}

}
