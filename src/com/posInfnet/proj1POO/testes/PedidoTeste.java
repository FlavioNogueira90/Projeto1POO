package com.posInfnet.proj1POO.testes;

import java.time.LocalDateTime;

import com.posInfnet.proj1POO.dominio.Cliente;
import com.posInfnet.proj1POO.dominio.Pedido;

public class PedidoTeste {

	
	public static void main(String[] args) {
		

		Cliente clie1 = new Cliente("Flavio", "555.617.378-42", "flavio@gmail.com");
		Cliente clie2 = new Cliente("Patricia", "444.666.333-99", "patriciagmail.com");
		Cliente clie3 = new Cliente("Vando", "123.323.338-88", "vando@gmail.com");
		
		LocalDateTime ldt = LocalDateTime.now();
		Pedido ped1 = new Pedido(1, "Combo big Tasty", ldt, false, clie1);
		Pedido ped2 = new Pedido(2, "Combo big Mac", ldt, true, clie2);
	//	Pedido ped3 = new Pedido(3, "Combo big Mac", ldt, false, null);

		System.out.println(ped1);
		System.out.println(ped2);
//		System.out.println(ped3);
	}

}
