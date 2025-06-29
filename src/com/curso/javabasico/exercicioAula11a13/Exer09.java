package com.curso.javabasico.exercicioAula11a13;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com a temperatura em Farenheit");
		double grausFarenheit = teclado.nextDouble();
		
		double celsius = (5*(grausFarenheit-32)/9);
		
		System.out.println("Convertidos para celsius fica: "+celsius);
		
		teclado.close();
	}
}
