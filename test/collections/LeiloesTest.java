package collections;

import java.time.LocalDateTime;
import java.time.ZoneId;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import entities.Cliente;
import entities.Imovel;
import entities.Instituicao;
import entities.Lance;
import entities.Leilao;
import entities.Veiculo;
import enums.StatusLeilao;
import enums.TipoImovel;
import enums.TipoVeiculo;

public class LeiloesTest {

	private Leiloes cut;
	
	private Imovel imovel1;
	private Imovel imovel2;
	private Imovel imovel3;
	private Imovel imovel4;
	
	private Veiculo veiculo1;
	private Veiculo veiculo2;
	
	private Produtos produtos;
	
	private Clientes clientes;
	
	private Cliente cliente1;
	private Cliente cliente2;
	
	private Instituicao instituicao;
	
	private Lances lances;
	
	private Lance lance1;
	private Lance lance2;
	private Lance lance3;
	private Lance lance4;
	private Lance lance5;
	private Lance lance6;
	
	@Before
	public void init() {
		cut = new Leiloes();
		
		imovel1 = new Imovel("ABC123", "Casa maneira", 100000.00, "Rua legal", TipoImovel.CASA);
		imovel2 = new Imovel("DEF456", "Apartamento maneiro", 80000.00, "Rua legal", TipoImovel.APARTAMENTO);
		imovel3 = new Imovel("GHI789", "Edifício maneiro", 50000.00, "Rua legal", TipoImovel.EDIFICIO);
		imovel4 = new Imovel("JKL100", "Terreno maneiro", 50000.00, "Rua legal", TipoImovel.TERRENO);
		
		veiculo1 = new Veiculo("XPTO1", "Carro gasto mas roda bem", 10000.00, "ABC-1234", 45000, "Amarelo", TipoVeiculo.CARRO);
		veiculo2 = new Veiculo("XPTO2", "Moto velha roubada", 6000.00, "DEF-5678", 25000, "Azul", TipoVeiculo.MOTOCICLETA);
		
		produtos = new Produtos();
		produtos.adicionar(imovel1);
		produtos.adicionar(imovel2);
		produtos.adicionar(imovel3);
		produtos.adicionar(imovel4);
		produtos.adicionar(veiculo1);
		produtos.adicionar(veiculo2);
		
		cliente1 = new Cliente("12345678910", "123456789", "Juarez Melez", "Rua da tristeza", "email@email.com");
		cliente2 = new Cliente("10987654321", "987654321", "Martinez Font", "Rua da agonia", "e@e.com");
		
		clientes = new Clientes();
		clientes.adicionar(cliente1);
		clientes.adicionar(cliente2);
		
		instituicao = new Instituicao("0001123456", "IBGEF", "Avenida nilda", "a@a.com");
		
		lance1 = new Lance(cliente1, imovel1, 200000.00);
		lance2 = new Lance(cliente2, imovel2, 200000.00);
		lance3 = new Lance(cliente1, imovel3, 200000.00);
		lance4 = new Lance(cliente2, imovel4, 200000.00);
		lance5 = new Lance(cliente1, veiculo1, 200000.00);
		lance6 = new Lance(cliente2, veiculo2, 200000.00);
		
		lances = new Lances();
		lances.adicionar(lance1);
		lances.adicionar(lance2);
		lances.adicionar(lance3);
		lances.adicionar(lance4);
		lances.adicionar(lance5);
		lances.adicionar(lance6);
	}
	
	@Test
	public void validarStatusLeilaoAberto() {
		LocalDateTime now = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
		
		Leilao leilao = new Leilao(now.plusMinutes(5), now.plusMinutes(10), produtos, clientes, instituicao, lances);
		Assert.assertEquals(StatusLeilao.ABERTO, leilao.getStatusLeilao());
	}
	
	@Test
	public void validarStatusLeilaoAndamento() {
		LocalDateTime now = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
		
		Leilao leilao = new Leilao(now, now.plusMinutes(10), produtos, clientes, instituicao, lances);
		Assert.assertEquals(StatusLeilao.ANDAMENTO, leilao.getStatusLeilao());
	}
	
	@Test
	public void validarStatusLeilaoFechado() {
		LocalDateTime now = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
		
		Leilao leilao = new Leilao(now.minusMinutes(10), now.minusMinutes(5), produtos, clientes, instituicao, lances);
		Assert.assertEquals(StatusLeilao.FINALIZADO, leilao.getStatusLeilao());
	}
	
}
