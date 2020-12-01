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
			
			System.out.println("Insira sua opÃ§Ã£o: ");
			escolha = EntradaDados.inputInt();
			System.out.println();
			
			switch (escolha) {
			case 1:
				System.out.println("CADASTRAR PRODUTO (â•¯Â°â–¡Â°)â•¯ï¸µ â”»â”�â”»\n");
				Database.produtos.adicionar(cadastrarProduto());
				break;
				
			case 6:
				break;

			default:
				System.out.println("OpÃ§Ã£o invÃ¡lida.");
				break;
			}
		} while(escolha != 6);
	}
	
	public Object cadastrarProduto() {
		
		System.out.println("Qual tipo de produto vocÃª deseja cadastrar?");
		System.out.println("1 - ImÃ³vel");
		System.out.println("2 - VeÃ­culo");
		
		System.out.println("Insira sua opÃ§Ã£o: ");
		int tipoProduto = EntradaDados.inputInt();
		System.out.println();
		
		if (tipoProduto == 1) {
			cadastrarImovel();
		} else if (tipoProduto == 2) {
			return cadastrarVeiculo();
		} else {
			System.out.println("OpÃ§Ã£o invÃ¡lida, tente novamente.");
			return cadastrarProduto();
		}
		return null;
	}
	
	public Imovel cadastrarImovel() {
		
		imovel = new Imovel();
		
		System.out.println("CADASTRAR IMÃ“VEL (â•¯Â°â–¡Â°)â•¯ï¸µ â”»â”�â”»\n");
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira a matrÃ­cula do produto: ");
			imovel.setMatricula(EntradaDados.inputString());
			setConfirmacao(Confirmacao.confirmar());
	 	}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira uma descriÃ§Ã£o do produto: ");
			imovel.setDescricao(EntradaDados.inputString());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira o valor mÃ­nimo do produto: ");
			imovel.setValorMinimoProduto(EntradaDados.inputDouble());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira o endereÃ§o do imÃ³vel: ");
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
			System.out.println("Dados do imÃ³vel");
			System.out.println("\tMatrÃ­cula: " + imovel.getMatricula());
			System.out.println("\tDescriÃ§Ã£o: " + imovel.getDescricao());
			System.out.println("\tValor mÃ­nimo: " + imovel.getValorMinimoProduto());
			System.out.println("\tEndereÃ§o: " + imovel.getEndereco());
			System.out.println("\tTipo do imÃ³vel: " + imovel.getTipoImovel().toString());
			setConfirmacao(Confirmacao.confirmar());
			
			if(!confirmacao) cadastrarImovel();
		}
		
		return imovel;
		
	}
	
	public Veiculo cadastrarVeiculo() {
		
		veiculo = new Veiculo();
		
		System.out.println("CADASTRAR VEÃ�CULO (â•¯Â°â–¡Â°)â•¯ï¸µ â”»â”�â”»\n");
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira a matrÃ­cula do produto: ");
			veiculo.setMatricula(EntradaDados.inputString());
			setConfirmacao(Confirmacao.confirmar());
	 	}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira uma descriÃ§Ã£o do produto: ");
			veiculo.setDescricao(EntradaDados.inputString());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira o valor mÃ­nimo do produto: ");
			veiculo.setValorMinimoProduto(EntradaDados.inputDouble());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira a placa do veÃ­culo: ");
			veiculo.setPlaca(EntradaDados.inputString());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira a kilometragem atual do veÃ­culo: ");
			veiculo.setKilometragem(EntradaDados.inputInt());
			setConfirmacao(Confirmacao.confirmar());
		}
		
		setConfirmacao(false);
		while (!confirmacao) {
			System.out.println("Insira a cor do veÃ­culo: ");
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
			System.out.println("Dados do veÃ­culo");
			System.out.println("\tMatrÃ­cula: " + veiculo.getMatricula());
			System.out.println("\tDescriÃ§Ã£o: " + veiculo.getDescricao());
			System.out.println("\tValor mÃ­nimo: " + veiculo.getValorMinimoProduto());
			System.out.println("\tPlaca: " + veiculo.getPlaca());
			System.out.println("\tKilometragem: " + veiculo.getKilometragem());
			System.out.println("\tCor: " + veiculo.getCor());
			System.out.println("\tTipo do veÃ­culo: " + veiculo.getTipoVeiculo().toString());
			setConfirmacao(Confirmacao.confirmar());
			
			if(!confirmacao) cadastrarImovel();
		}
		
		return veiculo;
		
	}
	
}
