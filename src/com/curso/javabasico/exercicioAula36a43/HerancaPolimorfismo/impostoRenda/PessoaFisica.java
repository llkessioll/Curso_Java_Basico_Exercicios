package com.curso.javabasico.exercicioAula36a43.HerancaPolimorfismo.impostoRenda;

public class PessoaFisica extends Contribuinte{

	private String cpf;
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}

	@Override
	public double calcularImposto() {
		
		double renda = this.getRendaBruta();
		
		if(renda <= 1400) {
			return 0;
		}
		
		if(renda > 1400 && renda <= 2100) {
			return (renda * 0.1) - 100;
		}
		
		if(renda > 2100 && renda <= 2800) {
			return (renda * 0.15) - 270;
		}
		
		if(renda > 2800 && renda <= 3600) {
			return (renda * 0.25) - 500;
		}
		
		return (renda * 0.30) - 700;
	}

	@Override
	public String toString() {
		
		String s = "Pessoa Fisica: [";
		s += super.toString();
		s += "Cpf: " + cpf + " - ";
		s += "Imposto a ser pago: " + calcularImposto() + " ]";
		
		return s;
	}
	
}
