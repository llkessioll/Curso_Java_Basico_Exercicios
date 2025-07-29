package com.curso.javabasico.exercicioAula14a15.condicional;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double notaUm, notaDois, media;
		char conceito;
		
		System.out.println("Digite a primeira nota do aluno");
		notaUm = teclado.nextDouble();
		
		System.out.println("Digite a segunda nota do aluno");
		notaDois = teclado.nextDouble();
		
		media = (notaUm+notaDois)/2;
		
		if(media > 9.0) {
			conceito = 'A';
		}else if(media > 7.5 && media <=9.0) {
			conceito = 'B';
		}else if(media > 6.0 && media <=7.5) {
			conceito = 'C';
		}else if(media > 4.0 && media <= 6.0) {
			conceito = 'D';
		}else{
			conceito = 'E';
		}
		
		System.out.println("Nota UM: "+notaUm);
		System.out.println("Nota DOIS: "+notaDois);
		System.out.println("Media: "+media);
		System.out.println("Conceito: "+conceito);
		
		switch(conceito) {
			
			case 'A':
			case 'B':
			case 'C':
				System.out.println("APROVADO");
				break;
			case 'D':
			case 'E':
				System.out.println("REPROVADO");
		}
		
		teclado.close();
	}
}
