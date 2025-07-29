package com.curso.javabasico.exercicioAula14a15.condicional;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double precoUm, precoDois, precoTres;
		
		System.out.println("Digite o preco Um");
		precoUm = teclado.nextDouble();
		
		System.out.println("Digite o preco Dois");
		precoDois = teclado.nextDouble();
		
		System.out.println("Digite o preco Tres");
		precoTres = teclado.nextDouble();
		
		if( precoUm < precoDois && precoUm < precoTres) {
			System.out.println("O menor preco e "+precoUm);
		}else if(precoDois < precoUm && precoDois < precoTres) {
			System.out.println("O menor preco e "+precoDois);
		}else {
			System.out.println("O menor preco e "+precoTres);
		}
		
		teclado.close();
	}
}
