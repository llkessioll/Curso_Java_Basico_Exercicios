package com.curso.javabasico.exercicioAula34.VariaveisMetodosEstaticos;

public class ConversaoDeUnidadesDeArea {

	public static double metroQuadradoParaPeQuadrado(double metroQuadrado) {
		return metroQuadrado * 10.76;
	}
	
	public static double peQuadradoParaCentimetroQuadrado(double peQuadrado) {
		return peQuadrado * 929;
	}
	
	public static double milhaQuadradaParaAcre(double milhaQuadrada) {
		return milhaQuadrada * 640;
	}
	
	public static double acreParaPeQuadrado(double acre) {
		return acre * 43560;
	}
}
