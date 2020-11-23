package main.br.gov.sp.fatec.controle_leilao;

public enum TipoVeiculo {
	
	CARRO("Carro"), MOTOCICLETA("Motocicleta");
	
	private final String tipoVeiculo;
	
	TipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	
	@Override
	public String toString(){
		return tipoVeiculo;
	}
}
