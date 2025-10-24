package com.curso.javabasico.exercicioAula25a27.Objetos.ClasseseAtributosMetodos;

public class MainAluno {
	
	public static void main(String[] args) {
		
		Aluno alunoUm = new Aluno();
		
		alunoUm.matricula = 001;
		alunoUm.nome = "Fulano da silva";
		alunoUm.curso = "A.D.S";
		
		alunoUm.materias = new String[3];
		alunoUm.materias[0] = "Banco de dados";
		alunoUm.materias[1] = "Programação Orientada a Objetos";
		alunoUm.materias[2] = "Arquitetura de computadores";
		
		alunoUm.notas = new double[3];
		alunoUm.notas[0] = 7;
		alunoUm.notas[1] = 7;
		alunoUm.notas[2] = 7;
		
		System.out.println("Nome: "+alunoUm.nome);
		System.out.println("Matricula: "+alunoUm.matricula);
		System.out.println("Curso: "+alunoUm.curso);
		System.out.println("Media em "+alunoUm.materias[0]);
		double media = alunoUm.media(alunoUm.notas);
		System.out.print(media);
		
		if(media >= 7) {
			System.out.print(" - Aprovado");
		}else {
			System.out.print(" - Reprovado");
		}
		
	}

}
