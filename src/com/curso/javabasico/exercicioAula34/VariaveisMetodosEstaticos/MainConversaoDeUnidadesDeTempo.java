package com.curso.javabasico.exercicioAula34.VariaveisMetodosEstaticos;

public class MainConversaoDeUnidadesDeTempo {

	public static void main(String[] args) {
		
		System.out.println("Convertendo Tempo");
		
		double minutosEmHoras = ConversaoDeUnidadesDeTempo.converterMinutoEmSegundos(4);
		System.out.println("Cento e vinte minutos equivalem a "+ minutosEmHoras +" segundos");
		
		double horaEmMinutos = ConversaoDeUnidadesDeTempo.converterHoraEmMinutos(4);
		System.out.println("Quatro horas equiavalem a "+horaEmMinutos+" minutos");
		
		double diasEmHoras = ConversaoDeUnidadesDeTempo.converterDiasEmHoras(4);
		System.out.println("Quatro dias equivalem a "+diasEmHoras+" horas");
		
		double semanasEmDias = ConversaoDeUnidadesDeTempo.converterSemanaEmDias(4);
		System.out.println("Quatro semanas equivalem a "+semanasEmDias+" dias");
		
		double mesEmDias = ConversaoDeUnidadesDeTempo.converterMesEmDias(4);
		System.out.println("Quatro meses equivalem a "+mesEmDias+" dias");
		
	}
}
