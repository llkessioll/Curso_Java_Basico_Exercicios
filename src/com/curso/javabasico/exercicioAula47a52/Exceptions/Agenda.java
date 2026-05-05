package com.curso.javabasico.exercicioAula47a52.Exceptions;

public class Agenda{

	Contato[] contatos = new Contato[10];
	
	
	public void addContato(Contato c) throws AgendaCheiaException {
	
		int qtdContatos = contarContatos();
		
		if(qtdContatos < contatos.length) {
			
			for(int i=0; i < contatos.length; i++) {
				if(contatos[i] == null) {
					contatos[i] = c;
					return;
				}
			}
			
		}else{
			throw new AgendaCheiaException();
		}
		
	}
	
	
	public int buscarPorNome(String nome) throws ContatoNaoExiste {
		
		for(int i=0; i < contatos.length; i++) {
			
			if(contatos[i] != null) {
				if(contatos[i].getNome().equalsIgnoreCase(nome)) {
					return i;
				}
			}
			
		}
		
		throw new ContatoNaoExiste();
	}
	
	private int contarContatos() {
		
		int qtdContatos = 0;
		
		for(int i=0; i < contatos.length; i++){
			if(contatos[i] != null) {
				qtdContatos ++;
			}
		}
		
		return qtdContatos;
	}
	
	public String toString() {
		
		String s = "";
		
		for(Contato c : contatos) {
			if(c != null) {
				s += c.toString() + "\n";
			}
		}
		
		return s;
	}
	
}
