package com.curso.javabasico.exercicioAula19.arrays;

public class Exer01 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[] {1, 2, 3, 4, 5};
		int[] vetorB = new int[5];
		
		for(int i=0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i];
		}
		
		System.out.println("Elementos do vetor A");
		for(int j =0; j < vetorA.length; j++) {
			System.out.print(vetorA[j]);
			if(j < vetorA.length -1) {
				System.out.print(", ");
			}
		}
		
		System.out.println("\nElementos do vetor B");
		for(int k =0; k < vetorA.length; k++) {
			System.out.print(vetorB[k]);
			if(k < vetorA.length -1) {
				System.out.print(", ");
			}
		}
		
	}
}
