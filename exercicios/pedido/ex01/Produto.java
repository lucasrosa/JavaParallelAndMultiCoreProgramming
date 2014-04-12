package com.exercicios.pedido.ex01;

public class Produto {

	private int codigo;
	private String descricao;
	private double valor;
	private int quantidade;
		
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [Código = ");
		builder.append(codigo);
		builder.append(", Descrição = ");
		builder.append(descricao);
		builder.append(", Valor = ");
		builder.append(valor);
		builder.append(", Quantidade = ");
		builder.append(quantidade);
		builder.append("]\n");
		return builder.toString();
	}
	
}