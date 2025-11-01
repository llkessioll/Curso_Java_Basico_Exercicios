package com.curso.javabasico.exercicioAula28a33.Objetos.ConstrutoresEncapsulamentoSobrecarga;

public class Lampada {

	private String marca;
	private String modelo;
	private String descricao;
	private double preco;
	private int quantidade;
	
	private boolean ligada;
	
	//CONSTRUTORES
	public Lampada() {}
	
	public Lampada(String marca, String modelo, String descricao, double preco, int quantidade) {
		this.marca = marca;
		this.modelo = modelo;
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	//GET'S E SET'S
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return this.marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return this.modelo;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return this.preco;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getQuantidade() {
		return this.quantidade;
	}
	
	//FUNÇÕES
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
	
	public boolean isLigada() {
		return ligada;
	}
}
