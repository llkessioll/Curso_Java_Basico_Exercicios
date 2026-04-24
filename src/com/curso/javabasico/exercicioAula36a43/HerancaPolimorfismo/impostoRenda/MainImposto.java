package com.curso.javabasico.exercicioAula36a43.HerancaPolimorfismo.impostoRenda;

public class MainImposto {

	public static void main(String[] args) {
	
		Contribuinte[] contribuintes = new Contribuinte[6];
		
		PessoaFisica p1 = new PessoaFisica();
		p1.setNome("Contribuinte Pessoa Fisica 1");
		p1.setCpf("111.666.222-88");
		p1.setRendaBruta(1000);
		
		PessoaFisica p2 = new PessoaFisica();
		p2.setNome("Contribuinte Pessoa Fisica 2");
		p2.setCpf("222.333.444-55");
		p2.setRendaBruta(2700);
		
		PessoaFisica p3 = new PessoaFisica();
		p3.setNome("Contribuinte Pessoa Fisica 3");
		p3.setCpf("333.555.666-99");
		p3.setRendaBruta(5700);
		
		PessoaJuridica pj1 = new PessoaJuridica();
		pj1.setNome("Pessoa Juridica 1");
		pj1.setCnpj("41.519.268/0001-11");
		pj1.setRendaBruta(5000);
		
		PessoaJuridica pj2 = new PessoaJuridica();
		pj2.setNome("Pessoa Juridica 2");
		pj2.setCnpj("40.504.403/0001-92");
		pj2.setRendaBruta(15000);
		
		PessoaJuridica pj3 = new PessoaJuridica();
		pj3.setNome("Pessoa Juridica 3");
		pj3.setCnpj("82.858.101/0001-62");
		pj3.setRendaBruta(100000);
		
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		contribuintes[2] = p3;
		contribuintes[3] = pj1;
		contribuintes[4] = pj2;
		contribuintes[5] = pj3;
		
		for(Contribuinte c: contribuintes) {
			System.out.println(c.toString());
		}
		
	}
	
}
