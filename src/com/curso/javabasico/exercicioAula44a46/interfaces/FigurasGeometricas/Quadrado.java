package com.curso.javabasico.exercicioAula44a46.interfaces.FigurasGeometricas;

public class Quadrado extends Figura2D implements DimensaoSuperficial{

	private double lado;
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}
	
	@Override
	public double calcularArea() {
		
		return lado * lado;
	
	}
}
