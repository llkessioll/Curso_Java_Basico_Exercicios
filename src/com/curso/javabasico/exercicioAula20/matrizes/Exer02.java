package com.curso.javabasico.exercicioAula20.matrizes;

public class Exer02 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[10][10];
		
		int maiorValorLinhaCinco =0, menorValorLinhaCinco = 11;
		int maiorValorColunaSete =0, menorValorColunaSete = 11;
		
		for(int i=0; i < matriz.length; i++) {
			
			for(int j=0; j< matriz[i].length; j++) {
				
				matriz[i][j] = (int) Math.round(Math.random()*9);
				
			}
			
		}
		
		for(int i=0; i < matriz.length; i++) {
			
			if( i == 5 ) {
				for(int j=0; j < matriz[i].length; j++) {
					
					if(maiorValorLinhaCinco < matriz[i][j]) {
						maiorValorLinhaCinco = matriz[i][j];
					}
					
					if(menorValorLinhaCinco > matriz[i][j]) {
						menorValorLinhaCinco = matriz[i][j];
					}
					
				}
			}
		}
		
		for(int i=0; i < matriz.length; i++) {
			
			for(int j =0; j < matriz[i].length; j++) {
				
				if(j == 7) {
					
					if(maiorValorColunaSete < matriz[i][j]) {
						maiorValorColunaSete = matriz[i][j];
					}
					
					if(menorValorColunaSete > matriz[i][j]) {
						menorValorColunaSete = matriz[i][j];
					}
				}
				
			}
			
		}
		
		
		imprimirValores("Itens da matriz", matriz, menorValorLinhaCinco, maiorValorLinhaCinco, menorValorColunaSete, maiorValorColunaSete);
	}
	
	public static void imprimirValores(String titulo, int[][] matriz, int menorValorLinhaCinco, int maiorValorLinhaCinco, int menorValorColunaSete, int maiorValorColunaSete) {
		
		System.out.println("\n"+titulo);
		
		for(int i=0; i < matriz.length; i++) {
			
			System.out.print(i+"º Linha -> ");
			for(int j = 0; j < matriz[i].length; j++) {
				
				System.out.print("["+matriz[i][j]+"]");
				
			}
			
			System.out.println();
			
		}
		
		System.out.println("\nO menor valor da linha 5 e "+menorValorLinhaCinco+" é o maior valor e "+maiorValorLinhaCinco);
		System.out.println("\nO menor valor da coluna 7 e "+menorValorColunaSete+" é o maior valor e "+maiorValorColunaSete);
		
	}
	
}
