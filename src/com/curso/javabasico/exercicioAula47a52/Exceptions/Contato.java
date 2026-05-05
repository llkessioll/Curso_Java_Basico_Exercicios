package com.curso.javabasico.exercicioAula47a52.Exceptions;

public class Contato {

	private static int contador =0;
	private int id;
	private String nome;
	private String telefone;
	
	public Contato(String nome, String telefone) {
		contador ++;
		id = contador;
		this.nome = nome;
		this.telefone = telefone;
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public String toString() {
		
		String s = "ID: " + id +", ";
		s += "Nome: " + nome + ", ";
		s += "Telefone: " + telefone;
		
		return s;
		
	}
}
