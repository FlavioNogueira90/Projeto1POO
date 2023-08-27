package com.posInfnet.proj1POO.dominio;

import java.io.Serializable;

public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;

	private String nome;
	private String cpf;
	private String email;
	private Pedido[] pedidos = new Pedido[3];
	public Cliente() {

	}
	
	public Cliente(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public Pedido[] getPedidos() {
		return pedidos;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPedidos(Pedido[] pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", pedidos=" + pedidos + "]";
	}

}
