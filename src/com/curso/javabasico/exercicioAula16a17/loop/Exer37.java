package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;


public class Exer37 {
 
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int cod, testeInicio = 1;
		double peso, altura;
		
		int codigoMagro =0, codigoGordo =0, codigoAlto =0, codigoBaixo =0;
		double menorPeso = 0.0, maiorPeso = 0.0, menorAltura = 0.0, maiorAltura = 0.0;
		
		char opcao = ' ';
		
		System.out.println("Senso Academia Corpo Perfeito");
		
		do {
			
			System.out.println("Digite o código do aluno");
			cod = teclado.nextInt();
			
			System.out.println("Digite a altura:");
			altura = teclado.nextDouble();
			
			while(altura <= 0) {
				System.out.println("Altura não poder ser um valor inferior a ZERO digite novamente");
				altura = teclado.nextDouble();
			}
			
			System.out.println("Digite o peso: ");
			peso = teclado.nextDouble();
			
			while(peso <= 0 ) {
				System.out.println("Peso não pode ser um valor inferior a ZERO digite novamente");
				altura = teclado.nextDouble();
			}
			
			//IF - Utilizado para inicializar as variaeis com o primeiro valor inserido
			if(testeInicio == 1) {
				testeInicio ++;
				menorPeso = peso;
				menorAltura = altura;
				maiorPeso = peso;
				maiorAltura = altura;
				
			}
			
			if(peso < menorPeso) {
				codigoMagro = cod;
				menorPeso = peso;
			}
			
			if(peso > maiorPeso) {
				codigoGordo = cod;
				maiorPeso = peso;
			}
			
			if(altura < menorAltura) {
				codigoBaixo = cod;
				menorAltura = altura;
			}
			
			if(altura > maiorAltura) {
				codigoAlto = cod;
				maiorAltura = altura;
			}
			

			System.out.println("Deseja informar outros valores (s-sim / n-nao)");
			opcao = teclado.next().toLowerCase().charAt(0);
			
			if(opcao == 'n') {
				break;
			}
			
		}while(true);
		
		
		System.out.println("========================= Resultados =======================");
		System.out.println("\nAluno mais Alto");
		System.out.println("Codigo: "+codigoAlto);
		System.out.println("Altura: "+maiorAltura);
		
		System.out.println("\nAluno mais Baixo");
		System.out.println("Codigo: "+codigoBaixo);
		System.out.println("Altura: "+menorAltura);
		
		System.out.println("\nAluno acima do Peso");
		System.out.println("Codigo: "+codigoGordo);
		System.out.println("Peso: "+maiorPeso);
		
		System.out.println("\nAluno abaixo do Peso");
		System.out.println("Codigo: "+codigoMagro);
		System.out.println("Peso: "+menorPeso);
	
		teclado.close();
	}
}
