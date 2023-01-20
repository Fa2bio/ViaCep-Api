package com.github.fa2bio.domain.exception;

public class InvalidCepExeception extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public InvalidCepExeception(String message) {
		super(message);
	}
}
