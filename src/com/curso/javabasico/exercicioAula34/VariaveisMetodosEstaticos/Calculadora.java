package com.curso.javabasico.exercicioAula34.VariaveisMetodosEstaticos;

public class Calculadora {

	public static double soma(double numUm, double numDois) {
		return numUm + numDois;
	}
	
	public static double multiplicacao(double numUm, double numDois) {
		return numUm * numDois;
	}
	
	public static double subtracao(double numUm, double numDois) {
		return numUm - numDois;
	}
	
	public static double divisao(double numUm, double numDois) {
		if(numDois == 0) {
			return 0;
		}else {
			return numUm / numDois;
		}
	}
	
	public static int fatorial(int valor) {
		
		int resultado =1;
		
		if(valor == 0) {
			resultado = 1;
		}else{
			
			for(int i=2; i <= valor; i++) {
				resultado *= i;
			}
		}
		
		return resultado;
	}
	
}
