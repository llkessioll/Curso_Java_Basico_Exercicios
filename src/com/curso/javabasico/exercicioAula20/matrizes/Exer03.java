package com.curso.javabasico.exercicioAula20.matrizes;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		
		int pares =0, impares =0;
		
		for(int i=0; i < matriz.length; i++) {
			
			for(int j=0; j < matriz[i].length; j++) {
				
				System.out.println("Entre com os valores da linha "+i+" : ");
				matriz[i][j] = teclado.nextInt();
			}
		}
		
		pares = qtdValores(matriz, 1);
		impares = qtdValores(matriz, 2);
		
		imprimirValores("Itens da matriz", matriz, pares, impares);
		
		teclado.close();
	}
	
	public static int qtdValores(int[][] matriz, int sinal) {
		
		int contagem =0;
		
		for(int i=0; i < matriz.length; i++) {
			
			for(int j =0; j < matriz[i].length; j++) {
				
				if(sinal == 1) {
					if(matriz[i][j] % 2 == 0) {
						contagem++;
					}
				}else{
					if(matriz[i][j] % 2 != 0)
					contagem++;
				}
				
			}
		}
		
		return contagem;
	}
	
	public static void imprimirValores(String titulo, int[][] matriz, int qtdPares, int qtdImpares) {
		
		System.out.println("\n"+titulo);
		
		for(int i=0; i < matriz.length; i++) {
			
			for(int j =0; j < matriz[i].length; j++) {
				
				System.out.print("["+matriz[i][j]+"]");
				
			}
			
			System.out.println();
		}
		
		System.out.println("\nA quantidade de valores pares e de : "+qtdPares);
		System.out.println("\nA quantidade de valores impares e de : "+qtdImpares);
	}
}
