package collections;

import java.util.LinkedList;

import entities.Leilao;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Leiloes {
	
	private LinkedList<Leilao> leiloes = new LinkedList<Leilao>();
	
	@Override
	public String toString() {
		String listaLeiloes = "";
		for (Leilao leilao : leiloes) {
			listaLeiloes += leilao.toString();
		};
		return listaLeiloes;
	}
	
	public void adicionarLeilao(Leilao leilao) {
		if(leilao instanceof Leilao) {
			getLeiloes().add(leilao);
		} else {
			throw new IllegalArgumentException("O item não é um leilão");
		}
	}
	
	public void imprimirLeiloes() {
		for (Leilao leilao : leiloes) {
			System.out.println(leilao.toString());
		}
	}

}
