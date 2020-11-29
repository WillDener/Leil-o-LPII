package screen;

import database.Database;
import entities.Cliente;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import services.Confirmacao;
import services.Input;

@NoArgsConstructor
@Getter
@Setter
public class TelaClientes {
	
	private Boolean confirmacao;
	private Cliente cliente = new Cliente();
	
	public void opcoesClientes() {
		
		int escolha;
		
		do {
			System.out.println("Escolha uma das operações abaixo:");
			System.out.println("1 - Cadastrar cliente");
			System.out.println("2 - Alterar cliente");
			System.out.println("3 - Excluir cliente");
			System.out.println("4 - Visualizar clientes cadastrados");		
			
			System.out.println("Insira sua opção: ");
			escolha = Input.inputInt();
			System.out.println();
			
			switch (escolha) {
			case 1:
				cadastrarCliente();
				break;
				
			case 2:
				atualizarCliente();
				break;

			default:
				break;
			}
		} while(escolha != 9);
	}
	
	public void cadastrarCliente() {
		
		System.out.println("CADASTRAR CLIENTE (╯°□°)╯︵ ┻━┻\n");
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira o CPF do cliente: ");
			cliente.setCpf(Input.inputString());
			setConfirmacao(Confirmacao.confirmar());
	 	}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira o RG do cliente: ");
			cliente.setRg(Input.inputString());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira o nome completo do cliente: ");
			cliente.setNomeCompleto(Input.inputString());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira o endereço do cliente: ");
			cliente.setEndereco(Input.inputString());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira o e-mail do cliente: ");
			cliente.setEmail(Input.inputString());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		setConfirmacao(false);
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
	
	public void atualizarCliente() {
		
		System.out.println("ATUALIZAR CLIENTE (╯°□°)╯︵ ┻━┻\n");
		
		System.out.println("Digite o CPF do cliente que será alterado: ");
		
		String cpfCliente = Input.inputString();
		
		Database.clientes.consultar(cpfCliente);
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira o novo CPF do cliente: ");
			cliente.setCpf(Input.inputString());
			setConfirmacao(Confirmacao.confirmar());
	 	}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira o novo RG do cliente: ");
			cliente.setRg(Input.inputString());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira o novo nome completo do cliente: ");
			cliente.setNomeCompleto(Input.inputString());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira o novo endereço do cliente: ");
			cliente.setEndereco(Input.inputString());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira o novo e-mail do cliente: ");
			cliente.setEmail(Input.inputString());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Novos dados do Cliente");
			System.out.println("\tCPF: " + cliente.getCpf());
			System.out.println("\tRG: " + cliente.getRg());
			System.out.println("\tNome completo: " + cliente.getNomeCompleto());
			System.out.println("\tEndereço: " + cliente.getEndereco());
			System.out.println("\tE-mail: " + cliente.getEmail());
			setConfirmacao(Confirmacao.confirmar());
			
			if(!confirmacao) cadastrarCliente();
		}
		
		Database.clientes.atualizar(cpfCliente, cliente);
	}
	
}
