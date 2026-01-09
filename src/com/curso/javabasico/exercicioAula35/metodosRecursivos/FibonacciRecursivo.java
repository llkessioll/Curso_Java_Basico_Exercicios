package com.curso.javabasico.exercicioAula35.metodosRecursivos;

public class FibonacciRecursivo {

	public int fibonacci(int num) {
		
		if(num == 1) {
			return 0;
		}else if(num == 2) {
			return 1;
		}
		
		return fibonacci(num - 1) + fibonacci(num - 2);
	}
	
}
