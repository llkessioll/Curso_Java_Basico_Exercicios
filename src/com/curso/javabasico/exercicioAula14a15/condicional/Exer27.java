package com.curso.javabasico.exercicioAula14a15.condicional;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double MORANGOCINCO = 2.50;
		double MORANGOACIMACINCO = 2.20;
		double DESCONTO = 0.10;
		
		double MACACINCO = 1.80;
		double MACAACIMACINCO = 1.50;
		
		double kilosMorango, kilosMaca, somaDosKilos,
			   totalMorangos, totalMacas, totalPagar,
			   desconto = 0;
		
		System.out.println("Digite a quantidade de kilos para MORANGOS");
		kilosMorango = teclado.nextDouble();
		
		System.out.println("Digite a quantidade de kilos para MAÇAS");
		kilosMaca = teclado.nextDouble();
		
		if((kilosMorango <= 5) && (kilosMaca <=5)) {
			totalMorangos = kilosMorango*MORANGOCINCO;
			totalMacas = kilosMaca*MACACINCO;
		}else {
			totalMorangos = kilosMorango*MORANGOACIMACINCO;
			totalMacas = kilosMaca*MACAACIMACINCO;
		}
		
		somaDosKilos = kilosMorango + kilosMaca;
		totalPagar = totalMorangos+totalMacas;
		
		if(somaDosKilos >= 8 || totalPagar >= 25) {
			desconto = totalPagar*DESCONTO;
		}
		
		System.out.println("Kilos MORANGO: "+kilosMorango);
		System.out.println("Kilos MAÇAS: "+kilosMaca);
		System.out.println("Total a pagar de MORANGOS: R$ "+totalMorangos);
		System.out.println("Total a pagar de MAÇAS: R$ "+totalMacas);
		System.out.println("Total parcial: R$ "+totalPagar);
		System.out.println("Desconto: R$ "+desconto);
		System.out.println("Total a pagar: R$ "+(totalPagar-desconto));
		
		teclado.close();
	}
}
