package pacoteClassesReserva;

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
		if (!this.existe(reserva) && reserva.horaOk(reserva)) {
			this.reserva[this.indice] = reserva;
			this.indice++;
		} else {
			throw new HIException();
		}
		
		
}

	@Override
	public boolean existe(Reserva reserva) {
		boolean resposta = false;
		for (int a = 0; a < indice && !resposta; a++) {
			if (this.reserva[a].igual(reserva)) {
				resposta = true;
			}
		}
		return resposta;
	}
	
	public boolean existeCompleto(Reserva reserva) {
		boolean resposta = false;
		for (int a = 0; a < indice && !resposta; a++) {
			if (this.reserva[a].igualCompleto(reserva)) {
				resposta = true;
			}
		}
		return resposta;
	}

	@Override
	public void remover(Reserva reserva) throws RNCException {
		if (this.existeCompleto(reserva)) {
			int proc = this.indice(reserva);
			for (int i = proc; i <= indice - 1; i++) {
				this.reserva[i] = this.reserva[i + 1];
			}
			this.indice--;
		} else {
			throw new RNCException();
		}
	}
	
	public int indice(Reserva reserva) throws RNCException {
		for (int i = 0; i < 100; i++) {
			if (this.reserva[i] != null && this.reserva[i].igual(reserva)) {  
				return i;
			}

		}
		throw new RNCException();
	}
	
	@Override
	public void atualizar(Reserva reserva, Reserva alterada) throws RNCException {
		int proc = this.indice(reserva);
		this.reserva[proc] = alterada;
		
	}


	@Override
	public String procurarReserva(Reserva reserva) throws RNCException {
		String info = "";
		if (this.existeCompleto(reserva)) {	
			int proc = this.indice(reserva);
			for (int i = proc; i <= indice - 1; i++) {
				info = reserva.getHora() + "\n" + reserva.getDia() + "\n" + reserva.getMes() + "\n" + reserva.getAno();
			}
		}
		else {
			throw new RNCException();
		}
		return info;
	}
	
	

}
