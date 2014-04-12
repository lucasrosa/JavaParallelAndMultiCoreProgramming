package com.exercicios.listas.ex03;


public class Produto {
	
	private int codigo;
	private String descricao;
	private String siglaEstado;
	private double valor;	
	
	private String[] estados = { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", 
			"MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", 
			"RR", "RS", "SC", "SE", "SP", "TO" }; 
	
	public int getCodigo() {
		return codigo;
	}
	
	// The method is returning a boolean to identify if it was inserted with success
	public boolean setCodigo(int codigo) {
		if(codigo > 99) {
			this.codigo = codigo;
			return true;
		} else {
			return false; //System.out.println("Falha: Codigo deve ser maior que 99!"); 
		}
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	// The method is returning a boolean to identify if it was inserted with success
	public boolean setDescricao(String descricao) {
		if(descricao.length() > 5) {
			this.descricao = descricao;
			return true;
		} else {
			return false; // System.out.println("Falha: Descricaoo deve ter mais de 5 caracteres!"); 
		}
	}
	
	public double getValor() {
		return valor;
	}
	// The method is returning a boolean to identify if it was inserted with success
	public boolean setValor(double valor) {
		if(valor >= 0) {
			this.valor = valor;
			return true;
		} else {
			return false; // System.out.println("Falha: Valor deve ser maior ou igual a 0!");
		}
	}
	
	public String getSiglaEstado() {
		return siglaEstado;
	}
	
	public boolean setSiglaEstado(String siglaEstado) {
		boolean achou = false;
		for (String e : estados) {
			if(e.equals(siglaEstado)){
				this.siglaEstado = siglaEstado;
				achou = true;
				break;
			}
		}		
		//if(!achou)
			//System.out.println("Falha: Estado n��o encontrado!");
		return achou;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [Codigo=");
		builder.append(codigo);
		builder.append(", Descricao=");
		builder.append(descricao);
		builder.append(", Estado=");
		builder.append(siglaEstado);
		builder.append(", Valor=");
		builder.append(valor);
		builder.append("]\n");
		return builder.toString();
	}

}
