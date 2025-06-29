package com.curso.javabasico.exercicioAula11a13;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com o valor da base: ");
		double base = teclado.nextDouble();
		
		System.out.println("Entre com o valor da altura: ");
		double altura = teclado.nextDouble();
		
		double area = base*altura;
		
		System.out.println("A area do quadrado e : "+ area);
		System.out.println("O doblo do valor da area e: "+area*area);
		
		teclado.close();
	}
}
