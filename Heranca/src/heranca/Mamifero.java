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
public class Mamifero extends Animal{
	public Mamifero(String nome, String especie, int idade){
		super(nome,especie,idade);
	}
	public Mamifero(String nome, String especie){
		super(nome,especie);
	}
	public Mamifero(){
		super();
	}
	public void amamentar(){
		System.out.println("O mamifero está amamentando");
	}
}
