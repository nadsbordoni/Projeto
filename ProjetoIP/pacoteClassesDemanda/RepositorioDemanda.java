package pacoteClassesDemanda;

import pacoteExcecoes.EDException;
import pacoteExcecoes.NDException;

public interface RepositorioDemanda {

	public void inserir(Demanda demanda) throws EDException;

	public void remover(Demanda demanda) throws NDException;

	public void atualizar(Demanda demanda, Demanda nova) throws NDException;

	public Demanda procurarDemanda(Demanda demanda) throws NDException;
	
	public boolean existe (Demanda demanda);
}
