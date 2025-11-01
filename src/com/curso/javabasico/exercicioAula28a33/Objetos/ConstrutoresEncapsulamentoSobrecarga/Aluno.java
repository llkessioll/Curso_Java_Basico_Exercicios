package com.curso.javabasico.exercicioAula28a33.Objetos.ConstrutoresEncapsulamentoSobrecarga;

public class Aluno {

	private String nome;
	private String matricula;
	private String curso;
	private String[] materias;
	private double[] notas;
	
	public Aluno() {}
	
	public Aluno(String nome, String matricula, String curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
	}
	
	public Aluno(String nome, String matricula, String curso, String[]materias, double[] notas) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.materias = materias;
		this.notas = notas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getMaterias() {
		return materias;
	}

	public void setMaterias(String[] materias) {
		this.materias = materias;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double verificarAprovacao(double[] notas) {
		
		double soma =0;
		
		for(int i=0; i < notas.length; i++) {
			soma += notas[i];
		}
		
		return soma/notas.length;
		
	}
	
}
