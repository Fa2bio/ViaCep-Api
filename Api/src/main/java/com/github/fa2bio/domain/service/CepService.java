package com.github.fa2bio.domain.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.fa2bio.api.model.input.AddressInputModel;
import com.github.fa2bio.domain.exception.InvalidCepExeception;
import com.github.fa2bio.infrastrucuture.cloud.CepClient;

@Service
public class CepService {

	@Autowired
	private CepClient cepClient;
	
	public AddressInputModel findAddress(String cep) {
		if(cepValidated(cep)) {
			AddressInputModel address = cepClient.findAddressByCep(cep);
			if(address.getCep() == null) throw new InvalidCepExeception(String.format("Unable to generate address for CEP code: %s", cep));
			return address; 
		}
		return null;
	}		
	
	private boolean cepValidated(String cep) {
		if(cep.contains("-")) {
			if(cep.length() == 9) {
				cep.replace("-", "");
				return true;
			}else throw new InvalidCepExeception("Invalid Format. CEP code has the character - ");
		}
		else if(cep.length() != 8) {
			throw new InvalidCepExeception("Invalid Format. CEP code must be 8 characters long");
		}
		else if(!StringUtils.isNumeric(cep)) {
			throw new InvalidCepExeception("Invalid Format. CEP has characters [a-z][A-Z] and/or spaces between the digits");
		}
		return true;
	}		
}
