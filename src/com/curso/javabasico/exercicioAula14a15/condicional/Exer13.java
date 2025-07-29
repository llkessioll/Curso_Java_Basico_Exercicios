package com.curso.javabasico.exercicioAula14a15.condicional;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor entre 1 e 7");
		int dia = teclado.nextInt();
		
		switch(dia) {
			
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda");
				break;
			case 3:
				System.out.println("Terca");
				break;
			case 4:
				System.out.println("Quarta");
				break;
			case 5:
				System.out.println("Quinta");
				break;
			case 6:
				System.out.println("Quinta");
				break;
			case 7:
				System.out.println("Sexta");
				break;
			default:
				System.out.println("Dia da semana invalido");
		}
		
		teclado.close();
	}
}
