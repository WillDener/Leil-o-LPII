package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto {
	
	public Produto(String matricula, String descricao, Double valorMinimoProduto) {
		setMatricula(matricula);
		setDescricao(descricao);
		setValorMinimoProduto(valorMinimoProduto);
	}
	
	private String matricula;
    private String descricao;
	private Double valorMinimoProduto;
	private Double valorFinalProduto = 0.0;
	
}
