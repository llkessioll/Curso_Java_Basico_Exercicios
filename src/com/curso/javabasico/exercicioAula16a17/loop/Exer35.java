package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer35 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int entrada;
		boolean ePrimo;
		
		System.out.println("Entre com um valor inteiro e positivo");
		entrada = teclado.nextInt();
		
		while(entrada <= 0) {
			System.out.println("Apenas valores inteiros é positivos");
			entrada = teclado.nextInt();
		}
		
		if(entrada < 2) {
			System.out.println("Não há números PRIMOS para essa entrada");
		}else {
			
			System.out.println("Valores PRIMOS de 2 até o valor inserido pelo usuario");

			for(int i=2; i <= entrada; i++) {
				
				ePrimo = true;
				
				for(int y=2; y< i; y++) {
					
					if(i % y ==0) {
						ePrimo = false;
						break;
					}
					
				}
				
				if(ePrimo) {
					System.out.print(i+", ");
				}
				
			}
			
		}
		
		teclado.close();
	}
}
