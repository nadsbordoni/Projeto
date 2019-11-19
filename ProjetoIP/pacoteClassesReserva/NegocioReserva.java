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

	public void atualizar(int codigo, Reserva alterada) throws RNCException{
		this.reserva.atualizar(codigo, alterada);
	}

	public void deletar(int codigo) throws RNCException{
		this.reserva.remover(codigo);
	}
	
	public String procurarReserva(int codigo) throws RNCException{
		return this.reserva.procurarReserva(codigo);
	}
	
	public static void main(String[] args) throws NOException {
		
	}

}

