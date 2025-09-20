package com.curso.javabasico.exercicioAula19.arrays;

public class Exer03 {

	public static void main(String[] agrs) {
		
		int[] valoresA = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		
		int[] valoresB = new int[15];
		
		for(int i=0; i < valoresA.length; i++) {
			
			valoresB[i] = (valoresA[i] * valoresA[i]);
			
		}
		
		System.out.println("Itens do vetor A");
		for(int j=0; j < valoresA.length; j++) {
			System.out.print(valoresA[j]);
			if(j < valoresA.length -1) {
				System.out.print(", ");
			}
		}
		
		System.out.println("\nItens do vetor B");
		for(int k=0; k < valoresA.length; k++) {
			System.out.print(valoresB[k]);
			if(k < valoresA.length -1) {
				System.out.print(", ");
			}
		}
		
	}
}
