
public interface RepositorioReserva {

	public void inserir (Reserva reserva);
	
	public boolean procurar (Reserva reserva); 
	/* acho que teria que usar a classe pessoa
	 * duvida
	 */
	
	public void remover (Reserva reserva);
	
	public void atualizar (Reserva reservaAlterada);
	
}
