package collections;

import java.util.LinkedList;

import entities.Instituicao;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Instituicoes {
	
	private LinkedList<Instituicao> instituicoes = new LinkedList<Instituicao>();

	@Override
	public String toString() {
		String listaInstituicoes = "";
		for (Instituicao instituicao : instituicoes) {
			listaInstituicoes += instituicao.toString();
		};
		return listaInstituicoes;
	}
	
	public void adicionarInstituicao(Instituicao instituicao) {
		if(instituicao instanceof Instituicao) {
			getInstituicoes().add(instituicao);
		} else {
			throw new IllegalArgumentException("O item não é uma instituição");
		}
	}
	
	public void imprimirInstituicoes() {
		for (Instituicao instituicao : instituicoes) {
			System.out.println(instituicao.toString());
		}
	}
	
}
