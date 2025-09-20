package com.curso.javabasico.exercicioAula19.arrays;

public class Exer30 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[] {1, 2, 3, 4, 5, 6, 7,8 , 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		int[] vetorB = new int[10];
		int[] vetorC = new int[vetorB.length];
		
		for(int i=0; i < vetorA.length; i++) {
			
			if(i < vetorB.length) {
				if(vetorA[i] % 2 ==0) {
					vetorB[i] = vetorA[i];
				}
			}else{
				
				if(vetorA[i] % 2 != 0) {
					vetorC[i-vetorB.length] = vetorA[i];
				}
				
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
