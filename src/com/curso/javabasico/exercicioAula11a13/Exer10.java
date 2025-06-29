package com.curso.javabasico.exercicioAula11a13;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double temperaturaCelsius = teclado.nextDouble();
		
		double farenheit = (temperaturaCelsius*9/5)+32;
		
		System.out.println("Convertidos para Farenheit fica: "+farenheit);
		
		teclado.close();
	}
}
