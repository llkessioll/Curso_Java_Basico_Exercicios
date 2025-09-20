package com.curso.javabasico.exercicioAula19.arrays;

public class Exer10 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i < vetorA.length; i++) {
			
			vetorB[i] = vetorA[i] % 2;
			
		}
		
		imprimirVetores("Itens do vetor A ", vetorA);
		imprimirVetores("Resultado do vetor A modulo B", vetorB);
		
	}
	
	public static void imprimirVetores(String titulo, int[] vetor) {
		
		System.out.println("\n"+ titulo);
		
		for(int i=0; i < vetor.length; i++) {
			System.out.print(vetor[i]);
			if(i < vetor.length -1) {
				System.out.print(", ");
			}
		}
	}
}
