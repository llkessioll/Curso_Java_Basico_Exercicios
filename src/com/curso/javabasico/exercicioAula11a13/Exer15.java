package com.curso.javabasico.exercicioAula11a13;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double salarioBruto, salarioLiquido;
		double ir =0;
		double inss =0;
		double sindicato =0;
		double valorHoraTrabalhada = 0;
		double descontos =0;
		
		int horasTrabalhadas =0;
		
		System.out.println("Digite a quantidade de horas trabalhadas no mes:");
		horasTrabalhadas = teclado.nextInt();
		
		System.out.println("Digite a valor da hora trabalhada: ");
		valorHoraTrabalhada = teclado.nextDouble();
		
		salarioBruto = valorHoraTrabalhada * horasTrabalhadas;
		
		ir = (.11*salarioBruto);
		inss = (0.08*salarioBruto);
		sindicato = (0.05*salarioBruto);
		
		
		descontos = ir+inss+sindicato;
		
		salarioLiquido = salarioBruto - descontos;
		
		System.out.println("Salario Bruto: R$: "+salarioBruto);
		System.out.println("IR: R%: "+ ir);
		System.out.println("INSS: R$: "+inss);
		System.out.println("Sindicato: R$: "+sindicato);
		System.out.println("Total dos descontos: R$: "+descontos);
		System.out.println("Salario liquido: R$"+salarioLiquido);
		
		teclado.close();
	}
}
