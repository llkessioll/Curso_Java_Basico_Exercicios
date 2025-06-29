package com.curso.javabasico.exercicioAula11a13;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] arg) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a nota 1");
		double notaUm = teclado.nextDouble();
		
		System.out.println("Digite a nota 2");
		double notaDois = teclado.nextDouble();
		
		System.out.println("Digite a nota 3");
		double notaTres = teclado.nextDouble();
		
		System.out.println("Digite a nota 4");
		double notaQuatro = teclado.nextDouble();
		
		double soma = notaUm + notaDois + notaTres + notaQuatro;
		
		double media = soma / 4;
		
		System.out.println("A media das notas inseridas e : " + media);
		
		teclado.close();
	}
}
