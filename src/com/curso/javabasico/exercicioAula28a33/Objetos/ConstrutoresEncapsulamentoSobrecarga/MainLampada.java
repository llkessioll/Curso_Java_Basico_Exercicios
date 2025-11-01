package com.curso.javabasico.exercicioAula28a33.Objetos.ConstrutoresEncapsulamentoSobrecarga;

public class MainLampada {

	public static void main(String[] args) {
		
		Lampada lampadaUm = new Lampada();
		
		lampadaUm.setMarca("Ilumine");
		lampadaUm.setModelo("LED");
		lampadaUm.setDescricao("Lampada c/ 32 Leds");
		lampadaUm.setPreco(15.75);
		lampadaUm.setQuantidade(1000);
		
		System.out.println("Lampada UM");
		System.out.println("Marca: "+lampadaUm.getMarca());
		System.out.println("Modelo: "+lampadaUm.getModelo());
		System.out.println("Descrição: "+lampadaUm.getDescricao());
		System.out.println("Preço: "+lampadaUm.getPreco());
		System.out.println("Quantidade: "+lampadaUm.getQuantidade());
	}
}
