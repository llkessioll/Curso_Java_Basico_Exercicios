package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		
		//Criar um objeto scanner para podermos entrar com dados pelo teclado
		Scanner teclado = new Scanner(System.in);
		
		//Váriaveis principais
		int qtdCds;
		double valorCd, valorColecao =0;
		
		//Entrada da quantidade de CD's da coleção
		System.out.println("Entre com a quantidade de CD's da coleção\nSomente valores acima de 1 são aceitos");
		qtdCds = teclado.nextInt();
		
		//Validação para que a coleção tenha pelo menos 1 cd
		while(qtdCds <=0 ) {
			System.out.println("A coleção deve ter pelo menos 1 CD");
			qtdCds = teclado.nextInt();
		}
		
		//Loop para entrada do valor de cada CD
		for(int i=0; i< qtdCds; i++) {
			
			System.out.print("Digite o valor do "+(i+1)+ "º CD -> ");
			valorCd = teclado.nextDouble();
			
			//Validação para que o preço do CD não seja 0 ou menor
			while(valorCd <=0 ) {
				System.out.println("O valor de um CD não deve ser menor ou igual a 0");
				valorCd = teclado.nextDouble();
			}
			
			//Soma dos valores de cada CD
			valorColecao += valorCd;
		}
		
		//Exibe o valor gasto na coleção é a média de preço dos CD's
		System.out.println("A coleção possui: ("+qtdCds+") CD's");
		System.out.println("Valor total gasto na coleção -> R$: "+valorColecao);
		System.out.println("Valor medio gasto em cada CD -> R$: "+(valorColecao/qtdCds));
		
		teclado.close();
	}
}
