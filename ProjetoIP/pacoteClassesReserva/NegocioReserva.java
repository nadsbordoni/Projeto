package pacoteClassesReserva;

import pacoteExcecoes.NOException;
import pacoteExcecoes.HIException;
import pacoteExcecoes.RNCException;

public class NegocioReserva {
	
	RepositorioReserva horario;
	
	public NegocioReserva(int a) throws NOException {
		if (a == 1) {
			horario = new RepReservaL();
		} else if (a == 2) {
			horario = new RepReservaA();
		} else {
			throw new NOException();
		}
	}
	
	public void cadastrar(Reserva reserva) throws HIException {
		this.horario.inserir(reserva);
	}

	public boolean existe(Reserva reserva) {
		return this.horario.existe(reserva);
	}

	public void atualizar(Reserva reserva, Reserva alterada) throws RNCException{
		this.horario.atualizar(reserva, alterada);
	}

	public void deletar(Reserva reserva) throws RNCException{
		this.horario.remover(reserva);
	}
	
	public String procurarReserva(Reserva reserva) throws RNCException{
		return this.horario.procurarReserva(reserva);
	}

}
