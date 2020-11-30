package entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Produto {
	
	private String matricula;
    private String descricao;
	private Double valorMinimoProduto;
	private Double valorFinalProduto = 0.0;
	
	public Produto(String matricula, String descricao, Double valorMinimoProduto) {
		setMatricula(matricula);
		setDescricao(descricao);
		setValorMinimoProduto(valorMinimoProduto);
	}
	
}
