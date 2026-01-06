package com.curso.javabasico.exercicioAula34.VariaveisMetodosEstaticos;

public class ConversaoDeUnidadeDeVolume {

	public static double converterLitroEmCentimetrosCubico(double litros) {
		return litros * 1000;
	}
	
	public static double converterMetroCubicoEmLitros(double metroCubico) {
		return metroCubico * 1000;
	}
	
	public static double converterMetroCubicoEmPesCubicos(double metroCubico) {
		return metroCubico * 35.32;
	}
	
	public static double converterGalaoAmericanoEmPolegadaCubica(double galaoAmericano) {
		return galaoAmericano * 231;
	}
	
	public static double converterGalaoAmericanoEmLitros(double galaoAmericano) {
		return galaoAmericano * 3.785;
	}
	
	
}
