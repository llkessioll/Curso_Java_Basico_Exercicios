package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int cont =0, entrada =0, quantidade =0, maior =0, menor =0, soma =0;
		
		System.out.println("Digite a quantidad de numeros que deseja receber");
		quantidade = teclado.nextInt();
		
		menor = quantidade;
		maior = quantidade;
		
		if(quantidade <= 0) {
			System.out.println("A quantidade de números para entrada não pode ser 0 ou negativos");
		}else {
		
			while(cont < quantidade) {
				
				System.out.print("Digite o valor: ");
				entrada = teclado.nextInt();
				
				
				if(entrada > maior) {
					maior = entrada;
				}
				
				if(entrada < menor) {
					menor = entrada;
				}
				
				soma += entrada;
				cont++;
				
			}
			
			System.out.println("Maior valor digitado: "+maior);
			System.out.println("Menor valor digitado: "+menor);
			System.out.println("Soma dos valores digitados: "+soma);
		}
		
		
		teclado.close();
		
	}
}
