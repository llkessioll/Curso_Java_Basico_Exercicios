package com.curso.javabasico.exercicioAula36.RelacionamentoEntreClasses.agenda;

public class MainAgenda {

	public static void main(String[] args) {
		
		Contato contatoUm = new Contato();
		Contato contatoDois = new Contato();
		
		Agenda agenda = new Agenda();
		
		Contato contatos[] = new Contato[2];
		
		contatoUm.setNome("Juliana");
		contatoUm.setEmail("juliana@email.com");
		contatoUm.setTelefone("87-99999-9999");
		
		contatos[0] = contatoUm;
		
		contatoDois.setNome("Valeria");
		contatoDois.setEmail("valeria@email.com");
		contatoDois.setTelefone("98-98888-7777");
		
		contatos[1] = contatoDois;
		
		agenda.setNome("Agenda Carol");
		agenda.setContatos(contatos);
		
		
		System.out.println(agenda.getNome());
		for(Contato c : agenda.getContatos()) {
			
			if(c != null) {
				System.out.println("Nome: "+c.getNome());
				System.out.println("E-mail: "+c.getEmail());
				System.out.println("Telefone: "+c.getTelefone());
			}
			
		}
		
	}
	
}
