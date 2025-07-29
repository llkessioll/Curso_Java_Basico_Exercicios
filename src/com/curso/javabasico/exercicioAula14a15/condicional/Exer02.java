package com.curso.javabasico.exercicioAula14a15.condicional;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int valor = 0;
		
		System.out.println("Digite um valor");
		valor = teclado.nextInt();
		
		if( valor > 0) {
			System.out.println("O valor informado é: POSITIVO");
		}else if(valor == 0) {
			System.out.println("O valor informado é: ZERO");
		}else {
			System.out.println("O valoe informado é: NEGATIVO");
		}
	
		teclado.close();
	}
}
