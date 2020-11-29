package main;

import java.util.Scanner;

public class Main {
	
	private Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Tela inicial
		System.out.println("BEM VINDO AO SISTEMA DE LEILÃO %n%n");
				
	}
	
	public Boolean confirmar() {
		System.out.println("Deseja confirmar? 1 - Sim | 2 - Não");
		int opcao = input.nextInt();		
		
		return (opcao == 1) ? true : false;
	}
	
	public void opcoesTelaInicial() {		
		
		System.out.println("Opções");
		System.out.println("1 - Cadastrar-se no sistema (Clientes e Instituições)");
		System.out.println("2 - Cadastrar produto no sistema");
		System.out.println("3 - Cadastrar leilão");		
		
		System.out.println("Escolha uma opção: ");		
		int choice = input.nextInt();
		
		switch (choice) {
		case 1:
			
			break;

		default:
			break;
		}
	}
	
	public void opcoesCadastroClientesInstituicoes() {
		
		System.out.println("Opções");
		System.out.println("1 - Cadastrar Clientes");
		System.out.println("2 - Cadastrar Instituições");			
		
		System.out.println("Escolha uma opção: ");		
		int choice = input.nextInt();
		
		switch (choice) {
		case 1:
			
			break;

		default:
			break;
		}
		
	}
	
	public void opcoesCadastroClientes() {
		
		Boolean confirmacao;
		
		System.out.println("Cadastrar Cliente");
		
		confirmacao = false;
		while (confirmacao == false) {
			System.out.println("Insira o CPF do cliente: ");
			String cpf = input.nextLine();
	 		confirmacao = confirmar();
		}
		
		confirmacao = false;
		while (confirmacao == false) {
			System.out.println("Insira o RG do cliente: ");
			String rg = input.nextLine();
	 		confirmacao = confirmar();
		}
		
		System.out.println("2 - Cadastrar Instituições");			
		
		System.out.println("Escolha uma opção: ");		
		int choice = input.nextInt();
		
		switch (choice) {
		case 1:
			
			break;

		default:
			break;
		}
	}
	
}
