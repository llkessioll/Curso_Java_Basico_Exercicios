package com.curso.javabasico.exercicioAula25a27.Objetos.ClasseseAtributosMetodos;

public class JogoVelha {

	String[][] tabuleiro = new String[3][3];
	
	public void inserirCaracteres() {
		
		for(int i=0; i < tabuleiro.length; i++) {
			for(int j =0; j < tabuleiro[i].length; j++) {
				tabuleiro[i][j] = "-";
			}
		}
	}
	
	public void imprimirTabuleiro() {
		
		for(int i=0; i < tabuleiro.length; i++) {
			for(int j=0; j < tabuleiro[i].length; j++) {
				System.out.print("["+tabuleiro[i][j]+"]");
			}
			System.out.println();
		}
		
	}
	
	public boolean validarJogada(String jogador, int linha, int coluna) {
		
		/*for(int i=0; i < tabuleiro.length; i++) {
			for(int j=0; j < tabuleiro[i].length; j++) {*/
				
				if(tabuleiro[linha][coluna].equals(jogador)) {
					return false;
				/*}
			}*/
		}
		
		return true;
	}
	
	public void jogada(String jogador, int linha, int coluna) {
		
		tabuleiro[linha][coluna] = jogador;
		
	}
	
	public String verificarVencedor(String jogador) {
		
		if(tabuleiro[0][0].equals(jogador) && tabuleiro[0][1].equals(jogador) && tabuleiro[0][2].equals(jogador) ||//Linha UM
		   tabuleiro[1][0].equals(jogador) && tabuleiro[1][1].equals(jogador) && tabuleiro[1][2].equals(jogador) ||//linha DOIS
		   tabuleiro[2][0].equals(jogador) && tabuleiro[2][1].equals(jogador) && tabuleiro[2][2].equals(jogador) ||//linha TRES
		   tabuleiro[0][0].equals(jogador) && tabuleiro[1][0].equals(jogador) && tabuleiro[2][0].equals(jogador) ||//coluna UM
		   tabuleiro[0][1].equals(jogador) && tabuleiro[1][1].equals(jogador) && tabuleiro[2][1].equals(jogador) ||//coluna DOIS
		   tabuleiro[0][2].equals(jogador) && tabuleiro[1][2].equals(jogador) && tabuleiro[2][2].equals(jogador) ||//Coluna TRES
		   tabuleiro[0][0].equals(jogador) && tabuleiro[1][1].equals(jogador) && tabuleiro[2][2].equals(jogador) ||//Diagonal Um
		   tabuleiro[0][2].equals(jogador) && tabuleiro[1][1].equals(jogador) && tabuleiro[2][0].equals(jogador) //Diagonal DOIS
		   ) {
			return jogador;
		}
		return "n";
	}
}
