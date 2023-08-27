package com.posInfnet.proj1POO.testes;

import com.posInfnet.proj1POO.dominio.Sobremesa;

public class SobremesaTeste {

	
	public static void main(String[] args) {

		Sobremesa sob1 = new Sobremesa(1, "MC Flury ovo maltine", 13.00, null, 1.0, true, "Sorvete de creme com ovo maltine");
		Sobremesa sob2 = new Sobremesa(2, "MC Colosso", 3.50, null, 1.0, true, "Sorvete de creme com cobertura de chocolate");
		Sobremesa sob3 = new Sobremesa(3, "Milk shake", 15.00, null, 1.0, true, "Sorvete de creme com leite");

		System.out.println(sob1);
		System.out.println(sob2);
		System.out.println(sob3);
	}

}
