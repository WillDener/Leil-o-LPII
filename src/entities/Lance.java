package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Lance {
	
	private Cliente cliente;
	private Produto produto;
	private Double valor;
	
	@Override
	public String toString() {
		return(getCliente().toString() + " " +
			   getProduto().toString() + " " +
			   "Valor do lance: R$ " + String.format("%.2f", getValor()) + ".");
	}
	
}
