package screen;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.TimeZone;

import entities.Leilao;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import services.Confirmacao;
import services.EntradaDados;

@NoArgsConstructor
@Getter
@Setter
public class TelaLeilao {
	
	private Leilao leilao;
	private Boolean confirmacao;		
	
	public void opcaoLeilao() {
		int escolha;
		
		do {
			System.out.println("Escolha uma das operações abaixo:");
			System.out.println("1 - Cadastrar Leilão");
			System.out.println("2 - Consutar Leilão");
			System.out.println("3 - Atualizar Leilão");
			System.out.println("4 - Excluir Leilão");
			System.out.println("5 - Visualizar Instituições cadastrados");
			System.out.println("6 - Retornar ao menu inicial");
			
			System.out.println("Insira sua opção: ");
			escolha = EntradaDados.inputInt();
			System.out.println();
			
			switch (escolha) {
			case 1:				
				cadastroLeilao();
				break;
				
			case 2:
				
				break;
				
			case 3:
				
				break;
				
			case 4:
				
				break;
				
			case 5:
				
				break;
				
			case 6:
				break;

			default:
				System.out.println("Opção inválida.");
				break;
			}
		} while(escolha != 6);
	}
	
	public void cadastroLeilao() {
		leilao = new Leilao();
		
		System.out.println("CADASTRAR NOVO LEILÃO (╯°□°)╯︵ ┻━┻\n");
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira hora de inicio: ");
			leilao.setDataHoraInicio(EntradaDados.inputDataHora());			
			setConfirmacao(Confirmacao.confirmar());
			System.out.println(leilao.getDataHoraInicio());
		}
	}
	
}
