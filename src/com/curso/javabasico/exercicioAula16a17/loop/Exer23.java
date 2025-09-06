package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int entrada;
		
		System.out.println("Entre com um valor N para mostra os primos de 1 até N");
		entrada = teclado.nextInt();
		
		while(entrada < 1) {
			System.out.println("Informe um valor inteiro e positivo");
			entrada = teclado.nextInt();
		}
		
		if(entrada < 2) {
			System.out.println("Não existem números primos até esse valor");
		}else {
			
			System.out.println("Valores PRIMOS até o valor da entrada");
			for(int i=2; i <= entrada; i++) {
				boolean ePrimo = true;
				
				for(int y=2; y<i; y++) {
					
					if(i % y == 0) {
						ePrimo = false;
						break;
					}
				}
				
				if(ePrimo) {
					System.out.print(i+", ");
				}
			}
		}
		
		teclado.close();
	}
}
