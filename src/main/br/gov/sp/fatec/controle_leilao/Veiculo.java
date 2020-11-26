package main.br.gov.sp.fatec.controle_leilao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Veiculo extends Produto {
	
	private Integer matricula;
	private String placa;
	private Double kilometragem;
	private String cor;
	private String descricao;
    private TipoVeiculo tipoVeiculo;
    
    @Override
	public String toString() {
		return("Matrícula do veículo: " + getMatricula() +
			   ", Placa do veículo: " + getPlaca() +
		       ", Kilometragem rodada: " + getKilometragem() +
		       ", Cor do veículo: " + getCor() +
		       ", Descrição do veículo: " + getDescricao().toString() +
		       ", Valor do veículo: " + getValorProduto() +
		       ", Tipo do imóvel: " + getTipoVeiculo().toString()) + ".";
	}

}
