package com.curso.javabasico.exercicioAula19.arrays;

public class Exer14 {

	public static void main(String[] args) {
		
		int[] valorA = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int contImpar =0, soma =0;

		double media;
		
		for(int i=0; i < valorA.length; i++) {
			
			if(valorA[i] % 2 != 0) {
				contImpar ++;
				soma += valorA[i];
			}
			
		}
		
		media = soma/contImpar;
		
		imprimirValores("Itens do vetor A", media, valorA, soma);
	}
	
	public static void imprimirValores(String titulo, double media, int[] vetor, int soma) {
		
		System.out.println("\n" + titulo);
		
		for(int i=0; i < vetor.length; i++) {
			System.out.print(vetor[i]);
			if(i < vetor.length -1) {
				System.out.print(", ");
			}
		}
		
		System.out.println("\nA soma dos valores IMPARES do vetor e: "+ soma);
		System.out.println("\nA media dos valores IMPARES do vetor e de:" + media);
	}
	
}
