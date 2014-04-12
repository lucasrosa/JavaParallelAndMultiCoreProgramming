package com.exercicios.listas.ex01;

public class Produto {
	
	private int codigo;
	private String descricao;
	private double valor;
	
	public int getCodigo() {
		return codigo;
	}
	
	// The method is returning a boolean to identify if it was inserted with success
	public boolean setCodigo(int codigo) {
		if(codigo > 0) {
			this.codigo = codigo;
			return true;
		} else {
			return false; //System.out.println("Falha: Codigo deve ser maior que 0!"); 
		}
	}
	
	public String getDescricao() {
		return descricao;
	}
	// The method is returning a boolean to identify if it was inserted with success
	public boolean setDescricao(String descricao) {
		if(descricao.length() > 3) {
			this.descricao = descricao;
			return true;
		} else {
			return false; // System.out.println("Falha: Descri����o deve ter mais de 3 caracteres!"); 
		}
	}
	
	public double getValor() {
		return valor;
	}
	// The method is returning a boolean to identify if it was inserted with success
	public boolean setValor(double valor) {
		if(valor >= 0) {
			this.valor = valor;
			return true;
		} else {
			return false; // System.out.println("Falha: Valor deve ser maior ou igual a 0!");
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [Codigo=");
		builder.append(codigo);
		builder.append(", Descricao=");
		builder.append(descricao);
		builder.append(", Valor=");
		builder.append(valor);
		builder.append("]\n");
		return builder.toString();
	}
	

}
