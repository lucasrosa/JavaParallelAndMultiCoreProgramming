package com.exercicios.agenda.ex02;

import java.sql.Date;
import java.util.Scanner;

public class Teste02 {

	public static void main(String[] args) {

		int menu = 0;
		
		Agenda a = new Agenda();
		Scanner tec = new Scanner(System.in);
		
		System.out.println("zomboCom Agenda 2.0!");

		do{
			System.out.println("\nSelecione:");
			System.out.println("0 - Hora de dar Tchau!");
			System.out.println("1 - Adicionar uma pessoa");
			System.out.println("2 - Procurar pelo codigo de area");
			System.out.println("3 - Procurar por CEP");
			System.out.println("4 - Procurar pela letra inicial");
			menu = tec.nextInt();

			switch (menu) {
			case 1:
				Pessoa p = new Pessoa();
				Endereco e = new Endereco();
				System.out.print("Digite o nome: ");
				p.setNome(tec.next());
				tec.nextLine();
				System.out.print("Digite o endereco - Pa��s:");
				e.setPais(tec.nextLine());
				System.out.print("Digite o endereco - Estado:");
				e.setEstado(tec.nextLine());
				System.out.print("Digite o endereco - Cidade:");
				e.setCidade(tec.nextLine());
				System.out.print("Digite o endereco - Bairro:");
				e.setBairro(tec.nextLine());
				System.out.print("Digite o endereco - Rua:");
				e.setRua(tec.nextLine());
				System.out.print("Digite o endereco - N��mero:");
				e.setNumero(tec.nextInt());
				System.out.print("Digite o endereco - CEP:");
				e.setCep(tec.nextInt());
				tec.nextLine();
				System.out.print("Digite o contato - Email:");
				p.setEmail(tec.nextLine());
				System.out.print("Digite o contato - Telefone (Ex.: 47 35210000):");
				p.setTelefone(tec.nextLine());
				System.out.print("Digite o contato - Celular (Ex.: 47 35210000):");
				p.setCelular(tec.nextLine());
				System.out.print("Data de Nascimento (Ex.: yyyy-mm-dd):");
				p.setDataNascimento(Date.valueOf(tec.nextLine()));
				p.setEndereco(e);
				a.addPessoa(p);
				break;

			case 2:
				tec.nextLine();
				System.out.println("Digite um codigo de area:");
				System.out.println(a.procurarCelularCodigoArea(tec.nextLine()));
				break;

			case 3:
				tec.nextLine();
				System.out.println("Digite o CEP:");
				System.out.println(a.procurarCEP(tec.nextLine()));
				break;

			case 4:
				tec.nextLine();
				System.out.println("Digite uma letra: ");
				System.out.println(a.procurarInicialNome(tec.nextLine()));
				break;

			default:
				System.out.println("\nEscolha uma op����o v��lida!\n");
				break;
			}

		}while(menu != 0);

		tec.close();

	}
	
}