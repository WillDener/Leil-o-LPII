package entities;

import enums.TipoVeiculo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Veiculo extends Produto {
	
	public Veiculo(String matricula, String descricao, Double valorMinimoProduto,
				   String placa, Integer kilometragem, String cor, TipoVeiculo tipoVeiculo) {
		super(matricula, descricao, valorMinimoProduto);
		setPlaca(placa);
		setKilometragem(kilometragem);
		setCor(cor);
		setTipoVeiculo(tipoVeiculo);
	}

	private String placa;
	private Integer kilometragem;
	private String cor;
	private TipoVeiculo tipoVeiculo;
    
    @Override
	public String toString() {
		return("Matrícula do veículo: " + getMatricula() + ",\n" +
			   "Placa do veículo: " + getPlaca() + "\n" +
		       "Kilometragem rodada: " + getKilometragem() + ",\n" +
		       "Cor do veículo: " + getCor() + ",\n" +
		       "Descrição do veículo: " + getDescricao().toString() + ",\n" +
		       "Valor mínimo do veículo: " + getValorMinimoProduto() + ",\n" +
		       "Tipo do imóvel: " + getTipoVeiculo().toString()) + ".\n\n";
	}
    
}
