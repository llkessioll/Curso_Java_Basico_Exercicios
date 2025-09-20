package com.curso.javabasico.exercicioAula19.arrays;

public class Exer02 {

	public static void main(String[] args) {
		
		int[] numerosA = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
		int[] numerosB = new int[8];
		
		for(int i=0; i< numerosA.length; i++) {
			
			numerosB[i] = (numerosA[i] * 2);
			
		}
		
		System.out.println("Elementos do vetor A");
		for(int j : numerosA) {
			System.out.print(j);
			if(j < numerosA.length) {
				System.out.print(", ");
			}
		}
		
		System.out.println("\nElementos do vetor B");
		for(int k =0; k < numerosB.length; k++) {
			System.out.print(numerosB[k]);
			if(k < numerosB.length -1) {
				System.out.print(", ");
			}
		}
	}
}
