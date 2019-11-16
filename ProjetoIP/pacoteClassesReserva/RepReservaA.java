package pacoteClassesReserva;

import pacoteClassesPessoa.Pessoa;
import pacoteExcecoes.HIException;
import pacoteExcecoes.RNCException;

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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void remover(Reserva reserva) throws RNCException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Reserva reserva, Reserva alterada) throws RNCException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean horaOk(int hora) {
		// TODO Auto-generated method stub
		return false;
	}

}
