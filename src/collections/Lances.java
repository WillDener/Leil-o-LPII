package collections;

import java.util.LinkedList;

import entities.Lance;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Lances {
	
	private LinkedList<Lance> lances = new LinkedList<Lance>();
	
	@Override
	public String toString() {
		String listaLances = "";
		for (Lance lance : lances) {
			listaLances += lance.toString();
		};
		return listaLances;
	}
	
	public void adicionarLance(Lance lance) {
		if(lance instanceof Lance) {
			getLances().add(lance);
		} else {
			throw new IllegalArgumentException("O item não é um lance");
		}
	}
	
	public void imprimirLances() {
		for (Lance lance : lances) {
			System.out.println(lance.toString());
		}
	}
	
}
