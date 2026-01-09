package com.curso.javabasico.exercicioAula35.metodosRecursivos;

public class SomatorioDeN {

	public static int somarN(int num) {
		
		if(num == 1) {
			return 1;
		}
		
		return num + somarN(num -1);
		
	}
	
}
