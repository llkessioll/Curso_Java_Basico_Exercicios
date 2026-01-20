package com.curso.javabasico.exercicioAula36.RelacionamentoEntreClasses.agenda.curso;

public class Curso {

	private String nome;
	private String horario;
	
	//Curso tem um professor
	private Professor professor;
	
	//Cusro tem varios alunos
	private Aluno[] alunos;
	
	public Curso(String nome, String horario, Professor professor) {
		this.nome = nome;
		this.horario = horario;
		this.professor = professor;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getHorario() {
		return this.horario;
	}
	
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public Professor getProfessor() {
		return this.professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
}
