package com.curso.javabasico.exercicioAula34.VariaveisMetodosEstaticos;

public class Contador {

	static int cont =0;
	
	
	public static void zerarContador() {
		cont =0;
	}
	
	public static void incrementarContador() {
		cont++;
	}
	
	public static String retornarContador() {
		return "Contador: "+cont;
	}
}
