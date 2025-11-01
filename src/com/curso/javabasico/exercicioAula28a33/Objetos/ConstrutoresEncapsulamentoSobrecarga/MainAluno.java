package com.curso.javabasico.exercicioAula28a33.Objetos.ConstrutoresEncapsulamentoSobrecarga;

import java.util.Scanner;

public class MainAluno {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // --- Criando um novo aluno ---
        System.out.println("===== CADASTRO DE ALUNO =====");
        System.out.print("Nome do aluno: ");
        String nome = teclado.nextLine();

        System.out.print("Matrícula: ");
        String matricula = teclado.nextLine();

        System.out.print("Curso: ");
        String curso = teclado.nextLine();

        System.out.print("Quantas matérias o aluno tem? ");
        int qtdMaterias = teclado.nextInt();
        teclado.nextLine(); // limpar buffer

        String[] materias = new String[qtdMaterias];
        double[] notas = new double[qtdMaterias];

        // --- Cadastro das matérias e notas ---
        for (int i = 0; i < qtdMaterias; i++) {
            System.out.print("Nome da matéria " + (i + 1) + ": ");
            materias[i] = teclado.nextLine();

            System.out.print("Nota da matéria " + materias[i] + ": ");
            notas[i] = teclado.nextDouble();
            teclado.nextLine(); // limpar buffer
        }

        // --- Criando o objeto aluno com as informações ---
        Aluno aluno = new Aluno(nome, matricula, curso, materias, notas);

        // --- Exibindo os dados do aluno ---
        System.out.println("\n===== INFORMAÇÕES DO ALUNO =====");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCurso());

        System.out.println("\nMatérias e Notas:");
        for (int i = 0; i < materias.length; i++) {
            System.out.println(" - " + materias[i] + ": " + notas[i]);
        }

        // --- Verificando aprovação ---
        for(int i =0; i < qtdMaterias; i++) {
        	
        	double aprovado = aluno.verificarAprovacao(notas);
        	if (aprovado >= 7) {
        		System.out.println("\n✅ O aluno foi aprovado!");
        	} else {
        		System.out.println("\n❌ O aluno foi reprovado.");
        	}
        }
        teclado.close();
    }
}
