package com.curso.javabasico.exercicioAula19.arrays;

public class Exer33 {

	public static void main(String[] args) {
		
		int[] vetor = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i=0; i < vetor.length; i++) {
			
			int numero = vetor[i];
			boolean ePrimo = true;
			
			if( numero < 2) {
				ePrimo = false;
			}else {
				
				for(int j=2; j < numero; j++) {
					
					if(numero % j ==0) {
						ePrimo = false;
						break;
					}
					
				}
				
			}
			
			if(ePrimo) {
				System.out.println(numero+ " é Primo");
			}else {
				System.out.println(numero+" não é Primo");
			}
			
		}
		
	}
}
