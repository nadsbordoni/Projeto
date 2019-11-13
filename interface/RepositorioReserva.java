import HIException;
import RIException;

public interface RepositorioReserva {

	public void inserir (Reserva reserva) throws HIException; 
	
	public boolean procurar (Reserva reserva); //duvida
	
	public void remover (Reserva reserva) throws RIException;
	
	public void atualizar (Reserva reservaAlterada);
	
	public boolean horaOk (int hora); //e agora josé?
	
}
