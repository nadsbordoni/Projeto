package pacoteClassesReserva;


import pacoteExcecoes.HIException;
import pacoteExcecoes.RNCException;

public class RepReservaL implements RepositorioReserva {

	private Reserva reserva;
	private RepReservaL proximo;

	public RepReservaL() {
		this.reserva = null;
		this.proximo = null;
	}

	@Override
	public void inserir(Reserva reserva) throws HIException { 
		if (this.proximo == null) {
			if (!this.existe(reserva) && reserva.horaOk(reserva)) {
				this.reserva = reserva;
				this.proximo = new RepReservaL();
			} else if (this.existe(reserva) || !reserva.horaOk(reserva)) {
				throw new HIException();
			}
		} else {
			this.proximo.inserir(reserva);
		}
	}

	@Override
	public boolean existe(Reserva reserva) {
		if (this.reserva != null) {
			if (this.reserva.igual(reserva)) {
				return true;
			} else
				return this.proximo.existe(reserva);
		} else {
			return false;
		}
	}

	@Override
	public void remover(int codigo) throws RNCException {
		if (this.reserva != null) {
			if (this.reserva.getCodigo()==codigo) {
				this.reserva = this.proximo.reserva;
				this.proximo = this.proximo.proximo;
			} else {
				this.proximo.remover(codigo);
			}
		} else {
			throw new RNCException();
		}

	}

	@Override
	public void atualizar(int codigo, Reserva alterada) throws RNCException {
		if (this.reserva != null) {
			if (this.reserva.getCodigo()==codigo) {
				this.reserva = alterada;
			} else {
				this.proximo.atualizar(codigo, alterada);
			}
		} else {
			throw new RNCException();
		}
	}

	
	public String procurarReserva(int codigo) throws RNCException {
		String info = "";
		if (this.reserva != null) {
			if (this.reserva.getCodigo()==codigo) {
				info = this.reserva.getHora() + "\n" + this.reserva.getDia() //this mesmo?
				+ "\n" + this.reserva.getMes() + "\n" + this.reserva.getAno();
			} else {
				this.proximo.procurarReserva(codigo);
			}
		} else {
			throw new RNCException();
		}
		return info; //oi
	}
	
//	public static void main(String[] args) throws HIException {
//		Scanner in = new Scanner (System.in);
//		RepReservaL lista = new RepReservaL();
//		
//		PessoaFisica p = new PessoaFisica("Joao", "4324", "234234", "234234");
//		Reserva reserva = new Reserva(9, 20, 2, 2019, p);
//		lista.inserir(reserva);
//	}


}
