package com.curso.javabasico.exercicioAula36a43.HerancaPolimorfismo.contaBancaria;

public class ContaPoupanca extends ContaBancaria{

	private int diaRendimento;

	public ContaPoupanca(String nomeCliente, String numConta, double saldo) {
		super(nomeCliente, numConta, saldo);
		
	}

	public ContaPoupanca(String nomeCliente, String numConta) {
		super(nomeCliente, numConta);
		
	}
	
	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public int getDiaRendimento() {
		return this.diaRendimento;
	}
	
	
	public void calcularNovoSaldo(double taxaRendimeto) {
		
		double rendimento = getSaldo() * taxaRendimeto;
		setSaldo(getSaldo() + rendimento);
	
	}
	
	
	public String infoConta() {
		
		return "Num Conta: "+getNumConta()+"\nCliente: "+getNomeCliente()+"\nSaldo: "+getSaldo()+"\nDias de rendimento de juros: "+getDiaRendimento();
		
	}
	
	
}
