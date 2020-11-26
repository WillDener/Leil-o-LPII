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
		return("Matr�cula do im�vel: " + getMatricula() + ",\n" +
			   "Endere�o do im�vel: " + getEndereco() + ",\n" +
		       "Descri��o do im�vel: " + getDescricao() + ",\n" +
		       "Valor m�nimo do im�vel: " + getValorMinimoProduto() + ",\n" +
		       "Tipo do im�vel: " + getTipoImovel().toString()) + ".\n\n";
	}
	
}
