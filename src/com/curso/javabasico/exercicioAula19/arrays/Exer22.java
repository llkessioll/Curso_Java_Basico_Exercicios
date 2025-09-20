package com.curso.javabasico.exercicioAula19.arrays;

public class Exer22 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		double porcentamgemUns =0, porcentagemZeros =0;
		
		for(int i=0; i < vetorA.length; i++) {
			
			vetorA[i] = (int)Math.round(Math.random()*1);
			
		}
		
		porcentamgemUns = porcentagemValor(vetorA, 1);
		porcentagemZeros = porcentagemValor(vetorA, 0);
		
		imprimirValores(vetorA, porcentamgemUns, porcentagemZeros);
		
	}
	
	public static double porcentagemValor(int[] vetor, int num) {
		
		int qtdNumeros =0;
		
		for(int i=0; i < vetor.length; i++) {
			if(vetor[i] == num) {
				qtdNumeros ++;
			}
		}
		
		return (qtdNumeros * 100)/vetor.length;
	}
	
	
	public static void imprimirValores(int[] vetor, double porcentagemUns, double porcentagemZeros) {
		
		System.out.println("Itens do vetor");
		for(int i=0; i < vetor.length; i++) {
			System.out.print(vetor[i]);
			if(i < vetor.length -1) {
				System.out.print(", ");
			}
		}
		
		System.out.println("\n\nA porcentagem de Uns no vetor e: "+porcentagemUns+"%");
		System.out.println("\nA porcentagem de Zeros no vetor e: "+porcentagemZeros+"%");
		
	}
}
