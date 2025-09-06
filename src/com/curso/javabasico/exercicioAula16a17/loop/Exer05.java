package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double populacaoA = -1;
		double populacaoB = -1;
		
		double taxaCrescimentoA = -1;
		double taxaCrescimentoB = -1;
		
		int contAnos =0;
		
		//boolean flag = false;
		
		while(true) {
			
			System.out.println("Entre com a quantidade populacional para A");
			while(populacaoA <= 0) {
				populacaoA = teclado.nextDouble();
				if(populacaoA <= 0) {
					System.out.println("Entre com um valor acima de 0");
				}
			}
			
			System.out.println("Entre com a quantidade populacional para B");
			while(populacaoB <= 0) {
				populacaoB = teclado.nextDouble();
				if(populacaoB <= 0) {
					System.out.println("Entre com um valor acima de 0");
				}
			}
			
			System.out.println("Digite a taxa de crescimento populacional para A");
			while(taxaCrescimentoA <= 0) {
				taxaCrescimentoA = teclado.nextDouble()/100;
				if(taxaCrescimentoA <= 0) {
					System.out.println("A taxa de crescimento deve ser acima de 0");
				}
			}
			
			System.out.println("Digite a taxa de crescimento populacional para B");
			while(taxaCrescimentoB <= 0) {
				taxaCrescimentoB = teclado.nextDouble()/100;
				if(taxaCrescimentoB <=0 ) {
					System.out.println("A taxa de crescimento deve ser acima de 0");
				}
			}
			
			for(contAnos = 0; populacaoA <= populacaoB; contAnos++) {
				
				populacaoA += populacaoA * taxaCrescimentoA;
				populacaoB += populacaoB * taxaCrescimentoB;
				
			}
			
			System.out.println("Para que a populacao de A ultrapasse a populacao B levara "+contAnos+" anos");
			
			System.out.println("Deseja realizar um novo calculo s-Sim / n-Nao");
			char novo = Character.toLowerCase(teclado.next().charAt(0));
			
			if(novo == 'n') {
				break;
			}else if(novo == 's'){
				populacaoA = -1;
				populacaoB = -1;
				taxaCrescimentoA = -1;
				taxaCrescimentoB = -1;
				contAnos = 0;
			}else {
				System.out.println("Opção invalida escolha entre s-Sim / n-Nao");
			}
			
		}
		
		teclado.close();
	}
}
