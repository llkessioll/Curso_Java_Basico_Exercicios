package com.curso.javabasico.exercicioAula11a13;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		double altura = teclado.nextDouble();
		
		double pesoMasculino = (72.7*altura)-58;
		double pesoFeminino = (62.1*altura)-44.7;
		
		System.out.println("Peso idela feminino para essa altura: "+pesoFeminino);
		System.out.println("Peso ideal masculino para essa altura: "+pesoMasculino);
		
		teclado.close();
	}
}
