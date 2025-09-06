package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int idade, cont =0, somaIdades =0;
		double media;
		char opcao = ' ';
		
		do {
			
			System.out.print("Digite um valor para idade: ");
			idade = teclado.nextInt();
			
			while((idade < 0) || (idade >150)) {
				System.out.println("Entrada invalida somente valores entre 1 e 150");
				idade = teclado.nextInt();
			}
			
			cont++;
			somaIdades += idade;
			
			System.out.println("Deseja inserir outra idade (s-Sim / n-Não");
			opcao = teclado.next().toLowerCase().charAt(0);
			
			if( opcao == 'n') {
				
				media = (double) somaIdades/cont;
				
				break;
			}
			
		}while(true);
		
		if(media <= 25) {
			System.out.println("A media das idades e de: "+media+" A turma e jovem");
		}else if(media <= 60) {
			System.out.println("A media das idades e de: "+media+" A turma e adulta");
		}else {
			System.out.println("A media das idades e de: "+media+" A turma e Idosa");
		}
		
		teclado.close();
	}
}
