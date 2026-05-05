package com.curso.javabasico.exercicioAula47a52.Exceptions;

public class ContatoNaoExiste extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Contato não encontrado !";
	}
}
