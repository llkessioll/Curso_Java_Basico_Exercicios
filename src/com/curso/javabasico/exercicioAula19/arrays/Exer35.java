package com.curso.javabasico.exercicioAula19.arrays;

public class Exer35 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i=0; i < vetorA.length; i++) {
			
			int numero = vetorA[i];
			
			System.out.println("\n["+vetorA[i]+"]");
			
			for(int j=1; j < numero; j++) {
				
				if(numero % j == 0) {
					System.out.print(j);
					if(j < numero){
						System.out.print(", ");
					}
				}
				
			}
			
		}
		
	}
	
}
