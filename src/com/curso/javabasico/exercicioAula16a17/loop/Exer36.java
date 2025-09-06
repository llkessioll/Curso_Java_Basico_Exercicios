package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer36 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int valor, valorInicial =0, valorFinal;
		
		System.out.println("========= TABUADA =======");
		
		System.out.println("Montar a tabuada de: ");
		valor = teclado.nextInt();
		
		System.out.println("Começar por: ");
		valorInicial = teclado.nextInt();
		
		System.out.println("Terminar em: ");
		valorFinal = teclado.nextInt();
		
		while(valorFinal <= valorInicial) {
			System.out.println("O valor final deve ser maior que o inicial");
			valorFinal = teclado.nextInt();
		}
		
		System.out.println("Vou montar a tabuada de "+valor+" começando por "+valorInicial+" terminando em "+ valorFinal);
		
		for(int i=valorInicial; i <= valorFinal; i++) {
			
			System.out.println(valor+" X "+ i +" = "+ (valor*i));
			
		}
		
		teclado.close();
	}
}
