package com.curso.javabasico.exercicioAula19.arrays;

public class Exer31 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[] {1, 2, 3, 4, 5, 6, 7,8 , 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i < vetorA.length; i++) {
			
			if(i < vetorA.length / 2 ) {
				if( vetorA[i] % 2 == 0) {
					vetorB[i] = vetorA[i];
				}
			}else {
				if(vetorA[i] % 2 != 0) {
					vetorB[i] = vetorA[i];
				}
				
			}
			
		}
		
		imprimirValores("Itens do Vetor A", vetorA);
		imprimirValores("Itens do Vetor B", vetorB);
	}
	
	public static void imprimirValores(String titulo, int[] vetor) {
		
		System.out.println("\n"+titulo);
		
		for(int i=0; i < vetor.length; i++) {
			System.out.print(vetor[i]);
			
			if(i < vetor.length-1) {
				System.out.print(", ");
			}
		}
	}
}
