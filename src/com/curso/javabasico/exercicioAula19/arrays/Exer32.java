package com.curso.javabasico.exercicioAula19.arrays;

public class Exer32 {

	public static void main(String[] args) {
		
		int[] numeros = new int[] {1, 2, 3, 4, 5};
		
		for(int i=0; i < numeros.length; i++) {
			
			System.out.println("Tabuada de "+numeros[i]);
			
			for(int j = 1; j <= 10; j++) {
				
				System.out.println(numeros[i] +"*"+j+" = "+(numeros[i]*j));
				if(j == 10) {
					System.out.println("--------------------------");
				}
			}
			
		}
		
	}
	
}
