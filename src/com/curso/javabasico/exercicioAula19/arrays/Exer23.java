package com.curso.javabasico.exercicioAula19.arrays;

public class Exer23 {

	public static void main(String[] args) {
		
		int[] valores = new int[] {2, 4, 6, 8, 10 ,12, 3, 14, 16, 18};
		
		int cont =0;
		
		boolean ePar = true;
		
		while(ePar) {
			
			if(valores[cont] % 2 != 0) {
				ePar = false;
			}
			
			cont++;
		}
		
		imprimirValores(valores);
		
	}
	
	public static void imprimirValores(int[] vetor) {
		
		System.out.println("Itens do vetor");
		
		for(int i=0; i < vetor.length; i++) {
			
			System.out.print(vetor[i]);
			
			if(i < vetor.length -1) {
				System.out.print(", ");
			}
			
		}
		
	}
}
