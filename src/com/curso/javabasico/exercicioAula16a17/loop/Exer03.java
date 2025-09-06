package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nome = "";
		int idade = -1;
		double salario = -1.0;
		char sexo =' ';
		char estadoCivil = ' ';
		
		System.out.println("Digite o nome");
		while(nome.length() < 3) {
			
			nome = teclado.next();
			
			if(nome.length() >3) {
				System.out.println("Entrada correta");
			}else {
			
				System.out.println("O nome deve ter mais de 3 caracteres");
			}
		}
		
		System.out.println("Digite a idade");
		while(idade <= 0 || idade > 150) {
			
			idade = teclado.nextInt();
			
			if(idade > 0 || idade > 150) {
				System.out.println("Idade correta");
			}else {
				System.out.println("A idade deve esta entre 1 e 150");
			}
			
		}
		
		System.out.println("Digite seu salario");
		while(salario <=0) {
			
			salario = teclado.nextDouble();
			
			if(salario > 0 ) {
				System.out.println("Salario informado aceito");
			}else {
			
				System.out.println("O salario deve ser maior que zero");
			}
		}
		
		System.out.println("Entre com o sexo f ou m");
		while(sexo != 'f' && sexo != 'm') {
			
			//sexo = teclado.next().charAt(0);
			sexo = Character.toLowerCase(teclado.next().charAt(0));

			
			switch(sexo) {
				
				case 'm':
				case 'M':
					System.out.println("Masculino");
					break;
				case 'f':
				case 'F':
					System.out.println("Feminino");
					break;
				default:
					System.out.println("O sexo deve ser M, F");
			}
			
			
		}
		
		System.out.println("Digite seu estado civil: s-solteriro, c-casa, v-viuvo, d-divorceado");
		while(estadoCivil != 's' && estadoCivil != 'c'&& estadoCivil != 'v' && estadoCivil != 'd') {
			
			//estadoCivil = teclado.next().charAt(0);
			estadoCivil = Character.toLowerCase(teclado.next().charAt(0));
			
			switch(estadoCivil) {
			
				case 's':
				case 'S':
					System.out.println("Solteiro");
					break;
				case 'c':
				case 'C':
					System.out.println("Casado");
					break;
				case 'v':
				case 'V':
					System.out.println("Viuvo");
					break;
				case 'd':
				case 'D':
					System.out.println("Divorciado");
					break;
				default:
					System.out.println("O estado civil deeve ser compativel com as opções passadas anteriormente");
			}
			
			
		}
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sálario: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civil: " + estadoCivil);

		teclado.close();
	}
}
