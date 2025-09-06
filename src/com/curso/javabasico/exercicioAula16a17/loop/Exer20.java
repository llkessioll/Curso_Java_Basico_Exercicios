package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor, resultado =1;
		char opcao ;
		
		do {
			
			System.out.println("Digite um valor entre 0 e 16 para calcular o factorial");
			valor = teclado.nextInt();
			
			while(valor < 0 || valor > 16) {
				System.out.println("Digite um valor positivo maior ou igual a 0 e menor que 16");
				valor = teclado.nextInt();
			}
			
			if(valor == 0 || valor == 1) {
				System.out.println(valor+"! = 1");
				System.out.println(valor+"! = "+resultado);
			}else {
				
				for(int i=valor; i > 0; i-- ) {
					resultado *= i;
				}
				
				System.out.println(valor+"! = "+resultado);
			}
			
			System.out.println("Deseje calcular outro factorial (s-Sim/n-Não)");
			opcao = teclado.next().toLowerCase().charAt(0);
			
			if(opcao != 's') {
				break;
			}else {
				resultado = 1;
				opcao = ' ';
			}
			
		}while(true);
		
		teclado.close();
	}
}
