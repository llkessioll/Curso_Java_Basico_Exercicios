package com.curso.javabasico.exercicioAula20.matrizes;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String[][] agenda = new String[32][25];
		
		int opcao =0;
		int dia, hora;
		String compromisso;
		
		System.out.println("Digite uma opção");
		
		while(true) {
			
			menu();
			opcao = teclado.nextInt();
			
			if(opcao == 1) {
				
				System.out.println("Novo compromisso");
				System.out.println("Digite o dia do compromisso");
				dia = teclado.nextInt();
				while(dia < 1 || dia > 31) {
					System.out.println("Erro: os dias devem ser entre 1 e 31 - Digite novamente");
					dia = teclado.nextInt();
				}
				System.out.println("Digite a hora do compromisso");
				hora = teclado.nextInt();
				while(hora < 0 || hora > 24) {
					System.out.println("Erro: as horas devem estar entra 0:00 e 24:00 - Digite novamenete");
					hora = teclado.nextInt();
				}
				
				System.out.println("Digite o compromisso");
				compromisso = teclado.nextLine();
				while(compromisso.length() < 5) {
					System.out.println("Erro: Compromisso não digitado entre digite um texto para poder salvar");
					compromisso = teclado.nextLine();
				}
				
				agenda[dia][hora] = adicionarNovoCompromisso(dia, hora, compromisso, agenda);
				
			}else if(opcao == 2) {
				
				System.out.println("Listando compromissos");
				
				imprimirAgenda(agenda);
				
			}else {
				System.out.println("Saindo da agenda ...");
				break;
			}
			
		}
		
		teclado.close();
		
	}
	
	public static String adicionarNovoCompromisso(int dia, int hora, String compromisso,String[][] agenda) {
		
		return agenda[dia][hora] = compromisso;
		
	}
	
	public static void imprimirAgenda(String[][] agenda) {
		
		for(int i=0; i < agenda.length; i++) {
			
			for(int j=0; j < agenda[i].length; j++) {
				if(agenda[i][j] != null) {
					System.out.println("Compromisso - "+agenda[i][j] +" - Dia: "+i+" Hora: "+j);
				}
			}
			
			//System.out.println();
		}
		
	}
	
	public static void menu( ) {
		
		System.out.println("");
		
		System.out.println("1 - Novo Compromisso");
		System.out.println("2 - Listar Todos os compromissos");
		System.out.println("9 - Sair da agenda");
		
	}
}
