package com.curso.javabasico.exercicioAula19.arrays;

public class Exer36 {

	public static void main(String[] args) {
		
		int[] vetor = new int[11];
		
		for(int i=0; i < vetor.length; i++) {
			
			//vetor[i] = (int) Math.pow(2, i);
			vetor[i] = (int) Math.pow(2, i);
			
		}
		
		System.out.println("Itens do vetor");
		System.out.println("Cada elemento do vetor e inserido elevando 2 a potencia do seu indice ex: 2^i");
		for(int j=0; j < vetor.length; j++) {
			
			System.out.print(vetor[j]+", ");
			
		}
		
	}
	
}
