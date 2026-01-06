package com.curso.javabasico.exercicioAula34.VariaveisMetodosEstaticos;

public class ConversaoDeUnidadesDeTempo {

	public static double converterMinutoEmSegundos(double minuto) {
		return minuto*60;
	}
	
	public static double converterHoraEmMinutos(double hora) {
		return hora*60;
	}
	
	public static double converterDiasEmHoras(double dia) {
		return dia*24;
	}
	
	public static double converterSemanaEmDias(double semana) {
		return semana*7;
	}
	
	public static double converterMesEmDias(double mes) {
		return mes*30;
	}
	
	public static double converterAnoEmDias(double ano) {
		return ano*365.25;
	}
}
