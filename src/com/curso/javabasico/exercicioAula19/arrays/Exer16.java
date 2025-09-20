package com.curso.javabasico.exercicioAula19.arrays;

public class Exer16 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[] {1, 2, 3, 4, 5, 15, 15, 20, 50, 100, 201};
		
		int somaAbaixoDeQuinze =0, somaAcimaDeQuinze =0, valoresIguaisQuize =0, contValorAcimaDeQuinze =0;
		double media;
		
		for(int i=0; i < vetorA.length; i++) {
			
			if(vetorA[i] < 15) {
				somaAbaixoDeQuinze += vetorA[i];
			}
			
			if(vetorA[i] == 15) {
				valoresIguaisQuize ++;
			}
			
			if(vetorA[i] > 15) {
				contValorAcimaDeQuinze ++;
				somaAcimaDeQuinze += vetorA[i];
			}
			
		}
		
		media  = mediaDosValoresAcimaDeQuinze(contValorAcimaDeQuinze, somaAcimaDeQuinze);
		
		imprimirValores(somaAbaixoDeQuinze, valoresIguaisQuize, media, vetorA);
		
	}
	
	public static double mediaDosValoresAcimaDeQuinze(int contValoreAcimaDeQuinze, int somaAcimaDeQuinze) {
		
		return somaAcimaDeQuinze / contValoreAcimaDeQuinze; 
		
	}
	
	public static void imprimirValores(int somaAbaixoDeQuinze, int valoresIguaisQuinze, double mediaValoresAcimaDeQuinze, int[] vetor) {
		
		System.out.println("Itens do vetor");
		for(int i=0; i < vetor.length; i++) {
			System.out.print(vetor[i]);
			if(i < vetor.length -1 ) {
				System.out.print(", ");
			}
		}
		
		System.out.println("\n\nSoma dos valores abaixo de Quize: "+somaAbaixoDeQuinze);
		System.out.println("\nQuantidade de valores iguais a Quinze: "+valoresIguaisQuinze);
		System.out.println("\nMedia de valores acima de Quinze: "+mediaValoresAcimaDeQuinze);
	}
}
