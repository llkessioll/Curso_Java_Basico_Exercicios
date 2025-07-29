package com.curso.javabasico.exercicioAula14a15.condicional;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner teclado  = new Scanner(System.in);
		
		char sexo;
		
		System.out.println("Digite o sexo F-Feminimo, M-Masculino");
		sexo = teclado.next().charAt(0);
		
		if(sexo == 'f' || sexo == 'F') {
			System.out.println("Feminino");
		}else if(sexo == 'm' || sexo == 'M') {
			System.out.println("Masculino");
		}else {
			System.out.println("Sexo Inválido");
		}
		
		teclado.close();
	}
}