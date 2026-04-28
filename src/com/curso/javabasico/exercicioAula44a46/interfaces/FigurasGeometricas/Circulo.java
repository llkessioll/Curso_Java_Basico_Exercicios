package com.curso.javabasico.exercicioAula44a46.interfaces.FigurasGeometricas;

public class Circulo extends Figura2D implements DimensaoSuperficial{

	double area;
	
	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public double calcularArea() {
		
		return Math.PI * Math.pow(area, 2) ;
	
	}

}
