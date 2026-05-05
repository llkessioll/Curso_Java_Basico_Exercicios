package com.curso.javabasico.exercicioAula47a52.Exceptions;

public class AgendaCheiaException extends Exception{

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		
		return "Número maximo de contatos na agenda !";
	
	}
}
