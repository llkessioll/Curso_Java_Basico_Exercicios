package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int qtdPares =0, qtdImpares =0, entrada;
		
		for(int i=1; i<=10; i++) {
			
			System.out.print("Digite o "+i+"º valor = ");
			entrada = teclado.nextInt();
			
			if(entrada % 2 == 0) {
				qtdPares ++;
			}else {
				qtdImpares ++;
			}
		}
		
		System.out.println("A quantidade de numeros PARES é = "+qtdPares);
		System.out.println("A quantidade de numeros IMPARES é = "+qtdImpares);
		
		teclado.close();
	}
}
