package com.curso.javabasico.exercicioAula19.arrays;

import java.util.Scanner;

public class Exer20e21 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double[] vetorA = new double[20];
		
		double valorDolar;
		
		System.out.println("Digite o catação do dolar: ");
		valorDolar = teclado.nextDouble();
		while( valorDolar <= 0) {
			System.out.println("Erro: Cotação do dolar não poder ser inferior a 0: Digite novamente");
			valorDolar = teclado.nextDouble();
		}
		
		for(int i=0; i < vetorA.length; i++) {
			
			vetorA[i] = valorDolar * i;
			
		}
		
		imprimirValores(vetorA);
		
		teclado.close();
	}
	
	public static void imprimirValores(double[] vetor) {
		
		System.out.println("Cotação do dolar:");
		for(int i=0; i < vetor.length; i++) {
			System.out.print(vetor[i]);
			if(i < vetor.length -1) {
				System.out.print(", ");
			}
		}
		
	}
}
