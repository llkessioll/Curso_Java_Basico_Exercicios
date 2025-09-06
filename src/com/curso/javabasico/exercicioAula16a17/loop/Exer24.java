package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double nota;
		int soma =0, cont = 0;
		char opcao = ' ';
		
		do {
			
			System.out.print("Entre com a "+(cont+1)+"º nota: ");
			nota = teclado.nextDouble();
			
			cont++;
			soma += nota;
			
			System.out.println("Deseja inserir mais uma nota (s-Sim / n-Não)");
			opcao = teclado.next().toLowerCase().charAt(0);
			
			if(opcao == 'n') {
				
				System.out.println("Media: "+soma/cont);
				
				break;
				
			}
			
		}while(true);
		
		teclado.close();
	}
}
