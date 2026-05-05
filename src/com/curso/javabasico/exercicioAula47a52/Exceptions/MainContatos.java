package com.curso.javabasico.exercicioAula47a52.Exceptions;

import java.util.Scanner;

public class MainContatos {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();
		
		Scanner teclado = new Scanner(System.in);
		
		int opcao = 1;
		
		while(opcao != 0) {
			opcao = menuPrincipal(teclado);
			
			if(opcao == 1) { // Cadastrar um novo contato
				
				adicionarContato(teclado, agenda);
				
			}else if(opcao == 2) { // Buscar um contato
				
				String nomeContato = buscarContatoPorNome(teclado, "Entre com o nome do contato !");
				
				try {
					
					if(agenda.buscarPorNome(nomeContato) >= 0) {
						System.out.println(agenda.toString());
					}
					
				}catch(ContatoNaoExiste e) {
					System.out.println(e.getMessage());
				}
				
			}else { // Sair
				System.exit(0);
			}
		}
		
		
		
	}
	
	public static void adicionarContato(Scanner scan, Agenda agenda) {
		
		System.out.println("Cadastrando um novo contato !");
		
		String nome = buscarContatoPorNome(scan, "Entre com o nome do contato: ");
		String telefone = buscarContatoPorNome(scan, "Entre com o telefone do contato: ");
		
		Contato contao = new Contato(nome, telefone);
		
		try {
			
			agenda.addContato(contao);
		
		} catch (AgendaCheiaException e) {
			
			System.out.println(e.getMessage());
			
			System.out.println(agenda.toString());
		}
		
	}
	
	public static String buscarContatoPorNome(Scanner scan, String mensagem) {
		
		System.out.println(mensagem);
		
		String entrada = scan.nextLine();
		
		return entrada;
		
	}
	
	public static int menuPrincipal(Scanner scan) {
		
		boolean entrada = false;
		int opcao = 3;
		
		while(!entrada) {
			
			System.out.println("================= AGENDA TELEFONICA =================");
			System.out.println("1 - Para cadastrar novo contato");
			System.out.println("2 - Para Buscar novo contato");
			System.out.println("0 - Para sair");
			
			try {
				
				String newEntrada = scan.nextLine();
				opcao = Integer.parseInt(newEntrada);
				
				if(opcao != 1 || opcao != 2 || opcao != 3) {
					
					entrada = true;
				}else {
					
					throw new Exception("Entrada inválida");
				}
				
			}catch(Exception e) {
				System.out.println("Entrada inválida. Digite uma opção valida.");
			}
		}
		
		return opcao;
		
	}
	
}
