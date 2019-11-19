package pacoteClassesReserva;

import pacoteExcecoes.NOException;
import pacoteExcecoes.HIException;
import pacoteExcecoes.RNCException;

public class NegocioReserva {
	
	private RepositorioReserva reserva;
	
	public NegocioReserva(int a) throws NOException {
		if (a == 1) {
			reserva = new RepReservaL();
		} else if (a == 2) {
			reserva = new RepReservaA();
		} else {
			throw new NOException();
		}
	}
	
	public void cadastrar(Reserva reserva) throws HIException {
		this.reserva.inserir(reserva);
	}

	public boolean existe(Reserva reserva) {
		return this.reserva.existe(reserva);
	}

	public void atualizar(Reserva reserva, Reserva alterada) throws RNCException{
		this.reserva.atualizar(reserva, alterada);
	}

	public void deletar(Reserva reserva) throws RNCException{
		this.reserva.remover(reserva);
	}
	
	public String procurarReserva(Reserva reserva) throws RNCException{
		return this.reserva.procurarReserva(reserva);
	}
	
	public static void main(String[] args) throws NOException {
		
	}

}

