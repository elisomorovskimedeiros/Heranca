/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * Java doc para teste no git
 */
public class Heranca {

    /**
     * Colocando java docs na classe main
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Vou exibir o nome do ornitorrinco");
        
        System.out.println("Estou realizando a apresentação");
        
        
        
        	Animal a1 = new Animal("Orni","Ornitorrinco",10);
		Mamifero m1 = new Mamifero("Golfinho","Golfinho");
		a1.setNome("Orn");
		m1.setNome("Flipper");
		System.out.println("O animal a1 tem nome: " + a1.getNome());
		System.out.println("O mamifero m1 nome: " + m1.getNome());
	
    }
    
}
