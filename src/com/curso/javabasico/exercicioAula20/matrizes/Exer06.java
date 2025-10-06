package com.curso.javabasico.exercicioAula20.matrizes;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String[][] tabuleiro = new String[3][3];
		
		String jogadorUm = "O";
		String jogadorDois = "X";
		
		int linha, coluna, numerosDeJogadas = 1;
		
		for(int i =0; i < tabuleiro.length; i++) {
			
			for(int j =0; j < tabuleiro[i].length; j++) {
				tabuleiro[i][j] = "*";
			}
		}
		
		while(true) {
			
			System.out.println("============= JOGO DA VELHA =============");
			System.out.println("Jogador UM = O");
			System.out.println("Jogador DOIS = X");
			
			for(int i =0; i < tabuleiro.length; i++) {
				
				for(int j =0; j < tabuleiro[i].length; j++) {
					System.out.print("["+tabuleiro[i][j]+"]");
				}
				System.out.println();
			}
			
			if( numerosDeJogadas % 2 == 0) {
				System.out.println("Vez do jogador DOIS");
				
				System.out.println("Entre com o numero da linha: ");
				linha = teclado.nextInt();
				while(linha < 0 || linha > 2) {
					System.out.println("Erro: A linha deve conter valores entre 0 e 2 - Digite o número da linha novamente");
					linha = teclado.nextInt() -1;
				}
				
				System.out.println("Entre com o número da coluna: ");
				coluna = teclado.nextInt();
				while(coluna < 0 || coluna > 2) {
					System.out.println("Erro: A coluna dever conter valores entre 0 e 2 - Digite o número da coluna novamente");
					coluna = teclado.nextInt() -1;
				}
				
				if(tabuleiro[linha][coluna].equals("O") || tabuleiro[linha][coluna].equals("X")) {
					System.out.println("Essa linha e coluna já foi utilizada escolha outras");
				}else {
					
					tabuleiro[linha][coluna] = jogadorDois;
					numerosDeJogadas ++;
				}
				
				
			}else {
				System.out.println("Vez do jogador UM");
				
				System.out.println("Entre com o numero da linha: ");
				linha = teclado.nextInt();
				while(linha < 0 || linha > 2) {
					System.out.println("Erro: A linha deve conter valores entre 0 e 2 - Digite o número da linha novamente");
					linha = teclado.nextInt();
				}
				
				System.out.println("Entre com o número da coluna: ");
				coluna = teclado.nextInt();
				while(coluna < 0 || coluna > 2) {
					System.out.println("Erro: A coluna dever conter valores entre 0 e 2 - Digite o número da coluna novamente");
					coluna = teclado.nextInt();
				}
				
				if(tabuleiro[linha][coluna].equals("O") || tabuleiro[linha][coluna].equals("X")) {
					System.out.println("Essa linha e coluna já foi utilizada escolha outras");
				}else {
					
					tabuleiro[linha][coluna] = jogadorUm;
					numerosDeJogadas ++;
				}
			}
			
			if(numerosDeJogadas > 8) {
				
				System.out.println("JOGO EMPATADO !!!");
				break;
				
			}else if(tabuleiro[0][0].equals("O") && tabuleiro[0][1].equals("O") && tabuleiro[0][2].equals("O") ||//linha 1
				     tabuleiro[1][0].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[1][2].equals("O") ||//linha 2
				     tabuleiro[2][0].equals("O") && tabuleiro[2][1].equals("O") && tabuleiro[2][2].equals("O") ||//linha 3
				     tabuleiro[0][0].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[2][2].equals("O") ||//diagonal 1
				     tabuleiro[0][2].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[2][0].equals("O") ||//diagonal 2
				     tabuleiro[0][0].equals("O") && tabuleiro[1][0].equals("O") && tabuleiro[2][0].equals("O") ||//coluna 1
				     tabuleiro[0][1].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[2][1].equals("O") ||//coluna 2
				     tabuleiro[0][2].equals("O") && tabuleiro[1][2].equals("O") && tabuleiro[2][2].equals("O") /*coluna 3*/){
				
				System.out.println("JOGADOR (UM) GANHOU !!!");
				break;
				
			}else if( tabuleiro[0][0].equals("X") && tabuleiro[0][1].equals("X") && tabuleiro[0][2].equals("X") ||//linha 1
					  tabuleiro[1][0].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[1][2].equals("X") ||//linha 2
					  tabuleiro[2][0].equals("X") && tabuleiro[2][1].equals("X") && tabuleiro[2][2].equals("X") ||//linha 3
					  tabuleiro[0][0].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[2][2].equals("X") ||//diagonal 1
					  tabuleiro[0][2].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[2][0].equals("X") ||//diagonal 2
					  tabuleiro[0][0].equals("X") && tabuleiro[1][0].equals("X") && tabuleiro[2][0].equals("X") ||//coluna 1
					  tabuleiro[0][1].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[2][1].equals("X") ||//coluna 2
					  tabuleiro[0][2].equals("X") && tabuleiro[1][2].equals("X") && tabuleiro[2][2].equals("X") /*coluna 3*/ ){
				
				System.out.println("JOGADOR (DOIS) GANHOU !!!");
				break;
			}
			
		}
		
		teclado.close();
	}
}
