package com.curso.javabasico.exercicioAula14a15.condicional;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double notaUm, notaDois, notaTres, media;
		
		System.out.println("Digite a primeira nota do aluno: ");
		notaUm = teclado.nextDouble();
		
		System.out.println("Digite a segunda nota do aluno: ");
		notaDois = teclado.nextDouble();
		
		System.out.println("Digite a terceira nota do aluno: ");
		notaTres = teclado.nextDouble();
		
		media = (notaUm+notaDois+notaTres)/3;
		
		if(media > 6.0 && media == 7.0) {
			System.out.println("Aprovado");
		}else if(media < 6) {
			System.out.println("Reprovado");
		}else {
			System.out.println("Aprovado com distinção");
		}
		
		teclado.close();
	}
}
