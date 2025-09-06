package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer31 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double total =0, preco, dinheiro, troco =0;
		int opcao,  contador =1;
		
		System.out.println("Lojas Tabajara");
		
		System.out.println("Entre com o preço de cada item\nDigite 0 para finalizar");
		do {
			
			System.out.println("Produto "+contador);
			preco = teclado.nextDouble();
			
			while(preco <=0 ) {
				System.out.println("O produto não pode tem um valor inferior a 0");
				preco = teclado.nextDouble();
			}
			
			total += preco;
			contador ++;
			
			System.out.println("Deseja acrescentar outro preço (1-sim / 0-sair)");
			opcao = teclado.nextInt();
			
			if(opcao == 0) {
				break;
			}
			
		}while(true);
		
		System.out.println("Dinheiro");
		dinheiro = teclado.nextDouble();
		
		if(dinheiro > total) {
			troco = dinheiro - total;
		}
		
		System.out.printf("Total a pagar: %.2f\n", total);
		System.out.printf("\nDinheiro: %.2f\n", dinheiro);
		System.out.printf("\nTroco: %.2f", troco);
		
		teclado.close();
	}
}
