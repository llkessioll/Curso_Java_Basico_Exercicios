package com.curso.javabasico.exercicioAula16a17.loop;

public class Exer30 {
	
	public static void main(String[] args) {
		
		final double PRECO_UNICO = 0.18;
		
		System.out.println("Preço do pão: R$: "+PRECO_UNICO);
		System.out.println("Panificadora pão de ontem - Tabela de preços");
		
		System.out.println("\nQtd \t Total");
		
		for(int i=1; i<=50; i++) {
			
			System.out.println(i+" \t R$ "+ (i*PRECO_UNICO));
			
		}
	}

}
