package com.exercicios.listas.ex04;

import java.util.ArrayList;
import java.util.List;

public class ListaProduto {

	private List<Produto> lista = new ArrayList<Produto>();
	
	public void addProduto(Produto p){
		lista.add(p);
	}
	
	public String procurarInicialFabricante(String letra){
		String retorno = "";		
		for (Produto p : lista){
			if(letra.equalsIgnoreCase(String.valueOf(p.getFabricante().charAt(0))))
				retorno += p.toString();
		}
		return retorno;
	}
	
	public String procurarFabricante(String fabricante){
		String retorno = "";		
		for (Produto p : lista) {
			if(fabricante.equalsIgnoreCase(p.getFabricante()))
				retorno += p.toString();
		}		
		return retorno;
	}
	
	public String fabricanteValor(String fabricante, double valor){
		String retorno = "";
		for (Produto p : lista) {
			if(fabricante.equalsIgnoreCase(p.getFabricante()) && valor == p.getValor())
				retorno += p.toString();
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
	
}
