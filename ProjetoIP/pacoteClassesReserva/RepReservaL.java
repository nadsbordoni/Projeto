package pacoteClassesReserva;

public class RepReservaL implements RepositorioReserva{

	private Reserva reserva;
	private RepReservaL proximo;
	
	public RepReservaL(){
		this.reserva = null;
		this.proximo = null;
	}
	
	@Override
	public void inserir(Reserva reserva) throws HIException {  
		/*
		 * tem que ver se o usuario foi cadastrado... --> isso é na classe negocio 
		 * revisa que parece estranho
		 * pra inserir tem que ver se já não existe a reserva e tem que saber se tá dentro do horario permitido
		 * ver a hora no inserir
		 */
		if (this.proximo == null) {
			if (!this.procurar(reserva) && horaOk(reserva.getHora())) {
				this.reserva = reserva;
				this.proximo = new RepReservaL();
			}
			else if (this.procurar(reserva) || !horaOk(reserva.getHora())) {
				throw new HIException();
			}
		}
		else {
			this.proximo.inserir(reserva);
		}
	}

	@Override
	public boolean procurar(Reserva reserva) {
		if (this.reserva != null) {
			if (this.reserva == reserva) {
				return true;
			}else 
				return this.proximo.procurar(reserva);
		} else {
			return false;
		}
	}

	@Override
	public void remover(Reserva reserva) throws RIException {
		if (this.reserva != null) {
			if (this.reserva == reserva) {
				this.reserva = this.proximo.reserva;
				this.proximo = this.proximo.proximo;
			} else {
				this.proximo.remover(reserva);
			}
		} else {
			throw new RIException();
		}
		
	}

	@Override
	public void atualizar(Reserva reservaAlterada) {
		
		
	}
	
	public boolean horaOk(int hora) {
		boolean ok = false;
		if (hora>=9 && hora<=18) {
			ok = true;
		}
		return ok;
	}

}
