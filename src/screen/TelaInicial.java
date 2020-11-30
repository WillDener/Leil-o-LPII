package screen;

import java.util.Scanner;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class TelaInicial {
	
	private Scanner input = new Scanner(System.in);
	private Boolean confirmacao;
	
	public void opcoesTelaInicial() {
		
		int escolha;
		
		do {
			TelaClientes telaClientes = new TelaClientes();
			
			TelaInstituicoes telaInstituicoes = new TelaInstituicoes();
			
			TelaLeilao telaLeilao = new TelaLeilao();
			
			System.out.println("Escolha uma das operações abaixo:");
			System.out.println("1 - Clientes");
			System.out.println("2 - Instituições");
			System.out.println("3 - Produtos");
			System.out.println("4 - Leilões");		
			
			System.out.println("Insira sua opção: ");		
			escolha = input.nextInt();
			System.out.println();
			
			switch (escolha) {
			case 1:
				System.out.println("(╯°□°)╯︵ ┻━┻ CLIENTES\n");
				telaClientes.opcoesClientes();
				break;
				
			case 2:
				System.out.println("(╯°□°)╯︵ ┻━┻ INSTIUIÇÃO\n");
				telaInstituicoes.opcoesInstituicoes();
				break;
				
			case 3:
				
				break;
				
			case 4:
				System.out.println("(╯°□°)╯︵ ┻━┻ LEILÃO\n");
				telaLeilao.opcaoLeilao();
				break;

			default:
				break;
			}
		} while(escolha != 9);
	}
}
