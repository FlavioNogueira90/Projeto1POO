package application;

import java.util.List;
import java.util.Scanner;

import com.posInfnet.proj1POO.dominio.Produto;
import com.posInfnet.proj1POO.servicos.ManipularArquivo;

public class Application {

	public static void main(String[] args) {
		String pathIn = "c:\\tmp\\PedidoIn.txt";
		String pathOut = "c:\\tmp\\PedidoOut.txt";
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Seja bem vindo!");
		System.out.println("Por favor, crie um arquivo no seguinte caminho C:\\tmp\\PedidoIn.txt ");
		System.out.println("Utilize o seguinte layout separados por ; (ponto e virgula): ");
		System.out.println("Comida:");
		System.out.println("Tipo do produto;cod;descrição;valor;null;peso;vegano;ingredientes");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Bebida:");
		System.out.println("Tipo do produto;cod;descrição;valor;null;gelado;tamanho;marca");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Sobremesa:");
		System.out.println("Tipo do produto;cod;descrição;valor;null;quantidade;descrição");
		System.out.println("-----------------------------------------------------------------------");
		List<Produto> list =  ManipularArquivo.lerProduto(pathIn);
		ManipularArquivo.gravarProduto(list, pathOut);
		sc.close();
	}

}
