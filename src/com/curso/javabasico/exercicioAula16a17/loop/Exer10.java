package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int valorUm;
		int valorDois;
		
		System.out.println("Entre com um valor: ");
		valorUm = teclado.nextInt();
		
		System.out.println("Entre com outro valor");
		valorDois = teclado.nextInt();
		
		for(int i = valorUm; i <= valorDois; i++ ) {
			System.out.print(i+ ", ");
		}
		
		teclado.close();
	}
}
