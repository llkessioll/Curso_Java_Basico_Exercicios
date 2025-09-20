package com.curso.javabasico.exercicioAula19.arrays;

public class Exer08 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] vetorB = new int[] {5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		
		int[] resultado = new int[vetorA.length];
		
		for(int i =0; i < vetorA.length; i++) {
			resultado[i] = vetorA[i] * vetorB[i];
		}
		
		imprimirVetores("Itens do vetor A", vetorA);
		imprimirVetores("Itens do vetor B", vetorB);
		imprimirVetores("Resultado da multiplicação de A e B", resultado);
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
