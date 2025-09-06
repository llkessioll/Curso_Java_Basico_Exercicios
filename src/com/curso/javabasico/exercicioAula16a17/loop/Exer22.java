package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int valorEntrada;
		boolean ePrimo = true;
		
		System.out.println("Digite um valor inteiro e positivo:");
		valorEntrada = teclado.nextInt();
		
		if(valorEntrada < 2) {
			System.out.println("Não é PRIMO");
		}else if(valorEntrada == 2) {
			System.out.println("É PRIMO");
		}else {
			
			for(int i =2; i < valorEntrada; i++) {
				
				if(valorEntrada % i == 0) {
					System.out.print(i+", ");
					ePrimo = false;
				}
				
			}
		}
		
		if(ePrimo) {
			System.out.println("O valor inserido é PRIMO");
		}else {
			System.out.println("\nO valor inserido não é PRIMO acima esta os numeros divisiveis");
		}
		
		teclado.close();
	}
}
