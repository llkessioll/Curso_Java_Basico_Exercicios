package com.curso.javabasico.exercicioAula19.arrays;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double[] nota1 = new double[4];
		double[] nota2 = new double[nota1.length];
		double[] resultado = new double[nota1.length];
		
		double notaUm, notaDois;
 		
		System.out.println("Entre com 2 notas para cada aluno");
		
		for(int i=0; i < nota1.length; i++) {
			
			System.out.println("Entre com a "+(i+1)+"º nota do aluno "+(i+1)+": ");
			notaUm = teclado.nextDouble();
			if(notaUm < 0 || notaUm > 10) {
				System.out.println("Erro: a nota não pode ser inferior a 0 digite novamente");
				notaUm = teclado.nextDouble();
			}
			
			System.out.println("Entre com a "+(1+i)+"º nota do aluno "+(i+1)+": ");
			notaDois = teclado.nextDouble();
			if(notaDois < 0 || notaDois > 10) {
				System.out.println("Erro: a nota não pode ser inferior a 0 digite novamente");
				notaDois = teclado.nextDouble();
			}
			
			nota1[i] = notaUm;
			nota2[i] = notaDois;
			
		}
		
		for(int i=0; i < nota1.length; i++) {
			
			resultado[i] = calcularMedia(nota1[i], nota2[i]);
			
		}
		
		imprimirValores("Notas da primeira unidade", nota1);
		imprimirValores("Notas da segnuda unidade", nota2);
		imprimirValores("Medias aritimeticas", resultado);
		
		teclado.close();
	}
	
	public static double calcularMedia(double notaUm, double notaDois) {
		
		return (notaUm+notaDois)/2;
		
	}
	
	public static void imprimirValores( String titulo, double[] vetor) {
		
		System.out.println("\n"+titulo);
		for(int i=0; i < vetor.length; i++) {
			System.out.print(vetor[i]);
			if(i < vetor.length -1) {
				System.out.print(", ");
			}
		}
		
	}
	
}
