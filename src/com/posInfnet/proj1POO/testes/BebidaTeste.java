package com.posInfnet.proj1POO.testes;

import com.posInfnet.proj1POO.dominio.Bebida;

public class BebidaTeste {

	
	public static void main(String[] args) {

		Bebida beb1 = new Bebida(1, "Refrigente laranja", 5.00, null, true, 500.00, "Fanta");
		Bebida beb2 = new Bebida(2, "Refrigente limao", 5.00, null, true, 500.00, "Sprit");
		Bebida beb3 = new Bebida(3, "Suco uva", 6.00, null, true, 500.00, "DellVale");

		System.out.println(beb1);
		System.out.println(beb2);
		System.out.println(beb3);
	}

}
