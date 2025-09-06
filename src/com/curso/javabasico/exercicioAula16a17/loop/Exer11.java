package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int valorUm, valorDois, soma =0;
		
		
		System.out.println("Entre com um valor: ");
		valorUm = teclado.nextInt();
		
		System.out.println("Entre com outro valor: ");
		valorDois = teclado.nextInt();
		
		for(int i = valorUm; i <= valorDois; i++) {
			
			soma += i;
			
			System.out.print(i+", ");
			
		}
		
		System.out.println();
		System.out.println("A soma total dos valores impressos e: "+soma);
		
		teclado.close();
	}
}
