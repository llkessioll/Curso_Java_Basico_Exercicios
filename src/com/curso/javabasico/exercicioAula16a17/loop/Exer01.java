package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer01 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		boolean cont = false;
		int valor ;
		
		
		
		while(cont != true) {
			
			System.out.println("Entre com um valor entre 0 e 10");
			valor = teclado.nextInt();
			
			if(valor >= 0 && valor <= 10) {
				System.out.println("Valor na faixa");
				cont = true;
			}else {
				System.out.println("O valor informado deve esta entre 0 e 10");
			}
		}
		
		teclado.close();
	}
}
