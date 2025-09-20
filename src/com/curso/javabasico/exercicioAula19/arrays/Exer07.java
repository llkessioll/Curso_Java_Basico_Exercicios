package com.curso.javabasico.exercicioAula19.arrays;

public class Exer07 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[] {3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int[] vetorB = new int[] {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		int[] resultado = new int[vetorA.length];
		
		for(int i=0; i < vetorA.length; i++) {
			resultado[i] = vetorB[i] - vetorA[i];
		}
		
		imprimirVetores("Itens do Vetor A", vetorA);
		imprimirVetores("Itens do vetor B", vetorB);
		imprimirVetores("Resultado da subtração de B e A", resultado);
		
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
