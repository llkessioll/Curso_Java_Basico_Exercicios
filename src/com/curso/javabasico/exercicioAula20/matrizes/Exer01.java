package com.curso.javabasico.exercicioAula20.matrizes;

public class Exer01 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[4][4];
		
		int linha =0, coluna =0, maiorValor =0;
		
		for(int i=0; i < matriz.length; i++) {
			
			for(int j=0; j < matriz[i].length; j++) {
				
				matriz[i][j] = (int) Math.round(Math.random()*9);
				
			}
			
		}
		
		for(int i=0; i < matriz.length; i++) {
			
			for(int j=0; j < matriz[i].length; j++) {
				
				if(maiorValor < matriz[i][j]) {
					maiorValor = matriz[i][j];
					coluna = j;
					linha = i;
				}
				
			}
		}
		
		imprimirValores(matriz, "Itens da matriz", linha, coluna);
		
	}
	
	public static void imprimirValores(int[][] matriz, String titulo, int linha, int coluna) {
		
		System.out.println(titulo);
		
		for(int i=0; i < matriz.length; i ++) {
			
			for(int j=0; j < matriz[i].length; j++) {
				
				System.out.print("["+matriz[i][j]+"] ");
				
			}
			System.out.println();
		}
		
		System.out.println("O maior valor da matriz esta na linha "+linha+" e na coluna "+coluna);
	}
}
