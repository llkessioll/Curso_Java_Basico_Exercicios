package com.curso.javabasico.exercicioAula14a15.condicional;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numUm, numDois, numTres;
		int maior = 0, menor = 0;
		
		System.out.println("Digite o primeiro valor: ");
		numUm = teclado.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		numDois = teclado.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		numTres = teclado.nextInt();
		
		if(numUm > numDois && numUm > numTres) {
			maior = numUm;
		}else if(numDois > numUm && numDois > numTres) {
			maior = numDois;
		}else if(numTres > numUm && numTres > numDois) {
			maior = numTres;
		}
		
		if(numUm < numDois && numUm < numTres) {
			menor = numUm;
		}else if(numDois < numUm && numDois < numTres) {
			menor = numDois;
		}else {
			menor = numTres;
		}
		
		System.out.println("O maior valor e: "+maior);
		System.out.println("O menor valor e: "+menor);
		
		teclado.close();
	}
}
