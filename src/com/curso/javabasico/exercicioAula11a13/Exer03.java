package com.curso.javabasico.exercicioAula11a13;

import java.util.Scanner;

public class Exer03 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro valor: ");
		int valorUm = teclado.nextInt();
		System.out.println("Entre com o segundo valor: ");
		int valorDois = teclado.nextInt();
		
		int soma = valorUm + valorDois;
		
		System.out.println("A soma dos valores digitados e :"+soma);
		
		teclado.close();
	}
}
