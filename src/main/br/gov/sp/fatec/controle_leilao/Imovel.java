package main.br.gov.sp.fatec.controle_leilao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Imovel extends Produto {

    private Integer matricula;
    private String endereco;
    private String descricao;
    private TipoImovel tipoImovel;
    
	@Override
	public String toString() {
		return("Matr�cula do im�vel: " + getMatricula() +
			   ", Endere�o do im�vel: " + getEndereco() +
		       ", Descri��o do im�vel: " + getDescricao() +
		       ", Valor do im�vel: " + getValorProduto() +
		       ", Tipo do im�vel: " + getTipoImovel().toString()) + ".";
	}

}
