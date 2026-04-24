package com.curso.javabasico.exercicioAula36a43.HerancaPolimorfismo.contaBancaria;

public class ContaEspecial extends ContaBancaria{

	private double limite;
	
	
	//Construtores
	public ContaEspecial() {
		super();
	}
	
	public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
		super(nomeCliente, numConta, saldo);
		this.limite = limite;
	}

	public ContaEspecial(String nomeCliente, String numConta, double saldo) {
		super(nomeCliente, numConta, saldo);
	}

	public ContaEspecial(String nomeCliente, String numConta) {
		super(nomeCliente, numConta);
	}
	
	
	//Get's e Set's
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double getLimite() {
		return limite;
	}
	
	//Metodos gerais
	
	@Override
	public String sacar(double valor) {
		
		double saldoAntigo, novoSaldo; 
		
		if(valor <= getSaldo()) {
			
			saldoAntigo = getSaldo();
			novoSaldo = saldoAntigo - valor;
			setSaldo(novoSaldo);
			return "SAQUE REALIZADO DO SALDO";
		}
		
		if(valor >= this.limite) {
			
			limite -= valor;
			return "SAQUE REALIZADO DO LIMITE";
		}
		
		return "NÃO TEM SALDO OU LIMITE PARA O SAQUE: A CONTA NÃO PODE TER SALDO NEGATIVO";
	}
	
	public String infoConta() {
		
		return "Num Conta: "+getNumConta()+"\nCliente: "+getNomeCliente()+"\nSaldo: "+getSaldo()+"\nLimite: "+this.limite;
		
	}
	
}
