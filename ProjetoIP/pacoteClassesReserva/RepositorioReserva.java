package pacoteClassesReserva;

import pacoteExcecoes.HIException;
import pacoteExcecoes.RNCException;


public interface RepositorioReserva {

	public void inserir(Reserva reserva) throws HIException;
	
	public void remover(int codigo) throws RNCException;
	
	public void atualizar(int codigo, Reserva alterada) throws RNCException;

	public String procurarReserva(int codigo) throws RNCException;
	
	public boolean existe(Reserva reserva); //deixei reserva e nao codigo pois a interface de repositorio da demanda tava assim




}
