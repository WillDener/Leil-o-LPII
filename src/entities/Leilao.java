package entities;

import collections.Clientes;
import collections.Lances;
import collections.Produtos;
import enums.StatusLeilao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Leilao {
	
	private static Integer idLeilao = 0;
	private String id;
	private Produtos produtos;
	private Clientes clientes;
	private Instituicao instituicao;
	private Lances lances;
	private StatusLeilao statusLeilao;
	
	@Override
	public String toString() {
		return("ID do leil�o: " + getId().toString() + " " +
			   "Lista de produtos: " + produtos.toString() + " " +
			   "Lista de clientes: " + clientes.toString() + " " +
			   "Instituicao financeira respons�vel: " + getInstituicao().toString() + " " +
			   "Lista de lances: " + lances.toString() + " " +
			   "Status do leil�o: " + getStatusLeilao().toString()) + ".";
	}
	
	public Leilao(Produtos produtos, Clientes clientes, Instituicao instituicao, Lances lances, StatusLeilao statusLeilao) {
		idLeilao++;
		setId(idLeilao.toString());
		setProdutos(produtos);
		setClientes(clientes);
		setInstituicao(instituicao);
		setLances(lances);
		setStatusLeilao(statusLeilao);
	}
	
}
