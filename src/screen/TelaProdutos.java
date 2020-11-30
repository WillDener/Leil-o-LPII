package screen;

import database.Database;
import entities.Imovel;
import entities.Veiculo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import services.Confirmacao;
import services.EntradaDados;

@NoArgsConstructor
@Getter
@Setter
public class TelaProdutos {
	
	private Boolean confirmacao;
	private Imovel imovel;
	private Veiculo veiculo;
	
	public void opcoesProdutos() {
		
		int escolha;
		
		do {
			System.out.println("Escolha uma das operações abaixo:");
			System.out.println("1 - Cadastrar produto");
			System.out.println("2 - Consutar produto");
			System.out.println("3 - Atualizar produto");
			System.out.println("4 - Excluir produto");
			System.out.println("5 - Visualizar produto cadastrados");
			System.out.println("6 - Retornar ao menu inicial");
			
			System.out.println("Insira sua opção: ");
			escolha = EntradaDados.inputInt();
			System.out.println();
			
			switch (escolha) {
			case 1:
				System.out.println("CADASTRAR PRODUTO (╯°□°)╯︵ ┻━┻\n");
				cadastrarProduto();
				break;
				
			case 6:
				break;

			default:
				System.out.println("Opção inválida.");
				break;
			}
		} while(escolha != 6);
	}
	
	public void cadastrarProduto() {
		
		System.out.println("Qual tipo de produto você deseja cadastrar?");
		System.out.println("1 - Imóvel");
		System.out.println("2 - Veículo");
		
		System.out.println("Insira sua opção: ");
		int tipoProduto = EntradaDados.inputInt();
		System.out.println();
		
		if (tipoProduto == 1) {
			cadastrarImovel();
		} else if (tipoProduto == 2) {
			cadastrarVeiculo();
		} else {
			System.out.println("Opção inválida, tente novamente.");
			cadastrarProduto();
		}
	}
	
	public void cadastrarImovel() {
		
		imovel = new Imovel();
		
		System.out.println("CADASTRAR IMÓVEL (╯°□°)╯︵ ┻━┻\n");
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira a matrícula do produto: ");
			imovel.setMatricula(EntradaDados.inputString());
			setConfirmacao(Confirmacao.confirmar());
	 	}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira uma descrição do produto: ");
			imovel.setDescricao(EntradaDados.inputString());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira o valor mínimo do produto: ");
			imovel.setValorMinimoProduto(EntradaDados.inputDouble());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira o endereço do imóvel: ");
			imovel.setEndereco(EntradaDados.inputString());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		setConfirmacao(false);
		while (!confirmacao) {
			imovel.setTipoImovel(EntradaDados.inputTipoImovel());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Dados do imóvel");
			System.out.println("\tMatrícula: " + imovel.getMatricula());
			System.out.println("\tDescrição: " + imovel.getDescricao());
			System.out.println("\tValor mínimo: " + imovel.getValorMinimoProduto());
			System.out.println("\tEndereço: " + imovel.getEndereco());
			System.out.println("\tTipo do imóvel: " + imovel.getTipoImovel().toString());
			setConfirmacao(Confirmacao.confirmar());
			
			if(!confirmacao) cadastrarImovel();
		}
		
		Database.produtos.adicionar(imovel);
		
	}
	
	public void cadastrarVeiculo() {
		
		veiculo = new Veiculo();
		
		System.out.println("CADASTRAR VEÍCULO (╯°□°)╯︵ ┻━┻\n");
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira a matrícula do produto: ");
			veiculo.setMatricula(EntradaDados.inputString());
			setConfirmacao(Confirmacao.confirmar());
	 	}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira uma descrição do produto: ");
			veiculo.setDescricao(EntradaDados.inputString());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira o valor mínimo do produto: ");
			veiculo.setValorMinimoProduto(EntradaDados.inputDouble());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira a placa do veículo: ");
			veiculo.setPlaca(EntradaDados.inputString());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira a kilometragem atual do veículo: ");
			veiculo.setKilometragem(EntradaDados.inputInt());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira a cor do veículo: ");
			veiculo.setCor(EntradaDados.inputString());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		setConfirmacao(false);
		while (!confirmacao) {
			veiculo.setTipoVeiculo(EntradaDados.inputTipoVeiculo());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Dados do veículo");
			System.out.println("\tMatrícula: " + veiculo.getMatricula());
			System.out.println("\tDescrição: " + veiculo.getDescricao());
			System.out.println("\tValor mínimo: " + veiculo.getValorMinimoProduto());
			System.out.println("\tPlaca: " + veiculo.getPlaca());
			System.out.println("\tKilometragem: " + veiculo.getKilometragem());
			System.out.println("\tCor: " + veiculo.getCor());
			System.out.println("\tTipo do veículo: " + veiculo.getTipoVeiculo().toString());
			setConfirmacao(Confirmacao.confirmar());
			
			if(!confirmacao) cadastrarImovel();
		}
		
		Database.produtos.adicionar(veiculo);
		
	}
	
}
