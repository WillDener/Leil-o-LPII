package entities;

import enums.TipoImovel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Imovel extends Produto {
	
	public Imovel(String matricula, String descricao, 
				   String endereco, TipoImovel tipoImovel) {
		super(matricula, descricao);
		setEndereco(endereco);
		setTipoImovel(tipoImovel);
	}

	private String endereco;
    private TipoImovel tipoImovel;
    
	@Override
	public String toString() {
		return("Matr�cula do im�vel: " + getMatricula() +
			   ", Endere�o do im�vel: " + getEndereco() +
		       ", Descri��o do im�vel: " + getDescricao() +
		       ", Tipo do im�vel: " + getTipoImovel().toString()) + ".";
	}
	
}
