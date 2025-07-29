package com.curso.javabasico.exercicioAula14a15.condicional;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Digite um valor numerico: ");
		valor = teclado.nextInt();
		
		if(valor % 2 == 0) {
			System.out.println("O valor informado e PAR");
		}else {
			System.out.println("O valor informado e IMPAR");
		}
		
		teclado.close();
	}
}
