package com.curso.javabasico.exercicioAula36a43.HerancaPolimorfismo.Animais;

public class MainAnimal {

	public static void main(String[] args) {
		
		Animal[] zoo = new Animal[3];
		
		Animal camelo = new Animal();
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		camelo.setQuantidadePatas(4);
		camelo.setCor("Amarelo");
		camelo.setAmbiente("Terra");
		camelo.setVelocidade(2);
		
		Peixe tubarao = new Peixe();
		tubarao.setNome("Tubarão");
		tubarao.setComprimento(300);
		tubarao.setVelocidade(1.5);
		
		Mamifero urso = new Mamifero();
		urso.setNome("Urso-do-Canadá");
		urso.setComprimento(180);
		urso.setQuantidadePatas(4);
		
		zoo[0] = camelo;
		zoo[1] = tubarao;
		zoo[2] = urso;
		
		for(Animal a : zoo) {
			System.out.print("-------------------------");
			System.out.println(a.toString());
			
		}
	}
	
}
