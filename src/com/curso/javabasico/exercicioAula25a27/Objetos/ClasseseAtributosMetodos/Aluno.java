package com.curso.javabasico.exercicioAula25a27.Objetos.ClasseseAtributosMetodos;

public class Aluno {

	int matricula;
	String nome;
	String curso;
	String[] materias;
	double[] notas;
	
	public double media(double[] notas) {
		
		int soma =0;
		
		for(int i=0; i < notas.length; i++) {
			soma += notas[i];
		}
		
		return soma/notas.length;
	}
	
}
