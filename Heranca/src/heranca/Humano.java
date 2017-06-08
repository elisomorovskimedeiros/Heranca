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
public class Humano extends Primata{
	public Humano(String nome, int idade){
		super(nome,"Humano",idade);
	}
	public Humano(String nome){
		super(nome,"Humano",0);
	}
	public Humano(){
		super("Sem nome","Humano",0);
	}
}
