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
public class Leilao implements Comparable {
	
	private static Integer idLeilao = 0;
	private String id;
	private LocalDate data;
	private Integer dataFormatada;
	private Produtos produtos;
	private Clientes clientes;
	private Instituicao instituicao;
	private Lances lances;
	private StatusLeilao statusLeilao;
	
	@Override
	public String toString() {
		return("ID do leil�o: " + getId().toString() + " " +
			   "Data de ocorr�ncia: " + data.getDayOfMonth() + "/" + data.getMonthValue() + "/" + data.getYear() + " " +
			   // "Data formatada para compara��o: " + getDataFormatada().toString() + " " +
			   "Lista de produtos: " + produtos.toString() + " " +
			   "Lista de clientes: " + clientes.toString() + " " +
			   "Instituicao financeira respons�vel: " + getInstituicao().toString() + " " +
			   "Lista de lances: " + lances.toString() + " " +
			   "Status do leil�o: " + getStatusLeilao().toString()) + ".";
	}
	
	public Leilao(LocalDate data, Produtos produtos, Clientes clientes, Instituicao instituicao, Lances lances, StatusLeilao statusLeilao) {
		idLeilao++;
		setId(idLeilao.toString());
		setData(data);
		setDataFormatada(data.getYear() * 10000 + data.getMonthValue() * 100 + data.getDayOfMonth());
		setProdutos(produtos);
		setClientes(clientes);
		setInstituicao(instituicao);
		setLances(lances);
		setStatusLeilao(statusLeilao);
	}

	@Override
	public int compareTo(Object o) {
		Leilao outroLeilao = (Leilao) o;
		
		if (getDataFormatada() < outroLeilao.getDataFormatada()) {
			return 1;
		}
		
		return 0;
	}
	
}
