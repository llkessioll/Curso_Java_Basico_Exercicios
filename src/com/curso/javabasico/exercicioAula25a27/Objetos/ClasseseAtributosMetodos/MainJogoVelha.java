package com.curso.javabasico.exercicioAula25a27.Objetos.ClasseseAtributosMetodos;

import java.util.Scanner;

public class MainJogoVelha {

	public static void main(String[] args) {
		
		JogoVelha jogo = new JogoVelha();
		
		Scanner teclado = new Scanner(System.in);
		
		int cont = 0, linha, coluna;
		
		boolean jogadaValida;
		
		String jogadorUm = "X";
		String jogadorDois = "O";
		String jogador;
		String ganhador;
		
		System.out.println("---------- JOGO DA VELHA ----------");
		
		jogo.inserirCaracteres();
		
		while(true) {
			
			System.out.println("JOGADOR 1 - X / JOGADOR 2 - O");
			jogo.imprimirTabuleiro();
			
			if(cont % 2 == 0) {
				System.out.println("Vez do jogador DOIS");
				jogador = "O";
			}else {
				System.out.println("Vez do jogador UM");
				jogador = "X";
			}
			
			if(cont < 9) {
				
				System.out.println("Entre com um valor para a linha: ");
				linha = teclado.nextInt();
				System.out.println("Entre com um  valor para a coluna: ");
				coluna = teclado.nextInt();
				
				jogadaValida = jogo.validarJogada(jogador, linha, coluna);
				
				if(jogadaValida != true) {
					
					System.out.println("A posição informada já foi utilizada !\nEntre com novos valores");
					
				}else {
					
					jogo.jogada(jogador, linha, coluna);
					cont ++;
					
					ganhador = jogo.verificarVencedor(jogador);
					
					if(ganhador.equals("X")) {
						System.out.println("O jogador UM ganhou !!!!");
						break;
					}else if(ganhador.equals("O")) {
						System.out.println("O jogador DOIS ganhou !!!!");
						break;
					}
					
				}
				
			}else {
				System.out.println("Jogo EMPATADO !!!");
				break;
			}
			
			
		}
		
		
	}
	
	
}
