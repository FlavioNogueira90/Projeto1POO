package com.posInfnet.proj1POO.testes;

import com.posInfnet.proj1POO.dominio.Comida;
import com.posInfnet.proj1POO.dominio.Produto;

public class ComidaTeste {

	
	public static void main(String[] args) {
		
		Comida com1 = new Comida(1, "Big Tasty", 27.00, null, 500.00, false, "Hamburger bovino grelhado, pao, alface, cebola roxa");
		Comida com2 = new Comida(2,"Big Mac", 25.00, null, 400.00, false, "Dois Hamburger bovino grelhado, pao, queijo, molho especial, picles, cebola");
		Comida com3 = new Comida(3, "Mc Queteirao", 21.00, null, 300.00, false, "Hamburger bovino grelhado, pao, queijo");
		Produto prod1 = new Comida(4, "Mc lanche", 15.00, null, 300.00, false, "pao, hamburger, queijo");
		
		System.out.println(com1);
		System.out.println(com2);
		System.out.println(com3);
		System.out.println(prod1);
	}

}
