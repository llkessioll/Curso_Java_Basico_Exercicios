package com.curso.javabasico.exercicioAula19.arrays;

public class Exer12 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int soma =0;
		
		for(int i=0; i < vetorA.length; i++) {
			
			soma += vetorA[i];
			
		}
		
		impresaoDeValores("Itens do vetor", vetorA, soma);
	}
	
	public static void impresaoDeValores(String titulo, int[] vetor, int resultado) {
		
		System.out.println("\n" + titulo);
		
		for(int i=0; i < vetor.length; i++) {
			System.out.print(vetor[i]);
			if(i < vetor.length -1) {
				System.out.print(", ");
			}
		}
		
		System.out.println("\nA soma dos valores do Array e de: "+ resultado);
	}
}
