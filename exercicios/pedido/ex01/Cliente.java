package com.exercicios.pedido.ex01;

public class Cliente {

	private int codigo;
	private String nome;
	private String email;
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [Codigo = ");
		builder.append(codigo);
		builder.append(", Nome = ");
		builder.append(nome);
		builder.append(", E-mail = ");
		builder.append(email);
		builder.append("]\n");
		return builder.toString();
	}	
}