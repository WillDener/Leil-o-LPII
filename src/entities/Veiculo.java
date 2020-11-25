package entities;

import enums.TipoVeiculo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Veiculo extends Produto {
	
	public Veiculo(Integer matricula, String descricao, 
				    String placa, Integer kilometragem, String cor, TipoVeiculo tipoVeiculo) {
		super(matricula, descricao);
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
		       ", Tipo do im�vel: " + getTipoVeiculo().toString()) + ".";
	}
    
}
