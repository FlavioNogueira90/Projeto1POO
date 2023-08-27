package com.posInfnet.proj1POO.dominio;

public class Comida extends Produto {
	private static final long serialVersionUID = 1L;

	private Double peso;
	private Boolean vegano;
	private String ingredientes;
	
	public Comida() {
		// TODO Auto-generated constructor stub
	}

	public Comida(Integer id, String nome, Double preco, Pedido pedido, Double peso, Boolean vegano, String ingredientes) {
		super(id, nome, preco, pedido);
		this.peso = peso;
		this.vegano = vegano;
		this.ingredientes = ingredientes;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Boolean getVegano() {
		return vegano;
	}

	public void setVegano(Boolean vegano) {
		this.vegano = vegano;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}



	@Override
	public String toString() {
		return "Comida [nome=" + getNome() + ", preco=" + getPreco() + ",peso=" + peso + ", vegano=" + vegano + ", ingredientes=" + ingredientes + "]";
	}

	@Override
	public Double preco() {
		return super.getPreco() * peso;
	}
	
	
}
