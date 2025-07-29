package com.curso.javabasico.exercicioAula14a15.condicional;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double valorA, valorB, valorC, delta, raizX, raizY;
		
		System.out.println("Digite um valor para (A)");
		valorA = teclado.nextDouble();
		
		if(valorA == 0) {
			System.out.println("Não é uma equação de segundo grau");
			teclado.close();
			return;
		}
		
		System.out.println("Digite um valor para (B)");
		valorB = teclado.nextDouble();
		
		System.out.println("Digite um valor para (C)");
		valorC = teclado.nextDouble();
		
		delta = (valorB*valorB)-4*valorA*valorC;
		
		if(delta < 0) {
			
			System.out.println("A equação não possui raizes reais");
		
		}else if(delta == 0) {
			
			raizX = (-valorB+delta)/2*valorB;
			System.out.println("X': "+raizX);
		
		}else {
			raizX = (-valorB+Math.sqrt(delta))/2*valorA;
			raizY = (-valorB-Math.sqrt(delta))/2*valorA;
			
			System.out.println("X': "+raizX);
			System.out.println("X'': "+raizY);
		}
		
		teclado.close();
		
	}
}
