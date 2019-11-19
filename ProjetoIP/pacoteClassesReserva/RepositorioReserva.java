package pacoteClassesReserva;

import pacoteExcecoes.HIException;
import pacoteExcecoes.RNCException;


public interface RepositorioReserva {

	public void inserir(Reserva reserva) throws HIException;

	public boolean existe(Reserva reserva); 

	public void remover(Reserva reserva) throws RNCException;

	public void atualizar(Reserva reserva, Reserva alterada) throws RNCException;

	public String procurarReserva(Reserva reserva) throws RNCException;

}
