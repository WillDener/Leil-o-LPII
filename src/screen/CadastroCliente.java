package screen;

import java.util.Scanner;

import entities.Cliente;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import main.Database;

@NoArgsConstructor
@Getter
@Setter
public class CadastroCliente {
	
	private Scanner input = new Scanner(System.in);
	private Boolean confirmacao;
	
	private Cliente cliente = new Cliente();
	
	public void cadastrarCliente() {
		
		System.out.println("CADASTRAR CLIENTE (╯°□°)╯︵ ┻━┻\n");
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira o CPF do cliente: ");
			cliente.setCpf(input.nextLine());
			setConfirmacao(Confirmacao.confirmar());
	 	}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira o RG do cliente: ");
			cliente.setRg(input.nextLine());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira o nome completo do cliente: ");
			cliente.setNomeCompleto(input.nextLine());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira o endereço do cliente: ");
			cliente.setEndereco(input.nextLine());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira o e-mail do cliente: ");
			cliente.setEmail(input.nextLine());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		confirmacao = false;
		while (!confirmacao) {
			System.out.println("Dados do Cliente");
			System.out.println("\tCPF: " + cliente.getCpf());
			System.out.println("\tRG: " + cliente.getRg());
			System.out.println("\tNome completo: " + cliente.getNomeCompleto());
			System.out.println("\tEndereço: " + cliente.getEndereco());
			System.out.println("\tE-mail: " + cliente.getEmail());
			setConfirmacao(Confirmacao.confirmar());
			
			if(!confirmacao) cadastrarCliente();
		}
		
		Database.clientes.adicionar(cliente);
	}
	
}
