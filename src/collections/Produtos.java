package collections;

import java.util.LinkedList;

import entities.Imovel;
import entities.Produto;
import entities.Veiculo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Produtos {
	
	private LinkedList<Produto> produtos = new LinkedList<Produto>();
	
	@Override
	public String toString() {
		String listaProdutos = "";
		for (Produto produto : produtos) {
			listaProdutos += produto.toString();
		};
		return listaProdutos;
	}
	
	public void adicionarProduto(Produto produto) {
		if((produto instanceof Imovel) || (produto instanceof Veiculo)) {
			getProdutos().add(produto);
		} else {
			throw new IllegalArgumentException("O item n�o � um im�vel ou um ve�culo");
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
