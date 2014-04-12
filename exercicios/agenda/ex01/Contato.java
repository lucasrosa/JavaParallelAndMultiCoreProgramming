package com.exercicios.agenda.ex01;

import java.util.Date;

public class Contato {
	
	private String email;
	private String telefone;
	private String celular;
	private Date dataNascimento;
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getCelular() {
		return celular;
	}
	
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contato [E-mail = ");
		builder.append(email);
		builder.append(", Telefone = ");
		builder.append(telefone);
		builder.append(", Celular = ");
		builder.append(celular);
		builder.append(", Data de Nascimento = ");
		builder.append(dataNascimento);
		builder.append("]");
		return builder.toString();
	}

	
	
}