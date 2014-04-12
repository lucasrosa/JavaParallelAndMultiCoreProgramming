package com.exercicios.pedido.ex01;

import java.util.Date;

public class Operacao {

	private Date dtInicio;
	private Date dtFim;
	
	public Date getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	public Date getDtFim() {
		return dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Operacao [Inicio = ");
		builder.append(dtInicio);
		builder.append(", Término = ");
		builder.append(dtFim);
		builder.append("]\n");
		return builder.toString();
	}
	
}