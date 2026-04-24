package com.curso.javabasico.exercicioAula36a43.HerancaPolimorfismo.Animais;

public class Peixe extends Animal{
	
	private String caracteristicas;
	
	public Peixe() {
		this.setQuantidadePatas(0);
		this.setAmbiente("mar");
		this.setCor("cinzenta");
		this.caracteristicas = "barbatanas e calda";
	}
	
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	public String getCaracteristicas() {
		return caracteristicas;
	}
	
	@Override
	public String toString() {
		
		String s = "";
		
		s += super.toString();
		s += "\nCaracteristicas: " + caracteristicas;
		
		return s;
		
	}

}
