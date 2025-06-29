package com.curso.javabasico.exercicioAula11a13;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a altura desejada: ");
		double altura = teclado.nextDouble();
		
		double pesoIdeal = (72.7*altura) - 58;
		
		System.out.println("O peso ideal para sua altura e: "+pesoIdeal);
		
		teclado.close();
	}
}
