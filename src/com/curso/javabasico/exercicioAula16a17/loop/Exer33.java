package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer33 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double temperatura, soma = 0.0, menor = 999999, maior =0, media;
		char opcao = ' ';
		int contador = 0;
		
		System.out.println("Departamento Estadual de Meteorologia");
		
		while(true) {
			
			System.out.println("Entre com o valor da temperatura");
			temperatura = teclado.nextDouble();
			
			soma += temperatura;
			contador ++;
			
			if(temperatura < menor) {
				menor = temperatura;
			}
			
			if(temperatura > maior) {
				maior = temperatura;
			}
			
			System.out.println("Deseja inserir outra temperatura (s-sim / n-não)");
			opcao = teclado.next().toLowerCase().charAt(0);
			
			if(opcao == 'n') {
				break;
			}
			
		}
		
		media = soma/contador;
		
		System.out.println("============================ DADOS FINAIS ==========================");
		System.out.println("A mairo temperatura registrada foi: "+maior);
		System.out.println("A menor temperatura registrada foi: "+menor);
		System.out.println("A media da temperaturas registradas foi: "+media);
		
		teclado.close();
		
	}
}
