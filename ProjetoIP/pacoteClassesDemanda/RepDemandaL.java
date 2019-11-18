package pacoteClassesDemanda;

import pacoteExcecoes.EDException;
import pacoteExcecoes.NDException;

public class RepDemandaL implements RepositorioDemanda {

	private Demanda demanda;
	private RepDemandaL proximo;

	public RepDemandaL() {
		this.demanda = null;
		this.proximo = null;
	}

	@Override
	public void inserir(Demanda demanda) throws EDException{
		if (!this.existe(demanda)) {
			if (this.demanda == null) {
				this.demanda = demanda;
				this.proximo = new RepDemandaL();
			} else {
				this.proximo.inserir(demanda);
			}
		} else {
			throw new EDException();
		}
	}

	@Override
	public void remover(Demanda demanda) throws NDException {
		if (this.demanda != null) {
			if (this.demanda.equals(demanda)) {
				this.demanda = this.proximo.demanda;
				this.proximo = this.proximo.proximo;
			} else {
				this.proximo.remover(demanda);
			}
		} else {
			throw new NDException();
		}
	}

	@Override
	public void atualizar(Demanda demanda, Demanda nova) throws NDException {
		if (this.demanda != null) {
			if (this.demanda.igual(demanda)) {
				this.demanda = nova;
			} else {
				this.proximo.atualizar(demanda, nova);
			}
		} else {
			throw new NDException();
		}

	}

	@Override
	public Demanda procurarDemanda(Demanda demanda) throws NDException {
		Demanda aux = null;
		if (this.demanda != null) {
			if (this.demanda.equals(demanda)) {
				aux = this.demanda;
			} else {
				aux = this.proximo.procurarDemanda(demanda);
			}
		} else {
			throw new NDException();
		}
		return aux;
	}

	@Override
	public boolean existe(Demanda demanda) {
		boolean existe = false;
		if (this.demanda == null)
			return false;
		if (this.demanda.equals(demanda)) {
			existe = true;
		} else if (this.proximo != null) {
			existe = this.proximo.existe(demanda);
		} else {
			existe = false;
		}
		return existe;
	}

}
