package com.exercicios.pedido.ex01;

import java.util.ArrayList;
import java.util.List;

public class ListaPedido {

	List<Pedido> lista = new ArrayList<Pedido>();
	
	public String pedidoPorCliente(Cliente cliente){
		String retorno = "";
		for(Pedido p : lista){
			if(p.getCliente().getCodigo() == cliente.getCodigo())
				retorno += p.toString();
		}
		return retorno;
	}

	public String pedidoPorVendedor(Vendedor vendedor){
		String retorno = "";
		for(Pedido p : lista){
			if(p.getVendedor().getCodigo() == vendedor.getCodigo())
				retorno += p.toString();
		}
		return retorno;
	}
	
	public void inserirPedidos(Pedido p){
		lista.add(p);
	}

}
