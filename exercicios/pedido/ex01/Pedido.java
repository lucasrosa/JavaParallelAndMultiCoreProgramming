package com.exercicios.pedido.ex01;

import java.util.List;

public class Pedido extends Operacao {

	private int codigo;
	private Vendedor vendedor;
	private Cliente cliente;
	private List<Produto> listaProdutos;
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public Vendedor getVendedor() {
		return vendedor;
	}
	
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	
	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido [C��digo = ");
		builder.append(codigo);
		builder.append(", Vendedor = ");
		builder.append(vendedor.toString());
		builder.append(", Cliente = ");
		builder.append(cliente.toString());
		builder.append(", Lista de Produtos = ");
		builder.append(listaProdutos.toString());
		builder.append("]\n");
		return builder.toString();
	}
	
	private void addProduto(Produto p){
		listaProdutos.add(p);
	}
	
	public boolean inserirProdutoPedido(Produto p){
		if(!existeProduto(p)){
			addProduto(p);
			return true;
		}else
			return true;
	}

	private boolean existeProduto(Produto p){
		boolean existe = false;
		for(Produto prod : listaProdutos){	
			if(p.getCodigo() == prod.getCodigo()){
				existe = true;
			}
		}
		return existe;
	}
	
}