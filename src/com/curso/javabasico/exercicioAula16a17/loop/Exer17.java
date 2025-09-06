package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer17 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int entrada, resultado = 1;
		
		System.out.println("Digite um valor para calcular o fatorial");
		entrada = teclado.nextInt();
		
		
		if( entrada == 0){
			System.out.println("0! = 1");
			
		}else if(entrada == 1) {
			System.out.println(entrada+"! = 1");
			
		}else {
			
			for(int i=entrada; i > 0; i--) {
				
				
				resultado  *= i;
				
			}
			
			System.out.println(entrada+"! = " + resultado);
		}
		
		teclado.close();
	}

}
