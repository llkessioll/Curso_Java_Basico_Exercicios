package com.curso.javabasico.exercicioAula36.RelacionamentoEntreClasses.agenda.curso;

import java.util.Scanner;

public class MainCurso {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("X---------------------------------------------------------------X");
		
		System.out.println("Entre com os dados do profesor");
		
		System.out.println("Nome do professor: ");
		String nomeProfessor = teclado.nextLine();
		System.out.println("Departamento: ");
		String departamento = teclado.nextLine();
		System.out.println("E-amil: ");
		String email = teclado.nextLine();
		
		Professor professor = new Professor(nomeProfessor, departamento, email);
		
		System.out.println("X---------------------------------------------------------------X");
		
		System.out.println("Entre com os dados do Curso");
		
		System.out.println("Nome do Curso: ");
		String nomeCurso = teclado.nextLine();
		System.out.println("Entre com a hora do curso: Ex:(19h30)");
		String hora = teclado.nextLine();
		
		Curso curso = new Curso(nomeCurso, hora, professor);
		
		System.out.println("X---------------------------------------------------------------X");
		
		System.out.println("Entre com os dados dos alunos");
		
		int cont = 0;
		
		Aluno[] alunos = new Aluno[4];
		
		while(cont < 4) {
			
			double[] notas = new double[4];
			
			System.out.println("Aluno matricula nº "+cont);
			int matricula = cont;
			
			System.out.println("Nome: ");
			String nomeAluno = teclado.nextLine();
			
			for(int i=0; i < notas.length; i++) {
				System.out.println("Entre com a "+(i+1)+"º nota: ");
				notas[i] = teclado.nextDouble();
				teclado.nextLine();
			}
			
			Aluno aluno = new Aluno(nomeAluno, matricula, notas);
			
			alunos[cont] = aluno;
			
			cont++;
		}
		
		curso.setAlunos(alunos);
		
		System.out.println("X---------------------------------------------------------------X");
		System.out.println("Informações do curso");
		System.out.println("Curso: "+curso.getNome());
		System.out.println("Horario: "+curso.getHorario());
		System.out.println("Informações do Professor");
		System.out.println("Nome: "+curso.getProfessor().getNome());
		System.out.println("Departamento: "+curso.getProfessor().getDepartamento());
		System.out.println("E-amil: "+curso.getProfessor().getEmail());
		
		System.out.println("\nX---------------------------------------------------------------X");
		System.out.println("Informações dos alunos");
		for(Aluno a : curso.getAlunos()) {
			if( a != null) {
				System.out.println(a.imprimirAluno());
				System.out.println("----------------------------------------------------");
			}
		}
		
		
		teclado.close();
	}
	
}
