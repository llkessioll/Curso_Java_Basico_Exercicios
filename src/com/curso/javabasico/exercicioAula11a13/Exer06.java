package com.curso.javabasico.exercicioAula11a13;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double PI = 3.14;
		
		System.out.println("Digite o valor do raio do circulo: ");
		double raio = teclado.nextDouble();
		
		double area = PI*(raio*raio);
		
		System.out.println("A area do circulo e : "+area);
		
		teclado.close();
	}
}
