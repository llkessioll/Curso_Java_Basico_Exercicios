package com.curso.javabasico.exercicioAula14a15.condicional;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double GASOLINA = 2.50;
		double ALCOOL = 1.90;
		
		double descontoAlcoolVinte = 0.03;
		double descontoAlcoolAcimaDeVinte = 0.05;
		
		double descontoGasolinaVinte = 0.04;
		double descontoGasolinaAcimaDeVinte = 0.06;
		
		double qtdLitros, total, desconto;
		
		char tipo;
		
		System.out.println("Esconlha o tipo de combustivel\nA-Alcool G-Gasolina");
		tipo = teclado.next().charAt(0);
		
		System.out.println("Digite a quantidade de litros vendidos:");
		qtdLitros = teclado.nextDouble();
		
		if(tipo == 'G') {
			
			total = qtdLitros*GASOLINA;
			
			if(qtdLitros <= 20) {
				desconto = total*descontoGasolinaVinte;
				System.out.println("Litros abastecidos: "+qtdLitros+"L");
				System.out.println("R$: "+total);
				System.out.println("Desconto: "+(descontoGasolinaVinte*100)+"%");
				System.out.println("Total a pagar e de: R$ "+(total-desconto));
			}else {
				desconto = total*descontoGasolinaAcimaDeVinte;
				System.out.println("Litros abastecidos: "+qtdLitros);
				System.out.println("R$: "+total);
				System.out.println("Desconto: "+(descontoGasolinaAcimaDeVinte*100)+"%");
				System.out.println("Total a pagar e de: R$ "+(total-desconto));
			}
			
		}else if(tipo == 'A') {
			
			total = qtdLitros*ALCOOL;
			
			if(qtdLitros <= 20) {
				desconto = total*descontoAlcoolVinte;
				System.out.println("Litros abastecidos: "+qtdLitros+"L");
				System.out.println("R$: "+total);
				System.out.println("Desconto: "+(descontoAlcoolVinte*100)+"%");
				System.out.println("Total a pagar e de: R$ "+(total-desconto));
			}else {
				desconto = total*descontoGasolinaAcimaDeVinte;
				System.out.println("Litros abastecidos: "+qtdLitros+"L");
				System.out.println("R$: "+total);
				System.out.println("Desconto: "+(descontoAlcoolAcimaDeVinte*100)+"%");
				System.out.println("Total a pagar e de: R$ "+(total-desconto));
			}
		}else {
			System.out.println("O tipo de combustivel escolhido e inválido");
		}
		
		teclado.close();
	}
}
