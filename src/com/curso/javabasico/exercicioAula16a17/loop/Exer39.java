package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer39 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int codAlunoAlto =0, codAlunoBaixo =0, cod, flag = 1;
		double alunoAlto =0, alunoBaixo =0, altura;
		
		for( int i=1; i <= 4; i++ ) {
			
			System.out.println("Digite o codigo do aluno");
			cod = teclado.nextInt();
			while(cod <= 0) {
				System.out.println("O código do aluno não pode ser um valor inferior a zero");
				cod = teclado.nextInt();
			}
			
			System.out.println("Digite a altura do aluno");
			altura = teclado.nextDouble();
			while(altura <= 0.0) {
				System.out.println("Erro: Altura incorreta digite novamente");
				altura = teclado.nextDouble();
			}
			
			if(flag == 1) {
				codAlunoAlto = cod;
				codAlunoBaixo = cod;
				alunoAlto = altura;
				alunoBaixo = altura;
				flag ++;
			}
			
			if(alunoAlto < altura) {
				codAlunoAlto = cod;
				alunoAlto = altura;
			}
			
			if(alunoBaixo > altura) {
				codAlunoBaixo = cod;
				alunoBaixo = altura;
			}
			
		}
		
		System.out.println(" =============== CENSO DOS ALUNOS ===============");
		System.out.println("Codigo aluno alto: "+codAlunoAlto);
		System.out.println("Aluno mais alto: "+alunoAlto);
		
		System.out.println("\nCodigo aluno baixo: "+codAlunoBaixo);
		System.out.println("Aluno mais baixo: "+alunoBaixo);
		
		teclado.close();
	}
	
}
