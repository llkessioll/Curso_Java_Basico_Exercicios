package com.curso.javabasico.exercicioAula14a15.condicional;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int valorUm, valorDois, valorTres;
		
		System.out.println("Entre com o primeiro valor: ");
		valorUm = teclado.nextInt();
		
		System.out.println("Entre com o segundo valor: ");
		valorDois = teclado.nextInt();
		
		System.out.println("Entre com o terçeiro valor: ");
		valorTres = teclado.nextInt();
		
		if(valorUm > valorDois && valorDois > valorTres) {
			System.out.println("O maior valor e: "+valorUm);
			
		}else if(valorDois > valorTres && valorTres > valorUm) {
			System.out.println("O maior valor e: "+valorDois);
		
		}else{
			System.out.println("O maior valor e: "+valorTres);
		}
		
		teclado.close();
	}
}
