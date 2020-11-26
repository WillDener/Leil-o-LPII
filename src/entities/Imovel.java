package entities;

import enums.TipoImovel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Imovel extends Produto {
	
	public Imovel(String matricula, String descricao, Double valorMinimoProduto, 
				   String endereco, TipoImovel tipoImovel) {
		super(matricula, descricao, valorMinimoProduto);
		setEndereco(endereco);
		setTipoImovel(tipoImovel);
	}

	private String endereco;
    private TipoImovel tipoImovel;
    
	@Override
	public String toString() {
		return("Matrícula do imóvel: " + getMatricula() +
			   ", Endereço do imóvel: " + getEndereco() +
		       ", Descrição do imóvel: " + getDescricao() +
		       ", Valor mínimo do imóvel: " + getValorMinimoProduto() +
		       ", Tipo do imóvel: " + getTipoImovel().toString()) + ".";
	}
	
}
