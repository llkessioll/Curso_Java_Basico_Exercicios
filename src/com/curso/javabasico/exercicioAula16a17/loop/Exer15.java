package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int anterior = 0, proximo = 1, sucessor = 0;
		int entrada;
		
		System.out.println("Quanto termos da sequencia fibanacci deseja ver:");
		entrada = teclado.nextInt();
		
		System.out.print(anterior+", ");
		System.out.print(proximo+", ");
		
		for(int i=1; i<entrada; i++) {
			
			sucessor = proximo+anterior;
			
			System.out.print(sucessor+", ");
			
			anterior = proximo;
			proximo = sucessor;
			
			
		}
		
		teclado.close();
		
	}
}
