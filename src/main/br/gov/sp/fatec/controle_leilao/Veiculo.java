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
		return("Matr�cula do ve�culo: " + getMatricula() +
			   ", Placa do ve�culo: " + getPlaca() +
		       ", Kilometragem rodada: " + getKilometragem() +
		       ", Cor do ve�culo: " + getCor() +
		       ", Descri��o do ve�culo: " + getDescricao().toString() +
		       ", Valor do ve�culo: " + getValorProduto() +
		       ", Tipo do im�vel: " + getTipoVeiculo().toString()) + ".";
	}

}
