package com.curso.javabasico.exercicioAula14a15.condicional;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int ano;
		
		System.out.println("Digite um ano para saber se ele e bissexto");
		ano = teclado.nextInt();
		
		if((ano % 4 == 0 && ano % 100  != 0) || (ano % 400 == 0 )) {
			System.out.println("O ano informado e BISSEXTO");
		}else {
			System.out.println("O ano informado não é BISSEXTO");
		}
		
		teclado.close();
	}
}
