package com.curso.javabasico.exercicioAula11a13;

import java.util.Scanner;

public class Exer02 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor numerico: ");
		int numero = teclado.nextInt();
		
		System.out.println("O valor digitado foi: "+numero);
		
		teclado.close();
	}
}
