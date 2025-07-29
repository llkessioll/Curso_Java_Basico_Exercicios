package com.curso.javabasico.exercicioAula14a15.condicional;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numUm, numDois;
		
		System.out.println("Digite uma valor: ");
		numUm = teclado.nextInt();
		
		System.out.println("Digite outro valor: ");
		numDois = teclado.nextInt();
		
		if(numUm > numDois) {
			System.out.println("O maior valor e: "+numUm);
		}else {
			System.out.println("O maior valor e: "+numDois);
		}
		
		teclado.close();
		
	}
}
