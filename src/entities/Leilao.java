package entities;

import collections.Clientes;
import collections.Lances;
import collections.Produtos;
import enums.StatusLeilao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Leilao {
	
	private Produtos produtos;
	private Clientes clientes;
	private Instituicao instituicao;
	private Lances lances;
	private StatusLeilao statusLeilao;
	
	@Override
	public String toString() {
		return("Lista de produtos: " + produtos.toString() + " " +
			   "Lista de clientes: " + clientes.toString() + " " +
			   "Instituicao financeira responsável: " + getInstituicao().toString() + " " +
			   "Lista de lances: " + lances.toString() + " " +
			   "Status do leilão: " + getStatusLeilao().toString()) + ".";
	}
	
}
