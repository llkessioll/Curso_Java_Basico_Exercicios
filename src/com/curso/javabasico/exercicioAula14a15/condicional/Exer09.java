package com.curso.javabasico.exercicioAula14a15.condicional;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numUm, numDois, numTres;
		
		System.out.println("Digite o valor Um");
		numUm = teclado.nextInt();
		
		System.out.println("Digite o valor Dois");
		numDois = teclado.nextInt();
		
		System.out.println("Digite o valor Tres");
		numTres = teclado.nextInt();
		
		if(numUm < numDois && numDois < numTres) {
			System.out.println(numTres+", "+numDois+", "+numUm);
		}else if(numDois < numTres && numTres < numUm) {
			System.out.println(numUm+", "+numTres+", "+numDois);
		}else {
			System.out.println(numDois+", "+numUm+", "+numTres);
		}
		
		teclado.close();
	}
}
