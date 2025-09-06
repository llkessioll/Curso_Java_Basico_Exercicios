package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int qtdTurmas, somaAlunosTurma =0, qtdAlunos;
		double mediaAlunosTurmas =0;
		
		System.out.println("Entre com a quantidade de turmas\nAs turmas não podem tem mais de 40 alunos");
		qtdTurmas = teclado.nextInt();
		
		while(qtdTurmas <= 0) {
			System.out.println("Valor incorrento, tem que ter pelo menos 1 turma");
			qtdTurmas = teclado.nextInt();
		}
		
		for(int i=0; i < qtdTurmas; i++) {
			
			System.out.print("Digite a quantidade de alunos para a "+(i+1)+"º turma -> ");
			qtdAlunos = teclado.nextInt();
			
			while(qtdAlunos <= 0 || qtdAlunos > 40) {
				System.out.println("As turmas devem ter menos de 40 alunos e pelo menos 1");
				qtdAlunos = teclado.nextInt();
			}
			
			somaAlunosTurma += qtdAlunos;
		}
		
		mediaAlunosTurmas = (double) somaAlunosTurma/qtdTurmas;
		
		System.out.println("A media de alunos por turma e de ( "+mediaAlunosTurmas+" ) alunos");
		
		teclado.close();
	}
}
