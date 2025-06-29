package com.curso.javabasico.exercicioAula11a13;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner teclado  = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero inteiro: ");
		int valorUm = teclado.nextInt();
		
		System.out.println("Digite o segundo numero inteiro: ");
		int valorDois = teclado.nextInt();
		
		System.out.println("Digite um valo real: ");
		double valorReal = teclado.nextDouble();
		
		System.out.println("A - O produto do dobro do primeiro com metade do segundo");
		System.out.println((valorUm*valorUm)+(valorDois/2));
		
		System.out.println("B - A soma do triplo do primeiro com o terceiro");
		System.out.println((valorUm*3)+(valorReal*3));
		
		System.out.println("C - O terceiro elevado ao cubo");
		System.out.println(valorReal*valorReal*valorReal);
		
		teclado.close();
	}
}
