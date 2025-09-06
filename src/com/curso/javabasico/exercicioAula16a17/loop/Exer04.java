package com.curso.javabasico.exercicioAula16a17.loop;

public class Exer04 {

	public static void main(String[] args) {
		
		//Scanner teclado = new Scanner(System.in);
		
		double populacaoA = 80000;
		double populacaoB = 200000;
		int contAnos = 0;
		
		double taxaCrescimentoA = 0.03;
		double taxaCrescimentoB = 0.015;
		
		
		while(populacaoA < populacaoB) {
			
			populacaoA += populacaoA * taxaCrescimentoA;
			populacaoB += populacaoB * taxaCrescimentoB;
			
			contAnos ++;
			
		}
		
		System.out.println("Para que a populacao A ultrapasse a populacao B levara cerca de "+contAnos+" anos");
		
		
		//teclado.close();
	}
}
