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
			CadastroCliente cadastroCliente = new CadastroCliente();
			
			CadastroInstituicao cadastroInstituicao = new CadastroInstituicao();
			
			System.out.println("Op��es");
			System.out.println("1 - Cadastrar cliente no sistema");
			System.out.println("2 - Cadastrar institui��o no sistema");
			System.out.println("3 - Cadastrar produto no sistema");
			System.out.println("4 - Cadastrar leil�o no sistema");		
			
			System.out.println("Escolha uma op��o: ");		
			escolha = input.nextInt();
			System.out.println();
			
			switch (escolha) {
			case 1:
				cadastroCliente.cadastrarCliente();
				break;
				
			case 2:
				cadastroInstituicao.cadastrarInstituicao();
				break;

			default:
				break;
			}
		} while(escolha != 9);
	}
}
