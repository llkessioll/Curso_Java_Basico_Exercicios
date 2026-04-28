package com.curso.javabasico.exercicioAula44a46.interfaces.FigurasGeometricas;

public abstract class FiguraGeometrica {

	private String nome;
	private String cor;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}
}
