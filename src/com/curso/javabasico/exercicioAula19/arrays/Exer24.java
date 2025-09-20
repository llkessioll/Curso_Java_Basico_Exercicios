package com.curso.javabasico.exercicioAula19.arrays;

public class Exer24 {

	public static void main(String[] args) {
		
		int[] vetor = new int[] {1, 2, 3, 3, 2, 1};
		
		boolean ePalindromo;
		
		ePalindromo = palindromo(vetor);
		
		imprimirValores(vetor, ePalindromo);
		
	}
	
	public static boolean palindromo(int[] vetor) {
		
		boolean ePalindromo = true;
		
		for(int i=0; i < vetor.length / 2; i++) {
				
			if( vetor[i] != vetor[vetor.length-1 -i]) {
					
				return false;
			
			}
			
		}
		
		return ePalindromo;
		
	}
	
	public static void imprimirValores(int[] vetor, boolean tipo) {
		
		System.out.println("Itens do vetor");
		for(int i=0; i < vetor.length; i++) {
			
			System.out.print(vetor[i]);
			
			if(i < vetor.length -1) {
				System.out.print(", ");
			}
		}
		
		if(tipo) {
			System.out.println("\nO vetor e PALINDROMO");
		}else {
			System.out.println("\nO vetor não é POLINDROMO");
		}
		
	}
}
