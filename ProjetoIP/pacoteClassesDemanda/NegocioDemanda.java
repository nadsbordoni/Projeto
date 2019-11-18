package pacoteClassesDemanda;

import pacoteExcecoes.EDException;
import pacoteExcecoes.NDException;
import pacoteExcecoes.NOException;

public class NegocioDemanda {

	RepositorioDemanda demandas;
	
	public NegocioDemanda(int a) throws NOException {
		if (a == 1) {
			demandas = new RepDemandaL();
		} else if (a == 2) {
			demandas= new RepDemandaA();
		} else {
			throw new NOException();
		}
	}
	public void cadastrar(Demanda demanda) throws EDException{
		this.demandas.inserir(demanda);
	}

	public void remover(Demanda demanda) throws NDException{
		this.demandas.remover(demanda);
	}

	public void atualizarDemanda(Demanda demanda, Demanda nova) throws NDException{
		this.demandas.atualizar(demanda, nova);
	}

	public Demanda procurarDemanda(Demanda demanda) throws NDException{
		return this.demandas.procurarDemanda(demanda);
	}
	
	public boolean existe (Demanda demanda) {
		return this.demandas.existe(demanda);
	}
}
