package com.curso.javabasico.exercicioAula25a27.Objetos.ClasseseAtributosMetodos;

public class MainLampada {

	public static void main(String[] args) {
		
		Lampada led = new Lampada();
		
		led.codigo = 1;
		led.decricao = "Lampada led 10w 220v";
		led.marca = "LED";
		led.valor = 10.00;
		
		System.out.println("Lampada led");
		System.out.println("Código: "+led.codigo);
		System.out.println("Descrição: "+led.decricao);
		System.out.println("Marca: "+led.marca);
		System.out.println("Valor: "+led.valor);
		System.out.println("A lampada está: ");
		led.ligarLampada();
		
	}
}
