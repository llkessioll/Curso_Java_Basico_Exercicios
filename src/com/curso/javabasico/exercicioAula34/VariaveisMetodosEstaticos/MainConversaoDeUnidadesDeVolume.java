package com.curso.javabasico.exercicioAula34.VariaveisMetodosEstaticos;

public class MainConversaoDeUnidadesDeVolume {

	public static void main(String[] args) {
		
		System.out.println("Conversão de unidade de Volume.");
		
		System.out.println("\nLitros em Centimetros cubicos");
		double centimetrosCubicos = ConversaoDeUnidadeDeVolume.converterLitroEmCentimetrosCubico(3);
		System.out.println("Tres litros equivalem a " + centimetrosCubicos+" Centimetros Cubicos");
		
		System.out.println("\nMetros cubicos em Litros");
		double litros = ConversaoDeUnidadeDeVolume.converterMetroCubicoEmLitros(3);
		System.out.println("Tres metros cubicos equivalem a "+litros+" Litros");
		
		System.out.println("\nMetros Cubicos em PesCubicos");
		double pesCubicos = ConversaoDeUnidadeDeVolume.converterMetroCubicoEmPesCubicos(3);
		System.out.println("Tres metros cubicos equivalem a "+pesCubicos+" Pes Cubicos");
		
		System.out.println("\nGalao Americano em Polegada Cubica");
		double galaoCubico = ConversaoDeUnidadeDeVolume.converterGalaoAmericanoEmPolegadaCubica(3);
		System.out.println("Tres Galoes Americanos equivalem "+galaoCubico+" Polegada Cubicas");
		
		System.out.println("\nGalao Americano em Litros");
		double litrosDois = ConversaoDeUnidadeDeVolume.converterGalaoAmericanoEmLitros(3);
		System.out.println("Tres Galoes Americanos equivalem a "+litrosDois+" Litros");
	}
}
