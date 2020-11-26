package main;

import java.time.LocalDate;
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
		
		Produto p1 = new Imovel("123", "Casa maneira pra caramba", "Rua das Acácias", TipoImovel.CASA);
		
		Produto p2 = new Veiculo("123", "Carro mais ou menos legal", "ABC-1234", 189000, "Amarelo", TipoVeiculo.CARRO);
		
		p1s.adicionar(p1);
		
		p1s.adicionar(p2);
		
		p1s.imprimir();
		
		Clientes c1s = new Clientes();
		
		Cliente c1 = new Cliente("12345678910", "123456789", "Pessoa totalmente bem intecionada", "Rua da Fármacia", "email@email.com");
		
		c1s.adicionar(c1);
		
		c1s.imprimir();
		
		Instituicoes i1s = new Instituicoes();
		
		Instituicao i1 = new Instituicao("010203040506", "A loja de coisas usadas", "Rua Tupi Guaraná", "einteiro@einteiro.com");
		
		i1s.adicionar(i1);
		
		i1s.imprimir();
		
		Lances l1s = new Lances();
		
		Lance l1 = new Lance(c1, p1, 1000.0);
		
		l1s.adicionar(l1);
		
		l1s.imprimir();
		
		System.out.println();
		
		Integer dd1 = 25;
		Integer md1 = 11;
		Integer ad1 = 2020;
		
		LocalDate ld1 = LocalDate.of(ad1, md1, dd1);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String data = ld1.format(formatter);
		
		System.out.println(ld1);
		
		System.out.println(data);
		
		Integer dia = ld1.getDayOfMonth();
		Integer mes = ld1.getMonthValue();
		Integer ano = ld1.getYear();
		
		System.out.println(dia + "/" + mes + "/" + ano + " TESTE");
		
		System.out.println();
		
		Leilao ll1 = new Leilao(ld1, p1s, c1s, i1, l1s, StatusLeilao.ABERTO);
		
		Leiloes ll1s = new Leiloes();
		
		ll1s.adicionar(ll1);
		
		ll1s.imprimir();
		
		// c1s.adicionar(l1);
		
		System.out.println(c1s.consultar("12345678910").toString());
		
		System.out.println(c1s.consultar("123").toString());
		
		Cliente c2 = new Cliente("1", "1", "Pessoa mal intecionada", "Rua dos Químicos", "x@x.com");
		
		c1s.adicionar(c1);
		
		c1s.atualizar("1", c2);
		
		c1s.imprimir();
		
		c1s.atualizar("12345678910", c2);
		
		c1s.imprimir();
		
		System.out.println(c1s.remover("1"));
		
		System.out.println(c1s.remover("1"));
		
		c1s.imprimir();
		
		Leilao ll2 = new Leilao(ld1, p1s, c1s, i1, l1s, StatusLeilao.ABERTO);
		
		ll1s.adicionar(ll2);
		
		ll1s.imprimir();
		
		Integer dd2 = 1;
		Integer md2 = 11;
		Integer ad2 = 2020;
		
		LocalDate ld2 = LocalDate.of(ad2, md2, dd2);
		
		Leilao ll3 = new Leilao(ld2, p1s, c1s, i1, l1s, StatusLeilao.ABERTO);
		
		ll1s.adicionar(ll3);
		
		ll1s.ordenarLeiloes();
		
		ll1s.imprimir();
		
	}
	
}
