package com.github.fa2bio.infrastrucuture.cloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.github.fa2bio.api.model.input.AddressInputModel;


@FeignClient(name = "ViaCep", url="https://viacep.com.br/ws")
public interface CepClient {
	@GetMapping(value = "/{cep}/json")
	AddressInputModel findAddressByCep(@PathVariable String cep);
}
