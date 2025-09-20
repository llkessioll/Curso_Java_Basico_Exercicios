package com.curso.javabasico.exercicioAula19.arrays;

public class Exer06 {

	public static void main(String[] args) {
		
		int[] valoresA = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] valoresB = new int[]{11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		int[] resultadoSoma = new int[valoresA.length];
		
		for(int i=0; i < valoresA.length; i++) {
			resultadoSoma[i] = valoresA[i]+valoresB[i];
		}
		
		imprimirVetores("Itens do vetor A", valoresA);
		imprimirVetores("Itens do vetor B", valoresB);
		imprimirVetores("Resultado da soma dos Vetores", resultadoSoma);
		
	}
	
	public static void imprimirVetores(String titulo, int[] vetor) {
		
		System.out.println("\n" + titulo);
		for(int i=0; i < vetor.length; i++) {
			System.out.print(vetor[i]);
			if(i < vetor.length -1) {
				System.out.print(", ");
			}
		}
		
	}
}
