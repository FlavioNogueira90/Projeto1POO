package com.posInfnet.proj1POO.servicos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.posInfnet.proj1POO.dominio.Bebida;
import com.posInfnet.proj1POO.dominio.Comida;
import com.posInfnet.proj1POO.dominio.Produto;
import com.posInfnet.proj1POO.dominio.Sobremesa;

public class ManipularArquivo {

//	private final String path = "C:\\tmp\\projetoPosPOO\\Produtos.txt";

	public static void gravarProduto(List<Produto> produtos, String path) {
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
			Double valorTotal = 0.0;
			for (Produto produto : produtos) {
				bufferedWriter.append(produto.toString());
				bufferedWriter.newLine();
				valorTotal += produto.getPreco();
			}
			bufferedWriter.append("Valor Total R$ " + String.format("%.2f", valorTotal));
		} catch (Exception e) {
			System.out.println("Erro ao gravar arquivo " + e.getMessage());
		}
	}

	public static List<Produto> lerProduto(String path) {
		List<Produto> listProdutos = new ArrayList<>();
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
			String linha = "";
			linha = bufferedReader.readLine();

			while (true) {
				if (linha != null) {
					String[] vetor = linha.split(";");

					switch (vetor[0]) {
					case "comida":
						Comida comida = new Comida();
						comida.setId(Integer.parseInt(vetor[1]));
						comida.setNome(vetor[2]);
						comida.setPreco(Double.parseDouble(vetor[3]));
						comida.setPeso(Double.parseDouble(vetor[5]));
						comida.setVegano(vetor[6] == "true" ? true : false);
						comida.setIngredientes(vetor[7]);

						listProdutos.add(comida);
						break;
					case "bebida":
						Bebida bebida = new Bebida();
						bebida.setId(Integer.parseInt(vetor[1]));
						bebida.setNome(vetor[2]);
						bebida.setPreco(Double.parseDouble(vetor[3]));
						bebida.setGelada(vetor[5] == "true" ? true : false);
						bebida.setTamanho(Double.parseDouble(vetor[6]));
						bebida.setMarca(vetor[7]);

						listProdutos.add(bebida);
						break;
					case "sobremesa":
						Sobremesa sobremesa = new Sobremesa();
						sobremesa.setId(Integer.parseInt(vetor[1]));
						sobremesa.setNome(vetor[2]);
						sobremesa.setPreco(Double.parseDouble(vetor[3]));
						sobremesa.setQuantidade(Double.parseDouble(vetor[5]));
						sobremesa.setDoce(vetor[6] == "true" ? true : false);
						sobremesa.setInformacao(vetor[7]);

						listProdutos.add(sobremesa);
						break;
					default:
						System.out.println("Tipo de produto inválido");
					}

				} else {
					break;
				}
				linha = bufferedReader.readLine();
			}
		} catch (Exception e) {
			System.out.println("Erro ao ler arquivo: " + e.getMessage());
		}
		return listProdutos;
	}
}
