package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int entrada =0;
		
		System.out.println("Digite um valor entre 1 e 10 para gerar uma tabuada");
		entrada = teclado.nextInt();
		
		for(int i= 1; i<=10; i++) {
			
			System.out.println(entrada+" x "+i +" = "+i*entrada );
			
		}
		
		teclado.close();
	}
}
