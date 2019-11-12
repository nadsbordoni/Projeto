
public interface RepositorioReserva {

	public void inserir (Reserva reserva) throws HIException; 
	
	public boolean procurar (Reserva reserva); //duvida
	
	public void remover (Reserva reserva) throws RIException;
	
	public void atualizar (Reserva reservaAlterada);
	
}
