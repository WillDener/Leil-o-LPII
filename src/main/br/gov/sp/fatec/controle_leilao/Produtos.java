package main.br.gov.sp.fatec.controle_leilao;

import java.util.LinkedList;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Produtos {
	
	private LinkedList<Produto> produtos = new LinkedList<Produto>();
	
	public void adicionarProduto(Produto produto) {
		if((produto instanceof Imovel) || (produto instanceof Veiculo)) {
			getProdutos().add(produto);
		} else {
			throw new IllegalArgumentException("O item não é um imóvel ou um veículo");
		}
	}
	
	public void imprimirProdutos() {
		for (Produto produto : produtos) {
			if(produto instanceof Imovel) {
				Imovel imovel = (Imovel) produto;
				System.out.println(imovel.toString());
			} else if(produto instanceof Veiculo) {
				Veiculo veiculo = (Veiculo) produto;
				System.out.println(veiculo.toString());
			}
		}
	}
}
