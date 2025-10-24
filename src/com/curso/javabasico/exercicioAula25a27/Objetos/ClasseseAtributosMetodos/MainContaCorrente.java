package com.curso.javabasico.exercicioAula25a27.Objetos.ClasseseAtributosMetodos;

public class MainContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente contaKessio = new ContaCorrente();
		
		contaKessio.numero = 123;
		contaKessio.limite = 2000;
		contaKessio.especial = true;
		contaKessio.status = true;
		contaKessio.saldo = 0;
		
		contaKessio.extrato();
		
		contaKessio.depositar(1750);
		
		contaKessio.extrato();
	}
}
