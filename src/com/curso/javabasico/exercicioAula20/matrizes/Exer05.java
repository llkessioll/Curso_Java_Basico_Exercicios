package com.curso.javabasico.exercicioAula20.matrizes;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String[][][] agenda = new String[12][31][12];
		
		String compromisso;
		
		int mes, dia, hora, opcao, buscaPorMes;
		
		System.out.println("Agenda de compromissos");
		
		while(true) {
			
			menu();
			
			opcao = teclado.nextInt();
			
			if(opcao == 1) {
				System.out.println("Entrada de um novo compromisso");
				
				System.out.println("Entre com um valor de 1 até 12 para o mes");
				mes = teclado.nextInt();
				while(mes < 1 || mes > 12) {
					System.out.println("Apenas valores entre 1 e 12 são permitidos: Digite novamente");
					mes = teclado.nextInt();
				}
				
				System.out.println("Entre com um valor de 1 até 31 para o dia");
				dia = teclado.nextInt();
				while(dia <=0  || dia > 31) {
					System.out.println("Apenas valores entre 1 e 31 são permitidos: Digite novamente");
					dia = teclado.nextInt();
				}
				
				System.out.println("Entre com um valor para a hora");
				hora = teclado.nextInt();
				while(hora <=0 || hora > 12) {
					System.out.println("Apenas valores entre 1 e 12 são permitidos: Digite novamente");
					hora = teclado.nextInt();
				}
				
				System.out.println("Digite seu compromisso: ");
				compromisso = teclado.nextLine();
				while(compromisso.length() < 5) {
					System.out.println("Entre com um texto com mais de 5 caracteres");
					compromisso = teclado.nextLine();
				}
				
				agenda[mes][dia][hora] = compromisso;
			}else if(opcao == 2) {
				
				System.out.println("Listando todos os compromissos");
				
				imprimirCompromissos(agenda);
			}else if(opcao == 3){
				
				System.out.println("Entre com o mes deseja para verificar os compromissos");
				buscaPorMes = teclado.nextInt();
				while(buscaPorMes < 1 || buscaPorMes > 12) {
					System.out.println("Somente valores entre 1 e 12 são permitidos: Digite novamente");
					buscaPorMes = teclado.nextInt();
				}
				
				imprimirCompromissoPorMes(agenda, buscaPorMes);
				
			}else {
				System.out.println("Saindo do sistema ...");
				break;
			}
			
		}
		
		teclado.close();
		
	}
	
	public static void imprimirCompromissos(String[][][] agenda) {
		
		for(int i=0; i < agenda.length; i++) {
			
			for(int j =0; j < agenda[i].length; j++) {
				
				for(int k =0; k < agenda[i][j].length; k++) {
					
					if(agenda[i][j][k] != null) {
						System.out.println("Compromisso - "+agenda[i][j][k]+" Mes: "+i+" Dia: "+j+" as "+k+" Horas");
					}
					
				}
			}
		}
		
	}
	
	public static void imprimirCompromissoPorMes(String[][][] agenda, int mes) {
		
		for(int i=0; i < agenda.length; i++) {
			
			if(i == mes) {
				
				for(int j=0; j < agenda[i].length; j++) {
					
					for(int k =0; k < agenda[i][j].length; k++) {
						
						if(agenda[i][j][k] != null) {
							System.out.println(agenda[i][j][k]);
						}
					}
					
				}
						
			}
		}
	}
	
	public static void menu() {
		
		System.out.println("Escolha uma opção");
		
		System.out.println("1 - Novo compromisso");
		System.out.println("2 - Listar todos os compromissos");
		System.out.println("3 - Listar compromissos por mes");
		System.out.println("9 - Sair do sistema");
		
	}
}
