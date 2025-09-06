package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int valorEntrada;
		boolean ePrimo = true;
		
		System.out.println("Entre com um valor para saber se e primo");
		valorEntrada = teclado.nextInt();
		
		if(valorEntrada < 2) {
			System.out.println("O valor informado não é PRIMO");
		}else if( valorEntrada == 2) {
			System.out.println("O valor informado é PRIMO");
		}else {
			
			for(int i =2 ; i < valorEntrada; i++) {
				if (valorEntrada % i == 0) {
					ePrimo = false;
				}
			}
			
			if(ePrimo) {
				System.out.println("O valor informado é PRIMO");
			}else {
				System.out.println("O valor informado não é PRIMO");
			}
		}
		
		teclado.close();
	}
}
