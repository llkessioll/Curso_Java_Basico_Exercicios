package com.curso.javabasico.exercicioAula19.arrays;

public class Exer28 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0 ; i < vetorA.length; i++) {

			vetorB[i] = vetorA[vetorA.length-1 -i];
			
		}
		
		imprimirValores("Itens do vetor A", vetorA);
		imprimirValores("Itens do vetor B", vetorB);
		
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
