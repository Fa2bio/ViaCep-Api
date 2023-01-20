package com.github.fa2bio.api.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.fa2bio.api.model.AddressModel;
import com.github.fa2bio.api.model.input.AddressInputModel;

@Component
public class AddressAssembler {

	@Autowired
	private ModelMapper modelMapper;
	
	public AddressModel toModel(AddressInputModel address) {
		return modelMapper.map(address, AddressModel.class);
	}
}
