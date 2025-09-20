package com.curso.javabasico.exercicioAula19.arrays;

public class Exer29 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[] {1, 2, 3, 4, 5, 6, 7,8 , 9, 10};
		int[] vetorB = new int[] {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		int[] vetorC = new int[vetorA.length+vetorB.length];
		
		
		for(int i=0; i < vetorC.length; i++) {
			
			if(i < vetorA.length) {
				vetorC[i] = vetorA[i];
			}else {
				vetorC[i] = vetorB[i-vetorA.length];
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
