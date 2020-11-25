package entities;

import java.time.LocalDate;
import java.util.Date;

import collections.Clientes;
import collections.Lances;
import collections.Produtos;
import enums.StatusLeilao;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Leilao {
	
	private static Integer idLeilao = 0;
	private String id;
	private LocalDate data;
	private Produtos produtos;
	private Clientes clientes;
	private Instituicao instituicao;
	private Lances lances;
	private StatusLeilao statusLeilao;
	
	@Override
	public String toString() {
		return("ID do leilão: " + getId().toString() + " " +
			   "Data de ocorrência: " + getData().toString() + " " +
			   "Lista de produtos: " + produtos.toString() + " " +
			   "Lista de clientes: " + clientes.toString() + " " +
			   "Instituicao financeira responsável: " + getInstituicao().toString() + " " +
			   "Lista de lances: " + lances.toString() + " " +
			   "Status do leilão: " + getStatusLeilao().toString()) + ".";
	}
	
	public Leilao(LocalDate data, Produtos produtos, Clientes clientes, Instituicao instituicao, Lances lances, StatusLeilao statusLeilao) {
		idLeilao++;
		setId(idLeilao.toString());
		setData(data);
		setProdutos(produtos);
		setClientes(clientes);
		setInstituicao(instituicao);
		setLances(lances);
		setStatusLeilao(statusLeilao);
	}
	
}
