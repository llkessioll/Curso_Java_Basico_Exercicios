package com.curso.javabasico.exercicioAula14a15.condicional;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma letra qualquer");
		char letra = teclado.next().charAt(0);
		
		switch(letra){
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':System.out.println("A letra informada e uma vogal");
				break;
			default: 
				System.out.println("A letra informada e uma consoante");
		}
		
		teclado.close();
	}
}