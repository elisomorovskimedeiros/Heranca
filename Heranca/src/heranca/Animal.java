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
public class Animal {
	private String nome;
	private String especie;
	private int idade;
	public Animal(String nome, String especie, int idade){
		this.nome = nome;
		this.especie = especie;
		this.idade = idade;
	}
	public Animal(String nome, String especie){
		this(nome, especie, 0); //esta linha faz o mesmo das 3 linhas abaixo
		/*this.nome = nome;
		this.especie = especie;
		this.idade = 0;*/
	}
	public void digere(String comida){
		System.out.println("O animal está digerindo a comida: " + comida);
	}
	public Animal(){
		this("Sem nome", "Sem especie", 0);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if (idade > 0)
			this.idade = idade;
		else
			System.out.println("A idade deve ser mair que 0!");
	}
}
