package com.curso.javabasico.exercicioAula14a15.condicional;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double notaUm, notaDois, media;
		
		System.out.println("Digite a primeira nota: ");
		notaUm = teclado.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		notaDois = teclado.nextDouble();
		
		media = (notaUm+notaDois)/2;
		
		if(media == 10) {
			System.out.println("Reprovado com Distinção");
		}else if(media >= 7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
		teclado.close();
	}
}
