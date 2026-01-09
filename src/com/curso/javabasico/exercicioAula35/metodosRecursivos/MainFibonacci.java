package com.curso.javabasico.exercicioAula35.metodosRecursivos;

public class MainFibonacci {

	public static void main(String[] args) {
		
		FibonacciRecursivo fibonacci = new FibonacciRecursivo();
		
		int resultado = fibonacci.fibonacci(5);
		
		System.out.println("Sequencia fibonnaci de 5:");
		System.out.println(resultado);
		
	}
}
