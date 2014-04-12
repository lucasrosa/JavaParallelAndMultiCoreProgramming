package com.exercicios.agenda.ex01;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private List<Pessoa> lista = new ArrayList<Pessoa>();
	
	public void addPessoa(Pessoa p){
		lista.add(p);
	}
	
	public String procurarPais(String pais){
		String retorno = "";
		for(Pessoa p : lista){
			if(pais.equalsIgnoreCase(p.getEndereco().getPais()))
				retorno += p.toString();
		}
		return retorno;
	}

	public String procurarCEP(String cep){
		String retorno = "";
		for(Pessoa p : lista){
			if(cep.equalsIgnoreCase(String.valueOf(p.getEndereco().getCep())))
				retorno += p.toString();
		}
		return retorno;
	}

	public String procurarInicialNome(String inicial){
		String retorno = "";
		for(Pessoa p : lista){
			if(inicial.equalsIgnoreCase(String.valueOf(p.getNome().charAt(0))))
				retorno += p.toString();
		}
		return retorno;
	}
	
}
