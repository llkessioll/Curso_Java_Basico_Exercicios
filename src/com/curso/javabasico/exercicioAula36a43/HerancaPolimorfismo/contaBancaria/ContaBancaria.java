package com.curso.javabasico.exercicioAula36a43.HerancaPolimorfismo.contaBancaria;

public class ContaBancaria {

	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	public ContaBancaria() {}
	
	public ContaBancaria(String nomeCliente, String numConta) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
	}
	
	public ContaBancaria(String nomeCliente, String numConta, double saldo) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	public String getNomeCliente() {
		return this.nomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getNumConta() {
		return this.numConta;
	}
	
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String sacar(double valor) {
		
		if(this.saldo > 0 && saldo >= valor) {
			
			this.saldo -= valor;
			return "SAQUE REALIZADO COM SUCESSO !";
			
		}else {
			
			return "SALDO 00,00 - NÃO É PERMITIDO SALDO NEGATIVO";
		}
		
	}
	
	public void depositar(double valor) {
		
		setSaldo(valor);
		
	}
}
