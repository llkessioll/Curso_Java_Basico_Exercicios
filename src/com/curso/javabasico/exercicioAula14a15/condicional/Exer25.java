package com.curso.javabasico.exercicioAula14a15.condicional;

import java.util.Scanner;

public class Exer25 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int opcao, cont = 0;
		
		System.out.println("Digite 1 para sim e 0 para não");
		
		System.out.println("1 - Telefonou para a vitima ?");
		opcao = teclado.nextInt();
		
		if(opcao == 1) {
			cont++;
		}
		
		System.out.println("2 - Esteve no local do crime ?");
		opcao = teclado.nextInt();
		
		if(opcao == 1) {
			cont++;
		}
		
		System.out.println("3 - Mora perto da vitima ?");
		opcao = teclado.nextInt();
		
		if(opcao == 1) {
			cont++;
		}
		
		System.out.println("4 - Devia para a vitima ?");
		opcao = teclado.nextInt();
		
		if(opcao == 1) {
			cont++;
		}
		
		System.out.println("5 - Já trabalhou com a vitima ?");
		opcao = teclado.nextInt();
		
		if(opcao == 1) {
			cont++;
		}
		
		switch(cont) {
		
			case 2:
				System.out.println("Suspeita");
				break;
			case 3:
			case 4:
				System.out.println("Cúmplice");
				break;
			case 5:
				System.out.println("Assassino");
			default:
				System.out.println("Inocente");
		}
		
		teclado.close();
	}

}
