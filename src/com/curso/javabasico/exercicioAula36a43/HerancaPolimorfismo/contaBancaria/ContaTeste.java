package com.curso.javabasico.exercicioAula36a43.HerancaPolimorfismo.contaBancaria;

public class ContaTeste {
	
	public static void main(String[] args) {
		
		System.out.println("Conta Poupança");
		
		ContaPoupanca poupanca = new ContaPoupanca("Fulano Silva", "123", 1200);
		poupanca.setDiaRendimento(2);
		
		poupanca.depositar(1000);
		
		System.out.println(poupanca.infoConta());
		
		System.out.println(poupanca.sacar(200));
		poupanca.calcularNovoSaldo(10);
		
		System.out.println(poupanca.infoConta());
		
		System.out.println("\nConta especial");
		ContaEspecial especial = new ContaEspecial("Conta especial", "123456-7", 50, 1000);
		
		System.out.println(especial.infoConta());
		
		System.out.println(especial.sacar(50));
		
		System.out.println(especial.infoConta());
		
		
		
	}

}
