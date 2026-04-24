package com.curso.javabasico.exercicioAula36a43.HerancaPolimorfismo.impostoRenda;

public class PessoaJuridica extends Contribuinte{
	
	private String cnpj;
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	public String getCpnj() {
		return cnpj;
	}


	@Override
	public double calcularImposto() {
		return this.getRendaBruta() * 0.1;
	}


	@Override
	public String toString() {
		
		String s = "Pessoa Juridica: [ ";
		s += super.toString();
		s += "Cnpj: " + cnpj + " - ";
		s += "Imposto a ser pago: " + calcularImposto() + " ]";
		
		return s;
	}
	
	
}
