package pacoteClassesReserva;

import pacoteClassesPessoa.Pessoa;
import pacoteExcecoes.HIException;
import pacoteExcecoes.RNCException;
import pacoteExcecoes.UIException;

public class RepReservaA implements RepositorioReserva {
	
	private Reserva[] reserva;
	private int indice;

	public RepReservaA() {
		reserva = new Reserva[100];
		indice = 0;
	}
	
	@Override
	public void inserir(Reserva reserva) throws HIException {
		if (!this.procurar(reserva) && horaOk(reserva.getHora())) {
			this.reserva[this.indice] = reserva;
			this.indice++;
		} else {
			throw new HIException();
		}
		
		
}

	@Override
	public boolean procurar(Reserva reserva) {
		boolean resposta = false;
		for (int a = 0; a < indice && !resposta; a++) {
			if (this.reserva[a] == reserva) {
				resposta = true;
			}
		}
		return resposta;
	}

	@Override
	public void remover(Reserva reserva) throws RNCException {
		if (this.procurar(reserva)) {
			int proc = this.indice(reserva);
			for (int i = proc; i <= indice - 1; i++) {
				this.reserva[i] = this.reserva[i + 1];
			}
			this.indice--;
		} else {
			throw new RNCException();
		}
	}
	
	public int indice(Reserva reserva) throws RNCException {
		for (int i = 0; i < 100; i++) {
			if (this.reserva[i] != null && this.reserva[i] == reserva) {  //to fazendo isso errado q eu sei
				return i;
			}

		}
		throw new RNCException();
	}
	
	@Override
	public void atualizar(Reserva reserva, Reserva alterada) throws RNCException {
		int proc = this.indice(reserva);
		this.reserva[proc] = alterada;
		
	}

	@Override
	public boolean horaOk(int hora) {
		boolean ok = false;
		if (hora >= 9 && hora <= 18) {
			ok = true;
		}
		return ok;
	}
	
	

}
