package com.curso.javabasico.exercicioAula34.VariaveisMetodosEstaticos;

public class MainConversoUnidadesArea {

	public static void main(String[] args) {
		
		double metros = 10;
		double pe =0;
		
		pe = ConversaoDeUnidadesDeArea.metroQuadradoParaPeQuadrado(metros);
		System.out.println(metros+" m^2 = "+pe+ " Pes^2");
	
		double acre = ConversaoDeUnidadesDeArea.acreParaPeQuadrado(2);
		System.out.println("2 Pes^2 = "+acre+" Acres");
	}
}
