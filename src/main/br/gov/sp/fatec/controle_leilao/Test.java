package main.br.gov.sp.fatec.controle_leilao;

public class Test {

	public static void main(String[] args) {
		
		Produtos p1s = new Produtos();
		
		Produto p1 = new Imovel(123, "Rua das Acácias", "Casa maneira pra caramba", TipoImovel.CASA);
		Produto p2 = new Imovel(123, "Rua das Acácias", "Casa maneira pra caramba", TipoImovel.CASA);
		Produto p3 = new Imovel(123, "Rua das Acácias", "Casa maneira pra caramba", TipoImovel.CASA);
		Produto p4 = new Imovel(123, "Rua das Acácias", "Casa maneira pra caramba", TipoImovel.CASA);
		Produto p5 = new Imovel(123, "Rua das Acácias", "Casa maneira pra caramba", TipoImovel.CASA);
		Produto p6 = new Imovel(123, "Rua das Acácias", "Casa maneira pra caramba", TipoImovel.CASA);
		Produto p7 = new Imovel(123, "Rua das Acácias", "Casa maneira pra caramba", TipoImovel.CASA);
		Produto p8 = new Imovel(123, "Rua das Acácias", "Casa maneira pra caramba", TipoImovel.CASA);
		Produto p9 = new Veiculo(123, "ABC-1234", 189000.0, "Amarelo", "Carro mais ou menos legal", TipoVeiculo.CARRO);
		
		
		p1s.adicionarProduto(p1);
		p1s.adicionarProduto(p2);
		p1s.adicionarProduto(p3);
		p1s.adicionarProduto(p4);
		p1s.adicionarProduto(p5);
		p1s.adicionarProduto(p6);
		p1s.adicionarProduto(p7);
		p1s.adicionarProduto(p8);
		p1s.adicionarProduto(p9);
		
		p1s.imprimirProdutos();

	}

}
