package com.curso.javabasico.exercicioAula34.VariaveisMetodosEstaticos;

public class MainContador {

	public static void main(String[] args) {
		
		System.out.println(Contador.retornarContador());
		
		Contador.incrementarContador();
		
		System.out.println(Contador.retornarContador());
		
		Contador.incrementarContador();
		Contador.incrementarContador();
		
		System.out.println(Contador.retornarContador());
		
		Contador.zerarContador();
		
		System.out.println(Contador.retornarContador());
	}
}
