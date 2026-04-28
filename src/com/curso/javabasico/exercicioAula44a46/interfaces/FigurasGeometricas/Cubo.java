package com.curso.javabasico.exercicioAula44a46.interfaces.FigurasGeometricas;

public class Cubo extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica{

	private double lado;
	
	
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		
		return 6 * (lado*lado);
	}
	
	@Override
	public double calcularVolume() {
		return lado * lado * lado;
	}
	
}
