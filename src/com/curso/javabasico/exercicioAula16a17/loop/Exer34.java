package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer34 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int entrada;
		boolean ePrimo = true;
		
		System.out.println("Números primos");
		
		System.out.println("Entre com um valor inteiro e positivo");
		entrada = teclado.nextInt();
		
		while(entrada <= 0) {
			System.out.println("Apenas valores positivos e inteiros digite novamente");
			entrada = teclado.nextInt();
		}
		
		if(entrada < 2) {
			System.out.println("Não há números primos para essa entrada");
		}else {
			
			for(int i=2; i < entrada; i++) {
				if(entrada % i == 0) {
					ePrimo = false;
				}
			}
			
		}
		
		if(ePrimo) {
			System.out.println("Valor inserido é PRIMO");
		}else {
			System.out.println("Valor inserido não é PRIMO");
		}
		
		teclado.close();
	}
}
