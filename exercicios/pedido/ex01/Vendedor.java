package com.exercicios.pedido.ex01;

public class Vendedor {

	private int codigo;
	private String nome;
	
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vendedor [Código = ");
		builder.append(codigo);
		builder.append(", Nome = ");
		builder.append(nome);
		builder.append("]\n");
		return builder.toString();
	}
		
}