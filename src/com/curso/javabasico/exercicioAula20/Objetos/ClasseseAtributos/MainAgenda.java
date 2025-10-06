package com.curso.javabasico.exercicioAula20.Objetos.ClasseseAtributos;

public class MainAgenda {

	public static void main(String[] args) {
		
		Agenda contatoUm = new Agenda();
		
		contatoUm.cod = 1;
		contatoUm.email = "contato@email.com";
		contatoUm.nome = "Contato";
		contatoUm.numero = "123456789";
		
		System.out.println("Codigo: "+contatoUm.cod);
		System.out.println("E-mail: "+contatoUm.email);
		System.out.println("Nome: "+contatoUm.nome);
		System.out.println("Numero: "+contatoUm.numero);
		
		System.out.println("-----------------------------------");
		
		Agenda contatoDois = new Agenda();
		
		contatoDois.cod = 2;
		contatoDois.email = "contatoDois@email.com";
		contatoDois.nome = "Contato Dois";
		contatoDois.numero = "987654321";
		
		System.out.println("Codigo: "+contatoDois.cod);
		System.out.println("E-mail: "+contatoDois.email);
		System.out.println("Nome: "+contatoDois.nome);
		System.out.println("Numero: "+contatoDois.numero);
	}
	
}
