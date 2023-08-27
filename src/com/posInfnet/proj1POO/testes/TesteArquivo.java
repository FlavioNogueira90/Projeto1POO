package com.posInfnet.proj1POO.testes;

import java.util.List;

import com.posInfnet.proj1POO.dominio.Produto;
import com.posInfnet.proj1POO.servicos.ManipularArquivo;

public class TesteArquivo {

	public static void main(String[] args) {

		final String pathIn = "C:\\tmp\\PedidoIn.txt";
		final String pathOut = "C:\\tmp\\PedidoOut.txt";
		
		List<Produto> list =  ManipularArquivo.lerProduto(pathIn);
		
		ManipularArquivo.gravarProduto(list, pathOut);
	}

}
