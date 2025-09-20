package com.curso.javabasico.exercicioAula19.arrays;

public class Exer11 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int contadorPares =0;
		
		for(int i=0; i < vetorA.length; i++) {
			
			if(vetorA[i] % 2 ==0) {
				contadorPares ++;
			}
			
		}
		
		imprimirVetores("Itens do vetor A", vetorA, contadorPares);
		
	}
	
	public static void imprimirVetores(String titulo, int[] vetor, int contador) {
		
		System.out.println("\n"+ titulo);
		
		for(int i=0; i < vetor.length; i++) {
			System.out.print(vetor[i]);
			if(i < vetor.length -1) {
				System.out.print(", ");
			}
		}
		
		System.out.println("\nA quantidade de elementos PARES no array e de: "+contador+ " itens");
	}
}
