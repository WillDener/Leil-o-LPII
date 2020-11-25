package main;

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
		
		Produto p1 = new Imovel(123, "Casa maneira pra caramba", "Rua das Acácias", TipoImovel.CASA);
		
		Produto p2 = new Veiculo(123, "Carro mais ou menos legal", "ABC-1234", 189000, "Amarelo", TipoVeiculo.CARRO);
		
		p1s.adicionarProduto(p1);
		
		p1s.adicionarProduto(p2);
		
		p1s.imprimirProdutos();
		
		Clientes c1s = new Clientes();
		
		Cliente c1 = new Cliente("12345678910", "123456789", "Pessoa totalmente bem intecionada", "Rua da Fármacia", "email@email.com");
		
		c1s.adicionar(c1);
		
		c1s.imprimirClientes();
		
		Instituicoes i1s = new Instituicoes();
		
		Instituicao i1 = new Instituicao("010203040506", "A loja de coisas usadas", "Rua Tupi Guaraná", "einteiro@einteiro.com");
		
		i1s.adicionarInstituicao(i1);
		
		i1s.imprimirInstituicoes();
		
		Lances l1s = new Lances();
		
		Lance l1 = new Lance(c1, p1, 1000.0);
		
		l1s.adicionarLance(l1);
		
		l1s.imprimirLances();
		
		Leilao ll1 = new Leilao(p1s, c1s, i1, l1s, StatusLeilao.ABERTO);
		
		Leiloes ll1s = new Leiloes();
		
		ll1s.adicionarLeilao(ll1);
		
		ll1s.imprimirLeiloes();
		
		// c1s.adicionar(l1);
		
		System.out.println(c1s.consultar("12345678910").toString());
		
		System.out.println(c1s.consultar("123").toString());
		
		Cliente c2 = new Cliente("1", "1", "Pessoa mal intecionada", "Rua dos Químicos", "x@x.com");
		
		c1s.atualizar("1", c2);
		
		c1s.imprimirClientes();
		
		c1s.atualizar("12345678910", c2);
		
		c1s.imprimirClientes();
		
		System.out.println(c1s.remover("1"));
		
		System.out.println(c1s.remover("1"));
		
		c1s.imprimirClientes();
		
	}
	
}
