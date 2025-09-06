package com.curso.javabasico.exercicioAula16a17.loop;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String USER = "kessio";
		String PASS = "123456";
		
		String usuario;
		String password;
		
		boolean flag  = false;
		
		while(flag != true) {
			
			System.out.println("Entre com o nome do usuario");
			usuario = teclado.next();
			System.out.println("Entre com a senha");
			password = teclado.next();
			
			if(usuario.equals(USER) && password.equals(PASS)) {
				System.out.println("Usuario e senha correto");
				flag = true;
			}else if(usuario.equals(USER) && password.equals(USER)){
				System.out.println("A senha não pode ser igual ao nome de usuario");
			}else {
				System.out.println("Usuario e senha incorretos");
			}
			
		}
		
		teclado.close();
	}
}
