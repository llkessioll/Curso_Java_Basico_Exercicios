package com.curso.javabasico.exercicioAula14a15.condicional;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String turno = "";
		
		System.out.println("Qual seu turno de estudo");
		System.out.println("M-matutino - V-vespertino - N-noturno");
		turno = teclado.next();
		
		switch(turno) {
			
			case "m":
				System.out.println("Bom dia");
				break;
			case "v":
				System.out.println("Boa tarde");
				break;
			case "n":
				System.out.println("Boa noite");
				break;
			default:
				System.out.println("O turno informado não existe");
		}
		
		teclado.close();
	}
}
