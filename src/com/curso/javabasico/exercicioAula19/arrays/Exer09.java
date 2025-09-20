package com.curso.javabasico.exercicioAula19.arrays;

public class Exer09 {

	public static void main(String[] args) {
		
		double[] vetorA = new double[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		double[] vetorB = new double[] {3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		
		double[] resultado = new double[vetorA.length];
		
		for(int i =0; i < vetorA.length; i++) {
			resultado[i] = vetorA[i] / vetorB[i];
		}
		
		imprimirVetores("Itens do vetor A", vetorA);
		imprimirVetores("Itens do vetor B", vetorB);
		imprimirVetores("Resultado da divisao de A por B", resultado);
		
	}
	
	public static void imprimirVetores(String titulo, double[] vetor) {
		
		System.out.println("\n" + titulo);
		
		for(int i=0; i < vetor.length; i++) {
			
			System.out.print(vetor[i]);
			
			if(i < vetor.length -1) {
				System.out.print(", ");
			}
			
		}
		
	}
}
