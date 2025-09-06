package com.curso.javabasico.exercicioAula16a17.loop;


public class Exer38 {

	public static void main(String[] args) {
		
		double salario = 1000.00;
		double porcentagemAlmento = 1.5;
		int anoContrato = 1995,  anoCorrente = 2000;
		
		for(int i= anoContrato; i <= anoCorrente; i++) {
			
			if(i == 1996) {
				salario = salario + (salario * porcentagemAlmento / 100);
			}
			
			
			if(i > 1996) {
				porcentagemAlmento = porcentagemAlmento * 2;
				salario = salario + (salario * porcentagemAlmento / 100);
			}
			
			System.out.println("Salario ajustado com base no ano de "+i+" R$: "+salario);
			
		}
		
	}
}
