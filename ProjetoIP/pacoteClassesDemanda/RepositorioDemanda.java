package pacoteClassesDemanda;

import pacoteExcecoes.EDException;

public interface RepositorioDemanda {

	public void inserir(Demanda demanda) throws EDException;

	public void remover(Demanda demanda);

	public void atualizar(Demanda demanda, Demanda nova);

	public Demanda procurarDemanda(Demanda demanda);
	
	public boolean existe (Demanda demanda);
}
