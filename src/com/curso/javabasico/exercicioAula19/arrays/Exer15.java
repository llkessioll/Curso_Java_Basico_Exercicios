package com.curso.javabasico.exercicioAula19.arrays;

public class Exer15 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};
		
		int contPares =0, contImpares =0;
		double porcentagemPares, porcentagemImpares;
		
		for(int i=0; i < vetorA.length; i++) {
			
			if(vetorA[i] % 2 == 0) {
				contPares ++;
			}else {
				contImpares ++;
			}
			
		}
		
		porcentagemPares = (contPares *100)/vetorA.length;
		porcentagemImpares = (contImpares * 100) / vetorA.length;
		
		imprimirValores("Itens do vetor", vetorA, porcentagemPares, porcentagemImpares);
		
		
	}
	
	public static void imprimirValores(String titulo, int[] vetor, double porcentagemPar, double porcentagemImpar) {
		
		System.out.println("\n" + titulo);
		
		for(int i=0; i < vetor.length; i++) {
			
			System.out.print(vetor[i]);
			if(i < vetor.length -1) {
				System.out.print(", ");
			}
			
		}
		
		System.out.println("\nA porcentagem de numeros peres no array e: %"+porcentagemPar);
		System.out.println("\nA porcentagem de numeros impares no array e: %"+porcentagemPar);
	}
}
