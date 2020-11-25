package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto {
	
	public Produto(Integer matricula, String descricao) {
		setMatricula(matricula);
		setDescricao(descricao);
	}
	
	private Integer matricula;
    private String descricao;
	private Double valorProduto = 0.0;
	
}
