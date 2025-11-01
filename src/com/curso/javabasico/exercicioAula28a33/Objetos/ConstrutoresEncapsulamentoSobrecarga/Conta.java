package com.curso.javabasico.exercicioAula28a33.Objetos.ConstrutoresEncapsulamentoSobrecarga;

public class Conta {

	private int numero;
	private double saldo;
	private double limite;
	private boolean especial;
	
	//CONSTRUTORES
	public Conta() {}
	
	public Conta(int numero, double saldo, boolean especial) {
		this.numero = numero;
		this.saldo = saldo;
		this.especial = especial;
	}
	
	public Conta(int numero, double saldo, double limite, boolean especial) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.especial = especial;
	}
	
	//GET'S e SET'S
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNumero() {
		return this.numero;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getLimite() {
		return this.limite;
	}
	
	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
	public boolean isEspecial() {
		return this.especial;
	}
	
	//FUNÇÕES GERAIS
	public boolean sacar(double valorSaque) {
		
		if(valorSaque <= getSaldo() || isEspecial() ) {
			
			if(getSaldo() >= valorSaque) {
				this.saldo -= valorSaque;
			}else if(isEspecial() && getLimite() >= valorSaque ) {
				this.limite -= valorSaque;
			}
			
			return true;
		}
		
		return false;
	}
	
	public boolean depositar(double valorDeposito) {
		
		if(valorDeposito > 0) {
			this.saldo += valorDeposito;
			return true;
		}
		
		return false;
	}
	
	public String extrato() {
		
		//String saida;
		
		return "Número conta: "+this.numero+"\nSaldo: "+this.saldo+"\nLimite: "+this.limite+"\nConta especial: "+this.especial;
		
	}
}
