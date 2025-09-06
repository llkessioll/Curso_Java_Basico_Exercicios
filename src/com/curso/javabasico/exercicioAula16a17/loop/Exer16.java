package com.curso.javabasico.exercicioAula16a17.loop;

public class Exer16 {

	public static void main(String[] args) {
		
		int anterior = 0, proximo = 1, sucessor = 0;
		
		System.out.print(anterior+", ");
		System.out.print(proximo+", ");
		
		for(int i=1; i<=500; i++) {
			
			sucessor = proximo + anterior;
			
			System.out.print(sucessor+", ");
			
			anterior = proximo;
			proximo = sucessor;
		}
	}
}
