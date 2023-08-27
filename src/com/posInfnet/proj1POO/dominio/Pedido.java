package com.posInfnet.proj1POO.dominio;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.posInfnet.proj1POO.dominio.exceptions.DominioExceptions;

public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String descricao;
	private LocalDateTime data;
	private boolean delivery;
	private Cliente cliente;
	
	private List<Produto> produtos = new ArrayList<>();
	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public Pedido(Integer id, String descricao, LocalDateTime data, boolean delivery, Cliente cliente) {
		this.id = id;
		this.descricao = descricao;
		this.data = data;
		this.delivery = delivery;
		if(cliente.equals(null)) {
			throw new DominioExceptions("É obrigatório informar o cliente para formalização do pedido.");
		}
		this.cliente = cliente;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public boolean isdelivery() {
		return delivery;
	}

	public void setdelivery(boolean delivery) {
		this.delivery = delivery;
	}


	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	
	public boolean isDelivery() {
		return delivery;
	}
	
	public void setDelivery(boolean delivery) {
		this.delivery = delivery;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", descricao=" + descricao + ", data=" + data + ", delivery="
				+ delivery + ", cliente=" + cliente + ", produtos=" + produtos + "]";
	}


	
}
