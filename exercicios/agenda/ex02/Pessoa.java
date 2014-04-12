package com.exercicios.agenda.ex02;

public class Pessoa extends Contato {

	private String nome;
	private Endereco endereco;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [Nome = ");
		builder.append(nome);
		builder.append(", Endereco = ");
		builder.append(endereco.toString());
		builder.append(", Contato = ");
		builder.append(super.toString()); // Calls the toString method from Contato
		builder.append("]");
		return builder.toString();
	}
	
}
