package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer07 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int maior =0;
		
		for(int i =1; i<=5; i++) {
			System.out.print("Entre com o "+i+"º valor: ");
			int entrada = teclado.nextInt();
			
			if(maior < entrada) {
				maior = entrada;
			}
			
		}
		
		System.out.println("O maior valor digitado foi : "+maior);
		
		teclado.close();
	}

}
