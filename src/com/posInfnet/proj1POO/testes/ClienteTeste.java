package com.posInfnet.proj1POO.testes;

import com.posInfnet.proj1POO.dominio.Cliente;

public class ClienteTeste {

	
	public static void main(String[] args) {
		
//		ClienteServico clienteServico = new ClienteServico();

		Cliente clie1 = new Cliente("Flavio", "555.617.378-42", "flavio@gmail.com");
		Cliente clie2 = new Cliente("Patricia", "444.666.333-99", "patriciagmail.com");
		Cliente clie3 = new Cliente("Vando", "123.323.338-88", "vando@gmail.com");

		System.out.println(clie1);
		System.out.println(clie2);
		System.out.println(clie3);
//		clienteServico.inserirCliente(Arrays.asList(clie1, clie2, clie3));
	
//		List<Cliente> clientes = clienteServico.listarClientes();
//		System.out.println(clientes.size());
//		for (Cliente cliente : clientes) {
//			System.out.println(cliente.toString());
//		}
	}

}
