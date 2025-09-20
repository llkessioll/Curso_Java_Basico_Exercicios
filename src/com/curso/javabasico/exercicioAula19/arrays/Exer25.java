package com.curso.javabasico.exercicioAula19.arrays;

public class Exer25 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i < vetorA.length; i++) {
			
			if(vetorA[i] % 2 == 0) {
				vetorB[i] = 1;
			}else {
				vetorB[i] = 0;
			}
			
		}
		
		imprimirValores(vetorA, "Itens do vetor A");
		imprimirValores(vetorB, "Itens do vetor B");
		
	}
	
	public static void imprimirValores(int[] vetor, String titulo) {
		
		System.out.println("\n"+titulo);
		for(int i=0; i < vetor.length; i ++) {
			
			System.out.print(vetor[i]);
			if(i < vetor.length -1) {
				System.out.print(", ");
			}
			
		}
		
	}
}
