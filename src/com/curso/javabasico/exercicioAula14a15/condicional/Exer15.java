package com.curso.javabasico.exercicioAula14a15.condicional;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double ladoA, ladoB, ladoC;
		
		System.out.println("Digite um valor para o lado A");
		ladoA = teclado.nextDouble();
		
		System.out.println("Digite um valor para o lado B");
		ladoB = teclado.nextDouble();
		
		System.out.println("Digite um valor para o lado C");
		ladoC = teclado.nextDouble();
		
		if((ladoA + ladoB > ladoC) &&
		   (ladoA + ladoC > ladoB) &&
		   (ladoB + ladoC > ladoA))  {
			
			//Teste para ver o se o triangulo e Equilátero
			if(ladoA == ladoB && ladoB == ladoC)  {
				System.out.println("Os valores informados formam fum triangulo Equilátero");
			
			//Teste para ver se o triangulo e Isósceles
			}else if( (ladoA == ladoB) || (ladoB == ladoC) || ladoC == ladoA ) {
				System.out.println("Os valores informados formam um triangulo Isósceles");
			
			//Informa que o triangulo e Escaleno
			}else {
				System.out.println("Os valores informados formam um triangulo Escaleno");
			}
			
		}else {
			System.out.println("Os valores fornecidos não são de um triangulo");
		}
		
		teclado.close();
	}
}
