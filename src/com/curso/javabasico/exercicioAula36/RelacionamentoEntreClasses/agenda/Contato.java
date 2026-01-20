package com.curso.javabasico.exercicioAula36.RelacionamentoEntreClasses.agenda;

public class Contato {

	private String nome;
	private String email;
	private String telefone;
	
	public Contato() {}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
