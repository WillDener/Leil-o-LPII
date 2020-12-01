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
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Getter
@Setter
public class Leilao implements Comparable {
	
	private String id;
	private LocalDateTime dataHoraInicio;
	private LocalDateTime dataHoraFim;
	private Produtos produtos;
	private Clientes clientes;
	private Instituicao instituicao;
	private Lances lances;
	private StatusLeilao statusLeilao = StatusLeilao.ABERTO;
	
	@Override
	public String toString() {
		String dadosLeilao = "ID do leilão: " + getId().toString() + "\n" +
			   "Data de início: " + getDataHoraInicio().getDayOfMonth() + "/" + getDataHoraInicio().getMonthValue() + "/" + getDataHoraInicio().getYear() + "\n" +
			   "Horário de início: " + getDataHoraInicio().getHour() + ":" + getDataHoraInicio().getMinute() + "\n" +
			   "Data de finaliação: " + getDataHoraFim().getDayOfMonth() + "/" + getDataHoraFim().getMonthValue() + "/" + getDataHoraFim().getYear() + "\n" +
			   "Horário de finalização: " + getDataHoraFim().getHour() + ":" + getDataHoraFim().getMinute() + "\n" +
			   "Quantidade de produtos registrados: " + getProdutos().getProdutos().size() + "\n" +
			   "Lista de produtos: " + getProdutos().toString() +
			   "Quantidade de clientes registrados:" + getClientes().getClientes().size() + "\n" +
			   "Lista de clientes: " + getClientes().toString() +
			   "Instituicao financeira responsável: " + getInstituicao().toString() + "\n" +
			   "Quantidade de lances registrados:" + getLances().getLances().size() + "\n" +
			   "Lista de lances: " + getLances().toString() + "\n" +
			   "Status do leilão: " + getStatusLeilao().toString() + ".";
				if (getStatusLeilao().equals(StatusLeilao.FINALIZADO)) {
					String resGanhador = "Ganhadores: " +"\n";
					String resNA = "Produtos: " + "\n";
					for (Produto produto : getProdutos().getProdutos()) {						
						if (produto.getLance() != null) {
							resGanhador = resGanhador + "\n" + 
									"Produto: "+ produto.toString() +  "\n" +
									"Cliente Ganhador: " + produto.getLance().getCliente().toString() +  "\n" +
									"Valor: " + produto.getLance().getValor() +"\n\n" ;
						} else {
							resNA = resNA + "\n" + 
									"lance: N/A \n";
						}
					}
					dadosLeilao = dadosLeilao + resGanhador + resNA;
				}
		return dadosLeilao;
	}
	
	public Leilao(LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim, Produtos produtos, 
				  Clientes clientes, Instituicao instituicao, Lances lances) {
		setDataHoraInicio(dataHoraInicio);
		setDataHoraFim(dataHoraFim);
		setProdutos(produtos);
		setClientes(clientes);
		setInstituicao(instituicao);
		setLances(lances);
		updateStatusLeilao();
	}

	@Override
	public int compareTo(Object o) {
		Leilao outroLeilao = (Leilao) o;
		
		if (getDataHoraInicio().isAfter(outroLeilao.getDataHoraInicio())) {
			return 1;
		}
		
		return 0;
	}
	
	public void updateStatusLeilao() {
		LocalDateTime now = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
		
		if (now.isBefore(getDataHoraInicio())) {
			setStatusLeilao(StatusLeilao.ABERTO);
		} else if (now.isEqual(dataHoraFim) || now.isAfter(getDataHoraFim())) {
			ganhadoresLeilao();
			setStatusLeilao(StatusLeilao.FINALIZADO);
		} else if ((now.isEqual(dataHoraInicio) || now.isAfter(getDataHoraInicio())) && now.isBefore(getDataHoraFim())) {
			setStatusLeilao(StatusLeilao.ANDAMENTO);
		}
	}
	
	public void ganhadoresLeilao() {
		try {
			for (Lance lance : getLances().getLances()) {
				Produto produto = (Produto) getProdutos().consultar(lance.getProduto().getMatricula());
				if (produto != null) {
					if(lance.getValor() > produto.getLance().getValor()) {
						produto.setLance(lance);
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Falha ao realizar operação");
		}
		
	}
	
}
