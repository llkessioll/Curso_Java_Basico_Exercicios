package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int base, expoente, resultado = 1;
		
		System.out.println("Digite um valor para a base");
		base = teclado.nextInt();
		
		System.out.println("Digite um valor para o expoente");
		expoente = teclado.nextInt();
		
		if(expoente == 0) {
			
			System.out.println(base + " Elevado a " + expoente + " é = " + resultado);
			
		}else {
			
			for(int i=0; i < expoente; i++) {
				
				resultado *= base;
			}
			
			System.out.println(base + " Elevado a " + expoente + " é = "+resultado);
		}
		
		
		teclado.close();
	}
}
