package com.exercicios.listas.ex01;

import java.util.ArrayList;
import java.util.List;

public class ListaProduto {

	private List<Produto> lista = new ArrayList<Produto>();
	
	public void addProduto(Produto p){
		lista.add(p);
	}
	
	public String procurarInicial(String letra){		
		String retorno = "";
		
		for (Produto pp : lista){
			if(letra.equalsIgnoreCase(String.valueOf(pp.getDescricao().charAt(0))))
				retorno += pp.toString();
		}
		return retorno;
	}
	
	public Produto procurarCodigo(int codigo){
		for (Produto pp : lista){
			if(pp.getCodigo() == codigo){
				return pp;
			}
		}
		return null;
	}
	
	public double mediaPrecos(){
		double media = 0d;
		for (Produto pp : lista){
			media += pp.getValor();
		}
		return media / lista.size();
	}
		
	
}
