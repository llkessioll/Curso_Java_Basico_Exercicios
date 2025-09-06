package com.curso.javabasico.exercicioAula16a17.loop;

public class Exer29 {

	public static void main(String[] args) {
		
		double PRECO_UNICO = 1.99;
		
		System.out.println("Lojas Quase Dois - Tabela de preços");
		
		System.out.println("\nQtd \t Total");
		
		for(int i=1; i <= 50; i++) {
			
			System.out.println(i+" \t R$ "+(i*PRECO_UNICO));
			
		}
		
	}
}
