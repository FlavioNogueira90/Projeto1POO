package com.posInfnet.proj1POO.dominio;

public class Bebida extends Produto{
	private static final long serialVersionUID = 1L;
	
	private Boolean gelada;
	private Double tamanho;
	private String marca;
	
	public Bebida() {
		// TODO Auto-generated constructor stub
	}

	public Bebida(Integer id, String nome, Double preco, Pedido pedido, Boolean gelada, Double tamanho, String marca) {
		super(id, nome, preco, pedido);
		this.gelada = gelada;
		this.tamanho = tamanho;
		this.marca = marca;
	}

	public Boolean getGelada() {
		return gelada;
	}

	public void setGelada(Boolean gelada) {
		this.gelada = gelada;
	}

	public Double getTamanho() {
		return tamanho;
	}

	public void setTamanho(Double tamanho) {
		this.tamanho = tamanho;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Bebida [nome=" + getNome() + ", preco=" + getPreco() + ", gelada=" + gelada + ", tamanho=" + tamanho + ", marca=" + marca + "]";
	}

	@Override
	public Double preco() {
		return super.getPreco() * tamanho;
	}
	
	

}
