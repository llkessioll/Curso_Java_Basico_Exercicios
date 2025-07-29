package com.curso.javabasico.exercicioAula14a15.condicional;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int dia, mes, ano;
		
		System.out.println("Digite uma data no formato dd/mm/aaaa");
		String data = teclado.next();
		
		String[] dataSeparada = data.split("\\/");
		
		dia = Integer.parseInt(dataSeparada[0]);
		mes = Integer.parseInt(dataSeparada[1]);
		ano = Integer.parseInt(dataSeparada[2]);
		
		if((dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12) && (ano > 0)) {
			System.out.println("A data informada é uma data valida");
		}else {
			System.out.println("A data informada não é valida");
		}
		
		teclado.close();
	}
}
