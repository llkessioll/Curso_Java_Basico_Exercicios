package com.curso.javabasico.exercicioAula36a43.HerancaPolimorfismo.Animais;

public class Animal {

	private String nome;
	private double comprimento;
	private int quantidadePatas;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	public double getComprimento() {
		return comprimento;
	}
	
	public void setQuantidadePatas(int quantidadePatas) {
		this.quantidadePatas = quantidadePatas;
	}
	
	public int getQuantidadePatas() {
		return quantidadePatas;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	
	public String getAmbiente() {
		return ambiente;
	}
	
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public double getVelocidade() {
		return velocidade;
	}
	
	@Override
	public String toString() {
		
		String s = "";
		
		s += "\nAnimal: " + nome;
		s += "\nComprimento: " + comprimento + "cm";
		s += "\nQuantidade de patas: " + quantidadePatas;
		s += "\nCor: " + cor;
		s += "\nAmbiente: " + ambiente;
		s += "\nVelocidade: " + velocidade + "m/s";
		
		return s;
		
	}
	
}
