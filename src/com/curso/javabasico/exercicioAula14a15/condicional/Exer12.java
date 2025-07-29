package com.curso.javabasico.exercicioAula14a15.condicional;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double impostoRenda, salario, inss, fgts, irPago, descontos;
		
		System.out.println("Digite a quantidade de horas trabalhadas");
		int horasTrabalhadas = teclado.nextInt();
		
		System.out.println("Digite o valo da hora");
		double valorHora = teclado.nextDouble();
		
		salario = valorHora*horasTrabalhadas;
		
		if(salario <= 900) {
			impostoRenda = 0;
		}else if(salario <= 1500) {
			impostoRenda = 0.05;
		}else if(salario <= 2500) {
			impostoRenda = 0.10;
		}else {
			impostoRenda = 0.20;
		}
		
		irPago = impostoRenda*salario;
		inss = 0.10;
		fgts = 0.11;
		
		double pagamentoInss = inss*salario;
		double pagamentoFgts = fgts*salario;
		descontos = irPago+pagamentoInss;
		double salarioLiquido = salario-descontos;
		
		System.out.println("Salario bruto: "+valorHora+" * "+horasTrabalhadas + "\t\t:R$ "+salario);
		System.out.println("(-) IR: "+impostoRenda+"%"+"\t\t\t\t:R$ "+irPago);
		System.out.println("(-) INSS: "+inss+"%"+"\t\t\t\t:R$ "+pagamentoInss);
		System.out.println("(-) FGTS: "+fgts+"%"+"\t\t\t\t:R% "+pagamentoFgts);
		System.out.println("Total de descontos \t\t\t:R$ "+descontos);
		System.out.println("Salario Liquido \t\t\t:R$ "+salarioLiquido);
		
		teclado.close();
	}
}
