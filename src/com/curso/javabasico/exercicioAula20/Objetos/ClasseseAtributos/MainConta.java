package com.curso.javabasico.exercicioAula20.Objetos.ClasseseAtributos;

public class MainConta {

	public static void main(String[] args) {
		
		Conta contaUm = new Conta();
		
		contaUm.numero = 123;
		contaUm.limite = 2000;
		contaUm.saldo = 500;
		contaUm.status = false;
		
		System.out.println("Conta número: "+contaUm.numero);
		System.out.println("Limite: "+contaUm.limite);
		System.out.println("Saldo: "+contaUm.saldo);
		System.out.println("Status: "+contaUm.status);
		
		System.out.println("-------------------------------------");
		
		Conta contaDois = new Conta();
		
		contaDois.numero = 4321;
		contaDois.limite = 500;
		contaDois.saldo = 475;
		contaDois.status = true;
		
		System.out.println("Conta número: "+contaDois.numero);
		System.out.println("Limite: "+contaDois.limite);
		System.out.println("Saldo: "+contaDois.saldo);
		System.out.println("Status: "+contaDois.status);
		
	}
}
