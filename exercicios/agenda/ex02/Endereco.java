package com.exercicios.agenda.ex02;

public class Endereco {

	private String pais;
	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	private int numero;
	private int cep;
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getCep() {
		return cep;
	}
	
	public void setCep(int cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Endereco [Pais = ");
		builder.append(pais);
		builder.append(", Estado = ");
		builder.append(estado);
		builder.append(", Cidade = ");
		builder.append(cidade);
		builder.append(", Bairro = ");
		builder.append(bairro);
		builder.append(", Rua = ");
		builder.append(rua);
		builder.append(", Número = ");
		builder.append(numero);
		builder.append(", CEP = ");
		builder.append(cep);
		builder.append("]");
		return builder.toString();
	}

	
	
}