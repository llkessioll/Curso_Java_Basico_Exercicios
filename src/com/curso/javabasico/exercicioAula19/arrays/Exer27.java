package com.curso.javabasico.exercicioAula19.arrays;

public class Exer27 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 , 12, 13};
		char[] vetorB = new char[vetorA.length];
		
		for(int i=0; i < vetorA.length; i++) {
			
			if(vetorA[i] < 7) {
				vetorB[i] = 'a';
			}else if(vetorA[i] == 7) {
				vetorB[i] = 'b';
			}else if(vetorA[i] > 7 && vetorA[i] < 10) {
				vetorB[i] = 'c';
			}else if(vetorA[i] == 10) {
				vetorB[i] = 'd';
			}else {
				vetorB[i] = 'e';
			}
			
		}
		
		System.out.println("Itens do Vetor A");
		for(int i=0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]);
			if(i < vetorA.length -1) {
				System.out.print(", ");
			}
		}
		
		System.out.println("\nItens do Vetor B");
		for(int i=0; i < vetorA.length; i++) {
			System.out.print(vetorB[i]);
			if(i < vetorA.length -1) {
				System.out.print(", ");
			}
		}
		
	}
	
}
