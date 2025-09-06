package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int cont =0, quantidade, entrada, maior =0, menor =99999, soma =0;
		
		System.out.println("Digite a quantidade de numeros que deseja entrar");
		quantidade = teclado.nextInt();
		
		while(cont < quantidade) {
			
			System.out.print("Entre com o "+cont+"º valor: ");
			entrada = teclado.nextInt();
			
			if(entrada < 0 || entrada > 1000 ) {
				System.out.println("Apenas valores entre 0 e 1000");
				while(entrada < 0 || entrada > 1000) {
					System.out.print("Entre com o "+cont+"º valor: ");
					entrada = teclado.nextInt();
				}
			}
			
			if(maior < entrada) {
				maior = entrada;
			}
			
			if(menor > entrada) {
				menor = entrada;
			}
			
			soma += entrada;
			
			cont++;
			
		}
		
		System.out.println("O maior valor digitado foi: "+maior);
		System.out.println("O menor valor digitado foi: "+menor);
		System.out.println("A soma dos valores digitados foi: "+soma);
		
		teclado.close();
	}
}
