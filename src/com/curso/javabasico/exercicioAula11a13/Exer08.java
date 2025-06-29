package com.curso.javabasico.exercicioAula11a13;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor da hora trabalhada:");
		double valorHora = teclado.nextDouble();
		
		System.out.println("Digite a quantidade de horas trabalhadas:");
		double horasTrabalhadas = teclado.nextDouble();
		
		double salario = horasTrabalhadas * valorHora;
		
		System.out.println("O valor a ser recebido e: "+salario);
		
		teclado.close();
	}
}
