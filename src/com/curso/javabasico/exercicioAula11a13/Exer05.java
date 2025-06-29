package com.curso.javabasico.exercicioAula11a13;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor em metros:");
		double metros = teclado.nextDouble();
		
		double centimetros = metros * 100;
		
		System.out.println("Os "+metros+" metros convertidos para centimentos sao: "+centimetros);
		
		teclado.close();
		
	}
}
