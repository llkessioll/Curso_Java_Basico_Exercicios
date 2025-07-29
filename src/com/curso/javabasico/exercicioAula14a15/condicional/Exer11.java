package com.curso.javabasico.exercicioAula14a15.condicional;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double salario, aumento, porcentagem;
		
		System.out.println("Digite o valor do salario do funcionario");
		salario = teclado.nextDouble();
		
		if(salario <= 280) {
			porcentagem = 0.20;
		}else if(salario < 700) {
			porcentagem = 0.15;
		}else if(salario < 1500) {
			porcentagem = 0.10;
		}else {
			porcentagem = 0.05;
		}
		
		aumento = porcentagem*salario;
		
		System.out.println("==================================");
		System.out.println("Salario -> "+salario);
		System.out.println("Porcentagem de aumento -> "+(porcentagem*100)+"%");
		System.out.println("Valor do aumento -> "+aumento);
		System.out.println("Novo salario -> "+(salario+aumento));
		
		teclado.close();
		
	}
}
