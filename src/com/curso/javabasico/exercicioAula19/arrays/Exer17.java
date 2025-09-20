package com.curso.javabasico.exercicioAula19.arrays;

public class Exer17 {

	public static void main(String[] args) {
		
		int[] idades = new int[] {10, 16, 30, 37, 55, 76, 49, 66, 90, 39};
		
		int obterIdades;
		
		obterIdades = pessoasAcimaDeTrintaECinco(idades);
		
		imprimirValores(idades, obterIdades);
	}
	
	public static int pessoasAcimaDeTrintaECinco(int[] vetor) {
		
		int contagem =0;
		
		for(int i=0; i < vetor.length; i++) {
			
			if(vetor[i] > 35) {
				contagem ++;
			}
			
		}
		
		return contagem;
	}
	
	public static void imprimirValores(int[] vetor, int qtdPessoasAcimaDeTrintaeCinco) {
		
		System.out.println("Itens do vetor");
		for(int i=0; i < vetor.length; i++) {
			System.out.print(vetor[i]);
			if(i < vetor.length -1) {
				System.out.print(", ");
			}
		}
		
		System.out.println("\nA quantidade de pessoas com idade acima de trinta e cinco anos e: "+qtdPessoasAcimaDeTrintaeCinco);
	}
}
