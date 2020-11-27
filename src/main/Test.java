package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import collections.Clientes;
import collections.Instituicoes;
import collections.Lances;
import collections.Leiloes;
import collections.Produtos;
import entities.Cliente;
import entities.Imovel;
import entities.Instituicao;
import entities.Lance;
import entities.Leilao;
import entities.Produto;
import entities.Veiculo;
import enums.StatusLeilao;
import enums.TipoImovel;
import enums.TipoVeiculo;

public class Test {

	public static void main(String[] args) {
		
		Produtos p1s = new Produtos();
		
		Produto p1 = new Imovel("123", "Casa maneira pra caramba", 1000.0, "Rua das Ac�cias", TipoImovel.CASA);
		
		Produto p2 = new Veiculo("000", "Carro menos legal", 1000.0, "ABC-1234", 100, "Amarelo", TipoVeiculo.CARRO);
		
		Produto p3 = new Veiculo("456", "Carro mais ou menos legal", 5000.0, "ABC-1234", 100, "Amarelo", TipoVeiculo.CARRO);
		
		Produto p4 = new Veiculo("789", "Motocicleta mais ou menos legal", 10000.0, "ABC-1234", 1000, "Amarelo", TipoVeiculo.MOTOCICLETA);
		
		p1s.adicionar(p1);
		
		p1s.adicionar(p2);
		
		p1s.adicionar(p3);
		
		p1s.adicionar(p4);
		
		System.out.println("IN�CIO TESTE FILTRO");
		
		Produtos pas = new Produtos();
				
		//pas = p1s.filtroFaixaValores(1000.0, 5000.0);								
		
		//pas = p1s.filtroPalavraChave("Carro");
		
		pas = p1s.filtroTipoProduto("Carro");
		
		pas.imprimir();
		
		System.out.println("FIM TESTE FILTRO");
		
		p1s.imprimir();
		
		Clientes c1s = new Clientes();
		
		Cliente c1 = new Cliente("12345678910", "123456789", "Pessoa totalmente bem intecionada", "Rua da F�rmacia", "email@email.com");
		
		c1s.adicionar(c1);
		
		c1s.imprimir();
		
		Instituicoes i1s = new Instituicoes();
		
		Instituicao i1 = new Instituicao("010203040506", "A loja de coisas usadas", "Rua Tupi Guaran�", "einteiro@einteiro.com");
		
		i1s.adicionar(i1);
		
		i1s.imprimir();
		
		Lances l1s = new Lances();
		
		Lance l1 = new Lance(c1, p1, 1000.0);
		
		l1s.adicionar(l1);
		
		l1s.imprimir();
		
		System.out.println();
		
		Integer diaData1 = 26;
		Integer mesData1 = 11;
		Integer anoData1 = 2020;
		Integer horaData1 = 22;
		Integer minutoData1 = 00;
		
		LocalDateTime dataInicio1 = LocalDateTime.of(anoData1, mesData1, diaData1, horaData1, minutoData1);
		
		Integer diaData2 = 26;
		Integer mesData2 = 11;
		Integer anoData2 = 2020;
		Integer horaData2 = 22;
		Integer minutoData2 = 05;
		
		LocalDateTime dataFim1 = LocalDateTime.of(anoData2, mesData2, diaData2, horaData2, minutoData2);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String data1 = dataInicio1.format(formatter);
		
		String data2 = dataFim1.format(formatter);
		
		System.out.println(dataInicio1);
		
		System.out.println(dataFim1);
		
		System.out.println();
		
		Leilao ll1 = new Leilao(dataInicio1, dataFim1, p1s, c1s, i1, l1s);
		
		Leiloes ll1s = new Leiloes();
		
		ll1s.adicionar(ll1);
		
		ll1s.imprimir();
		
		// c1s.adicionar(l1);
		
		System.out.println(c1s.consultar("12345678910").toString());
		
		System.out.println(c1s.consultar("123").toString());
		
		Cliente c2 = new Cliente("1", "1", "Pessoa mal intecionada", "Rua dos Qu�micos", "x@x.com");
		
		c1s.adicionar(c1);
		
		c1s.atualizar("1", c2);
		
		c1s.imprimir();
		
		c1s.atualizar("12345678910", c2);
		
		c1s.imprimir();
		
		System.out.println(c1s.remover("1"));
		
		System.out.println(c1s.remover("1"));
		
		c1s.imprimir();
		
		// Leilao ll2 = new Leilao(ld1, p1s, c1s, i1, l1s, StatusLeilao.ABERTO);
		
		// ll1s.adicionar(ll2);
		
		ll1s.imprimir();
		
		Integer dd2 = 1;
		Integer md2 = 11;
		Integer ad2 = 2020;
		
		LocalDate ld2 = LocalDate.of(ad2, md2, dd2);
		
		// Leilao ll3 = new Leilao(ld2, p1s, c1s, i1, l1s, StatusLeilao.ABERTO);
		
		// ll1s.adicionar(ll3);
		
		ll1s.ordenarLeiloesPorData();
		
		System.out.println();
		
		ll1s.imprimir();
		
		ll1s.ordenarLeiloesPeloId();
		
		System.out.println();
		
		ll1s.imprimir();
		
		System.out.println(ll1.getStatusLeilao().toString());
		
		ll1.updateStatusLeilao();
		
		System.out.println(ll1.getStatusLeilao().toString());
	}
	
}
