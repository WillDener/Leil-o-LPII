package entities;

import java.security.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

import org.junit.Before;

import collections.Clientes;
import collections.Lances;
import collections.Produtos;
import enums.StatusLeilao;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Leilao implements Comparable {
	
	private String id;
	private LocalDateTime dataHoraInicio;
	private LocalDateTime dataHoraFim;
	private Integer dataHoraInicioFormatada;
	private Produtos produtos;
	private Clientes clientes;
	private Instituicao instituicao;
	private Lances lances;
	private StatusLeilao statusLeilao = StatusLeilao.ABERTO;
	
	@Override
	public String toString() {
		return("ID do leilão: " + getId().toString() + "\n" +
			   "Data de início: " + getDataHoraInicio().getDayOfMonth() + "/" + getDataHoraInicio().getMonthValue() + "/" + getDataHoraInicio().getYear() + "\n" +
			   "Horário de início: " + getDataHoraInicio().getHour() + ":" + getDataHoraInicio().getMinute() + "\n" +
			   "Lista de produtos: " + getProdutos().toString() +
			   "Lista de clientes: " + getClientes().toString() +
			   "Instituicao financeira responsável: " + getInstituicao().toString() + "\n" +
			   "Lista de lances: " + getLances().toString() + "\n" +
			   "Status do leilão: " + getStatusLeilao().toString()) + ".";
	}
	
	public Leilao(LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim, Produtos produtos, 
				  Clientes clientes, Instituicao instituicao, Lances lances) {
		setDataHoraInicio(dataHoraInicio);
		setDataHoraFim(dataHoraFim);
		setDataHoraInicioFormatada(dataHoraInicio.getYear() * 10000 + dataHoraInicio.getMonthValue() * 100 + dataHoraInicio.getDayOfMonth());
		setProdutos(produtos);
		setClientes(clientes);
		setInstituicao(instituicao);
		setLances(lances);
		updateStatusLeilao();
	}

	@Override
	public int compareTo(Object o) {
		Leilao outroLeilao = (Leilao) o;
		
		if (getDataHoraInicioFormatada() < outroLeilao.getDataHoraInicioFormatada()) {
			return 1;
		}
		
		return 0;
	}
	
	public void updateStatusLeilao() {
		LocalDateTime now = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
		
		if (now.isBefore(getDataHoraInicio())) {
			setStatusLeilao(StatusLeilao.ABERTO);
		} else if (now.isEqual(dataHoraFim) || now.isAfter(getDataHoraFim())) {
			setStatusLeilao(StatusLeilao.FINALIZADO);
		} else if ((now.isEqual(dataHoraInicio) || now.isAfter(getDataHoraInicio())) && now.isBefore(getDataHoraFim())) {
			setStatusLeilao(StatusLeilao.ANDAMENTO);
		}
	}
	
}
