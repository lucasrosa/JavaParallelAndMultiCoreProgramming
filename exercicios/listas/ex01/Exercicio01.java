package com.exercicios.listas.ex01;

import java.util.Scanner;

import com.exercicios.listas.ex01.ListaProduto;
import com.exercicios.listas.ex01.Produto;

public class Exercicio01 {

	public static void main(String[] args) {
		int menu = 0;
		
		ListaProduto lp = new ListaProduto();
		Scanner tec = new Scanner(System.in);
		System.out.println("zomboCom 1.0!");

		do{
			System.out.println("\nSelecione:");
			System.out.println("0 - Hora de dar Tchau!");
			System.out.println("1 - Adicionar ao produto");
			System.out.println("2 - Procurar pela letra inicial");
			System.out.println("3 - Procurar pelo codigo");
			System.out.println("4 - Media de precos dos Produtos");
			menu = tec.nextInt();

			switch (menu) {
			case 1:
				Produto p = new Produto();
				
				System.out.print("Digite o codigo: ");
				while (!p.setCodigo(tec.nextInt())) 
					System.out.println("Falha: Codigo deve ser maior que 0! Por favor digite novamente:");
				tec.nextLine();
				
				System.out.print("Digite a descricao: ");
				while(!p.setDescricao(tec.nextLine()))
					System.out.println("Falha: Descricao deve ter mais de 3 caracteres! Por favor digite novamente:");
				
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
				System.out.println("Digite um codigo:");
				System.out.println(lp.procurarCodigo(tec.nextInt()));
				break;

			case 4:
				System.out.println("Media de precos: " + lp.mediaPrecos());
				break;
				
			default:
				System.out.println("\nEscolha uma opcao valida!\n");
				break;
			}

		}while(menu != 0);

		tec.close();
		
	}

}
