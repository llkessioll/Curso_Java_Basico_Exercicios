package com.curso.javabasico.exercicioAula19.arrays;

public class Exer26 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 50};
		int[] vetorB = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 50};
		int[] vetorC = new int[vetorA.length];
		
		for(int i=0; i < vetorA.length; i++) {
			
			if(vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			}
			
			if(vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;
			}
			
			if(vetorA[i] < vetorB[i]) {
				vetorC[i] = -1;
			}
			
		}
		
		imprimirValores("Itens do vetor A", vetorA);
		imprimirValores("Itens do vetor B", vetorB);
		imprimirValores("Itens do vetor C", vetorC);
		
	}
	
	public static void imprimirValores(String titulo, int[] vetor) {
		
		System.out.println("\n"+titulo);
		
		for(int i=0; i < vetor.length; i++) {
			
			System.out.print(vetor[i]);
			
			if(i < vetor.length -1) {
				
				System.out.print(", ");
				
			}
		}
		
	}
}
