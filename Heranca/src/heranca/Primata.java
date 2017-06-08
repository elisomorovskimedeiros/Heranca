package heranca;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eli
 */
public class Primata extends Mamifero {
	public Primata(String nome, String especie, int idade){
		super(nome,especie,idade);
	}
	public Primata(String nome, String especie){
		super(nome,especie);
	}
	public Primata(){
		super();
	}
	public void dedos(){
		System.out.println("O primata tem 5 dedos em cada mão, sendo um deles o polegar opositor.");
	}
}
