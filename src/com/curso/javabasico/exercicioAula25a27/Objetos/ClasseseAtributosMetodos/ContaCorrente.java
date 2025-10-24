package com.curso.javabasico.exercicioAula25a27.Objetos.ClasseseAtributosMetodos;

public class ContaCorrente {
	
	int numero;
	double saldo;
	double limite;
	boolean status;
	boolean especial;
	
	void depositar(double valor) {
		saldo += valor;
	}
	
	void saque(double valor) {
		saldo -= valor;
	}
	
	void sacar(double valor) {
		if(status) {
			
			if(saldo >= valor && limite > 0) {
				
				saque(valor);
				
			}
			
		}else {
			System.out.println("A conta não esta ativa");
		}
	}
	
	
	void extrato() {
		
		System.out.println("============= Extrato =============");
		System.out.println("Número da conta: "+numero);
		System.out.println("Saldo: "+saldo);
		System.out.println("Limite: "+limite);
		if(especial) {
			System.out.println("Especial: Sim");
		}else {
			System.out.println("Especial: Não");
		}
		
		if(status) {
			System.out.println("Conta ativo");
		}else {
			System.out.println("Conta inativa");
		}
	}
}
