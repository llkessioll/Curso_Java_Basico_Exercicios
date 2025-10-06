package com.curso.javabasico.exercicioAula20.Objetos.ClasseseAtributos;

public class MainLampada {

	public static void main(String[] args) {
		
		Lampada led = new Lampada();
		
		led.cod = 1;
		led.marca = "Ilumina";
		led.descricao = "Lampada c/ 32 leds 110/220";
		led.quantidade = 10;
		led.valor = 15.50;
		
		System.out.println("Lampada de Led");
		System.out.println("Código: "+led.cod);
		System.out.println("Marca: "+led.marca);
		System.out.println("Descrição: "+led.descricao);
		System.out.println("Quantidade: "+led.quantidade);
		System.out.println("Valor: "+led.valor);
		
		System.out.println("--------------------------------------------------");
		
		Lampada incandescente = new Lampada();
		
		incandescente.cod = 2;
		incandescente.marca = "FoxLux";
		incandescente.descricao = "Lâmpada Halógenia clássica 70w 220v";
		incandescente.quantidade = 5;
		incandescente.valor = 5.00;
		
		System.out.println("Lampada Incandecente");
		System.out.println("Código: "+incandescente.cod);
		System.out.println("Marca: "+incandescente.marca);
		System.out.println("Descrição: "+incandescente.descricao);
		System.out.println("Quantidade: "+incandescente.quantidade);
		System.out.println("Valor: "+incandescente.valor);
		
	}
}
