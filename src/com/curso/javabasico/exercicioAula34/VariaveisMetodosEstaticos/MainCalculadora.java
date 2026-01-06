package com.curso.javabasico.exercicioAula34.VariaveisMetodosEstaticos;

public class MainCalculadora {

	public static void main(String[] args) {
		
		double soma;
		double divisao, divisaoZero;
		double multiplicao;
		double subtracao;
		int fatorial;
		
		soma = Calculadora.soma(19, 2);
		multiplicao = Calculadora.multiplicacao(10, 2);
		subtracao = Calculadora.subtracao(100, 55.5);
		divisao = Calculadora.divisao(2, 1.5);
		divisaoZero = Calculadora.divisao(10, 0);
		fatorial = Calculadora.fatorial(5);
		
		
		
		System.out.println("Soma: "+soma);
		System.out.println("Divisao: "+divisao);
		System.out.println("Divisão com zero: "+divisaoZero);
		System.out.println("Multiplicação: "+multiplicao);
		System.out.println("Subtração: "+subtracao);
		System.out.println("Fatorial: "+fatorial);
		
	}
}
