package com.exercicios.listas.ex03;

import java.util.Scanner;

import com.exercicios.listas.ex03.ListaProduto;
import com.exercicios.listas.ex03.Produto;

public class Exercicio03 {

	public static void main(String[] args) {
		int menu = 0;
		
		ListaProduto lp = new ListaProduto();
		Scanner tec = new Scanner(System.in);
		System.out.println("zomboCom 3.0!");

		do{
			System.out.println("\nSelecione:");
			System.out.println("0 - Hora de dar Tchau!");
			System.out.println("1 - Adicionar um produto");
			System.out.println("2 - Procurar pela letra inicial");
			System.out.println("3 - Total de produtos");
			System.out.println("4 - Retornar descricao menor que ");
			menu = tec.nextInt();

			switch (menu) {
			case 1:
				Produto p = new Produto();
				System.out.print("Digite o codigo: ");
				while (!p.setCodigo(tec.nextInt())) 
					System.out.println("Falha: Codigo deve ser maior que 99! Por favor digite novamente:");
				tec.nextLine();
				
				System.out.print("Digite a descricao: ");
				while(!p.setDescricao(tec.nextLine()))
					System.out.println("Falha: Descricao deve ter mais de 5 caracteres! Por favor digite novamente:");
				
				System.out.print("Digite o estado: ");
				while(!p.setSiglaEstado(tec.next()))
						System.out.println("Falha: Estado nao encontrado!");
				
				System.out.print("Digite o valor: ");
				while(!p.setValor(tec.nextDouble()))
					System.out.println("Falha: Valor deve ser maior ou igual a 0! Por favor digite novamente:");
				
				lp.addProduto(p);
				break;

			case 2:
				System.out.println("Digite uma letra:");
				System.out.println(lp.procurarInicial(tec.next()));
				break;

			case 3:
				System.out.println("Total de produtos: " + lp.totalDeProdutos());
				break;

			case 4:
				System.out.println("Producto com menor descricao do que: ");
				System.out.println(lp.descricaoMenor(tec.nextInt()));
				break;
				
			default:
				System.out.println("\nEscolha uma op����o v��lida!\n");
				break;
			}

		}while(menu != 0);

		tec.close();
		
	}

}

