package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int soma =0;
		double media;
		
		for(int i=1; i<=5; i++) {
			
			System.out.print("Digite um valor para o "+i+"º valor: ");
			int entrada = teclado.nextInt();
			
			soma += entrada;
		}
		
		media = soma/5;
		
		
		System.out.println("A soma dos valores entrados e: "+soma);
		System.out.println("A media dos valores e: "+media);
		
		teclado.close();
	}
}
