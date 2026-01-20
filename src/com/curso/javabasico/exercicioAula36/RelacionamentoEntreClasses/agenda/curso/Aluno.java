package com.curso.javabasico.exercicioAula36.RelacionamentoEntreClasses.agenda.curso;

public class Aluno {

	private String nome;
	private int matricula;
	private double[] notas;
	
	public Aluno(String nome, int matricula, double[] notas) {
		this.nome = nome;
		this.matricula = matricula;
		this.notas = notas;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	
	private double calcularMedia(double[] notas) {
		
		double somaNotas =0;
		
		for(int i=0; i < notas.length; i++) {
			
			somaNotas += notas[i];
		}
		
		return somaNotas/notas.length;
	}
	
	private String listarNotas() {
		
		String saida = "";
		
		for(double nota : notas) {
			saida += nota + " ";
 		}
		
		return saida;
		
	}
	
	public String imprimirAluno(){
		
		//String saida;
		double media = calcularMedia(notas);
		String listarNotas = listarNotas();
		
		return  "Nome: "+getNome()+"\n"+
				"Matricula: "+getMatricula()+"\n"+
				"Notas: "+listarNotas+"\n"+
				"Media: "+media+"\n"+
				"Status: "+((media >= 7) ?  "APROVADO" :  "REPROVADO");
		
	}
	
}
