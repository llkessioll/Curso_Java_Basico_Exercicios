package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int valor, fatorial =1;
		
		System.out.println("Digite um valor inteiro e positivo");
		valor = teclado.nextInt();
		
		while(valor < 0) {
			System.out.println("Apenas valores inteiros e positivos");
			valor = teclado.nextInt();
		}
		
		if(valor < 2) {
			System.out.println("Fatorial de: "+valor);
			System.out.println(valor+"! = 1");
		}else {
			
			System.out.println("Factorial de: "+valor);
			
			System.out.print(valor+"! = ");
			for(int i=valor; i >= 1; i--) {
				System.out.print(i);
				
				if(i > 1) {
					System.out.print(" . ");
				}
				
				fatorial *=i;
			}
			System.out.print(" = "+fatorial);
		}
		
		teclado.close();
	}
}
