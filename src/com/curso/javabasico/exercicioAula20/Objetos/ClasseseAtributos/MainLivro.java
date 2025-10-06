package com.curso.javabasico.exercicioAula20.Objetos.ClasseseAtributos;

public class MainLivro {

	public static void main(String[] args) {
		
		Livro livroUm = new Livro();
		
		livroUm.isnb = "123456";
		livroUm.titulo = "A paixão segundo G.H";
		livroUm.descricao = "Romance desprovido das características próprias do gênero";
		livroUm.autor = "Clarice Lispector";
		livroUm.editora = "Rocco";
		
		System.out.println("ISBN: "+livroUm.isnb);
		System.out.println("Titulo: "+livroUm.titulo);
		System.out.println("Descrição: "+livroUm.descricao);
		System.out.println("Autor(a): "+livroUm.autor);
		System.out.println("Editora: "+livroUm.editora);
		
		System.out.println("------------------------------------------");
		
		Livro livroDois = new Livro();
		
		livroDois.isnb = "987654321";
		livroDois.titulo = "Qualquer livro";
		livroDois.descricao = "Livro livro livro livro livro";
		livroDois.autor = "Autor";
		livroDois.editora = "Editora";
		
		System.out.println("ISBN: "+livroDois.isnb);
		System.out.println("Titulo: "+livroDois.titulo);
		System.out.println("Descrição: "+livroDois.descricao);
		System.out.println("Autor(a): "+livroDois.autor);
		System.out.println("Editora: "+livroDois.editora);
		
	}
}
