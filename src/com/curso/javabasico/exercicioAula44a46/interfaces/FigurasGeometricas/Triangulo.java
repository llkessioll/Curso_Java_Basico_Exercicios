package com.curso.javabasico.exercicioAula44a46.interfaces.FigurasGeometricas;

public class Triangulo extends Figura2D implements DimensaoSuperficial{

	private double base;
	private double altura;
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getBase() {
		return base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	@Override
	public double calcularArea() {
		
		return base * altura / 2;
	
	}
}
