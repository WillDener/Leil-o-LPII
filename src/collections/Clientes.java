package collections;

import java.util.LinkedList;

import entities.Cliente;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Clientes {
	
	private LinkedList<Cliente> clientes = new LinkedList<Cliente>();
	
	@Override
	public String toString() {
		String listaClientes = "";
		for (Cliente cliente : clientes) {
			listaClientes += cliente.toString();
		};
		return listaClientes;
	}
	
	public void adicionarCliente(Cliente cliente) {
		if(cliente instanceof Cliente) {
			getClientes().add(cliente);
		} else {
			throw new IllegalArgumentException("O item não é um cliente");
		}
	}
	
	public void imprimirClientes() {
		for (Cliente cliente : clientes) {
			System.out.println(cliente.toString());
		}
	}
	
}
