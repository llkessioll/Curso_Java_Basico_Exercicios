package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int qtdEleitores =0, candidatoUm =0, candidatoDois =0, candidatoTres =0, nullos =0, opcao;
		
		System.out.println("Digite a quantidade de eleitores para votar");
		qtdEleitores = teclado.nextInt();
		
		while(qtdEleitores <=0 ) {
			System.out.println("A quantidade de eleitores deve ser acima de 0");
			qtdEleitores = teclado.nextInt();
		}
		
		System.out.println("Escolha um número entre 1, 2 e 3 para votar no candidato escolhido: ");
		for(int i=0; i < qtdEleitores; i++) {
			
			System.out.print("Entre com o "+(i+1)+"º voto: ");
			opcao = teclado.nextInt();
			
			while(opcao <= 0 || opcao > 3) {
				System.out.println("Entre com um valor entre 1 e 3");
				opcao = teclado.nextInt();
			}
			
			switch(opcao) {
			
				case 1:
					candidatoUm++;
					break;
				case 2:
					candidatoDois++;
					break;
				case 3:
					candidatoTres++;
					break;
				default:
					nullos++;
					
			}
			
			/*if(opcao == 1) {
				candidatoUm++;
			}else if(opcao == 2) {
				candidatoDois++;
			}else {
				candidatoTres++;
			}*/
			
		}
		
		System.out.println("====================Resultado===============");
		System.out.println("Candidato UM -> "+candidatoUm);
		System.out.println("Candidato DOIS -> "+candidatoDois);
		System.out.println("Candidato TRES -> "+candidatoTres);
		System.out.println("Nulos -> "+nullos);
		
		teclado.close();
	}
}
