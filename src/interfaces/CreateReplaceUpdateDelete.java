package interfaces;

public interface CreateReplaceUpdateDelete {
	
	void adicionar (Object dado);
	Object consultar (String dado);
	Boolean remover (String dado);
	void atualizar (String dado, Object novo);

}
