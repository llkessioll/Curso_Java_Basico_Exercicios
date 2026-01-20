package com.curso.javabasico.exercicioAula36.RelacionamentoEntreClasses.agenda;

public class Agenda {

	private Contato[] contatos;
	private String nome;
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
}
