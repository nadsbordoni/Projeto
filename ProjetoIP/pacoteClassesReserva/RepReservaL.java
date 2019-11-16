package pacoteClassesReserva;

import pacoteExcecoes.HIException;
import pacoteExcecoes.RNCException;
import pacoteExcecoes.UIException;

public class RepReservaL implements RepositorioReserva {

	private Reserva reserva;
	private RepReservaL proximo;

	public RepReservaL() {
		this.reserva = null;
		this.proximo = null;
	}

	@Override
	public void inserir(Reserva reserva) throws HIException { //ve se eh na classe negocio o coisa do usuario 
		if (this.proximo == null) {
			if (!this.procurar(reserva) && horaOk(reserva.getHora())) {
				this.reserva = reserva;
				this.proximo = new RepReservaL();
			} else if (this.procurar(reserva) || !horaOk(reserva.getHora())) {
				throw new HIException();
			}
		} else {
			this.proximo.inserir(reserva);
		}
	}

	@Override
	public boolean procurar(Reserva reserva) {
		if (this.reserva != null) {
			if (this.reserva == reserva) {
				return true;
			} else
				return this.proximo.procurar(reserva);
		} else {
			return false;
		}
	}

	@Override
	public void remover(Reserva reserva) throws RNCException {
		if (this.reserva != null) {
			if (this.reserva == reserva) {
				this.reserva = this.proximo.reserva;
				this.proximo = this.proximo.proximo;
			} else {
				this.proximo.remover(reserva);
			}
		} else {
			throw new RNCException();
		}

	}

	@Override
	public void atualizar(Reserva reserva, Reserva alterada) throws RNCException {
		if (this.reserva != null) {
			if (this.reserva == reserva) {
				this.reserva = alterada;
			} else {
				this.proximo.atualizar(reserva, alterada);
			}
		} else {
			throw new RNCException();
		}
	}

	public boolean horaOk(int hora) {
		boolean ok = false;
		if (hora >= 9 && hora <= 18) {
			ok = true;
		}
		return ok;
	}

}
