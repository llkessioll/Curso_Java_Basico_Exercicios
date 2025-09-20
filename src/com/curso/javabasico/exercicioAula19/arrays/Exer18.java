package com.curso.javabasico.exercicioAula19.arrays;

public class Exer18 {

	public static void main(String[] args) {
		
		int[] idades = new int[] {10, 18, 5, 16, 22, 15, 66, 55, 39, 74};
		
		int posicaoMenorIdade =0, menorIdade =150;
		int posicaoMaiorIdade =0, maiorIdade =0;
		
		for(int i=0; i < idades.length; i++) {
			
			if(idades[i] < menorIdade) {
				menorIdade = idades[i];
				posicaoMenorIdade = i;
			}
			
			if(idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				posicaoMaiorIdade = i;
			}
			
		}
		
		imprimirValores(idades, maiorIdade, menorIdade, posicaoMaiorIdade, posicaoMenorIdade);
		
	}
	
	public static void imprimirValores(int[] vetor, int maiorIdade, int menorIdade, int posicaoMaiorIdade, int posicaoMenorIdade) {
		
		System.out.println("Itens do vetor");
		for(int i=0; i < vetor.length; i++) {
			System.out.print(vetor[i]);
			if(i < vetor.length -1) {
				System.out.print(", ");
			}
		}
		
		System.out.println("\nA maior idade do vetor e: "+maiorIdade);
		System.out.println("\nA Posição da Maior idade no vetor é: "+posicaoMaiorIdade);
		System.out.println("\nA menor idade do vetor é:"+menorIdade);
		System.out.println("\nA Posição da Menor idade no vetor é: "+posicaoMenorIdade);
	}
	
}
