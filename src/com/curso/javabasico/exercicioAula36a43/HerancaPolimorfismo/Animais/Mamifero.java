package com.curso.javabasico.exercicioAula36a43.HerancaPolimorfismo.Animais;

public class Mamifero extends Animal{

	private String alimento;
	
	public Mamifero() {
		this.setAmbiente("terra");
		this.alimento = "mel";
	}
	
	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public String getAlimento() {
		return alimento;
	}
	
	@Override
	public String toString() {
		
		String s = "";
		
		s += super.toString();
		s += "\nAlimento: " + alimento;
		
		return s;
	}
}
