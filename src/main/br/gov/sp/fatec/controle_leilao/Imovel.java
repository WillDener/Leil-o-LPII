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
		return("Matrícula do imóvel: " + getMatricula() +
			   ", Endereço do imóvel: " + getEndereco() +
		       ", Descrição do imóvel: " + getDescricao() +
		       ", Valor do imóvel: " + getValorProduto() +
		       ", Tipo do imóvel: " + getTipoImovel().toString()) + ".";
	}

}
