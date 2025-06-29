package com.curso.javabasico.exercicioAula11a13;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int VALOR_MULTA = 4;
		int PESO_LIMITE = 50;
		
		int pesoTotal =0;
		int totalMulta =0;
		int pesoSemLimite =0;
		
		
		System.out.println("Digite o total da pesagem dos peixes");
		pesoTotal = teclado.nextInt();
		
		if(pesoTotal > PESO_LIMITE) {
			pesoSemLimite = pesoTotal-PESO_LIMITE;
			totalMulta = pesoSemLimite*VALOR_MULTA;
			
			System.out.println("Total do peso: "+pesoTotal);
			System.out.println("Peso extra: "+pesoSemLimite);
			System.out.println("Multa por Kilos excedidos: "+VALOR_MULTA);
			System.out.println("Total de multa a pagar: "+totalMulta);
		}else{
			System.out.println("Total do peso: "+pesoTotal);
			System.out.println("Peso extra: "+pesoSemLimite);
			System.out.println("Multa por Kilos excedidos: "+VALOR_MULTA);
			System.out.println("Total de multa a pagar: "+totalMulta);
		}
		
		teclado.close();
	}
}
