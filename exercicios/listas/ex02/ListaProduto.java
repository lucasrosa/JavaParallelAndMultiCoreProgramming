package com.exercicios.listas.ex02;

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
	
	public String descricaoMenor(int numeroDeLetras){
		String retorno = "";
		for(Produto pp : lista){
			if(pp.getDescricao().length() < numeroDeLetras){
				retorno += pp.toString();
			}
		}
		return retorno;
	}
	
	public int totalDeProdutos(){	
		return lista.size();
	}
		
	
}
