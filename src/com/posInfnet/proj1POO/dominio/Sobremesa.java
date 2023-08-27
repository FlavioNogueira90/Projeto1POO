package com.posInfnet.proj1POO.dominio;

public class Sobremesa extends Produto{
	private static final long serialVersionUID = 1L;

	private Double quantidade;
	private Boolean doce;
	private String informacao;
	
	public Sobremesa() {
		// TODO Auto-generated constructor stub
	}

	public Sobremesa(Integer id, String nome, Double preco, Pedido pedido, Double quantidade, Boolean doce, String informacao) {
		super(id, nome, preco, pedido);
		this.quantidade = quantidade;
		this.doce = doce;
		this.informacao = informacao;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Boolean getDoce() {
		return doce;
	}

	public void setDoce(Boolean doce) {
		this.doce = doce;
	}

	public String getInformacao() {
		return informacao;
	}

	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}

	@Override
	public String toString() {
		return "Sobremesa [nome=" + getNome() + ", preco=" + getPreco() + ",quantidade=" + quantidade + ", doce=" + doce + ", informacao=" + informacao + "]";
	}

	@Override
	public Double preco() {
		return super.getPreco() * quantidade;
	}
	
	
	
	
}
