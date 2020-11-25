package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Cliente {
	
	private String cpf;
	private String rg;
	private String nomeCompleto;
	private String endereco;
	private String email;
	
	@Override
	public String toString() {
		return("CPF do cliente: " + getCpf() +
			   ", RG do cliente: " + getRg() +
			   ", Nome completo do cliente: " + getNomeCompleto() +
			   ", Endereço do cliente: " + getEndereco() +
		       ", Email do cliente: " + getEmail()) + ".";
	}
	
}
