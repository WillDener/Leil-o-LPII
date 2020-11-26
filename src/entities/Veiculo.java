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
		return("Matr�cula do ve�culo: " + getMatricula() +
			   ", Placa do ve�culo: " + getPlaca() +
		       ", Kilometragem rodada: " + getKilometragem() +
		       ", Cor do ve�culo: " + getCor() +
		       ", Descri��o do ve�culo: " + getDescricao().toString() +
		       ", Valor m�nimo do ve�culo: " + getValorMinimoProduto() +
		       ", Tipo do im�vel: " + getTipoVeiculo().toString()) + ".";
	}
    
}
