package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto {
	
	public Produto(String matricula, String descricao) {
		setMatricula(matricula);
		setDescricao(descricao);
	}
	
	private String matricula;
    private String descricao;
	private Double valorProduto = 0.0;
	
}
