package pacoteClassesReserva;

import pacoteExcecoes.NOException;
import pacoteClassesDemanda.Demanda;
import pacoteClassesPessoa.PessoaFisica;
import pacoteExcecoes.HIException;
import pacoteExcecoes.RNCException;

public class NegocioReserva {
	
	private RepositorioReserva reservas;
	
	public NegocioReserva(int a) throws NOException {
		if (a == 1) {
			reservas = new RepReservaL();
		} else if (a == 2) {
			reservas = new RepReservaA();
		} else {
			throw new NOException();
		}
	}
	
	public void cadastrar(Reserva reserva) throws HIException {//okok
		if(this.reservas.existe(reserva) || !reserva.horaOk()) throw new HIException();
		this.reservas.inserir(reserva);
	}

	public boolean existe(int i) {//okok
		return this.reservas.existe(i);
	}
	
	public boolean existe(Reserva reserva) {//okok
		return this.reservas.existe(reserva);
	}

	public void atualizar(int codigo, Reserva alterada) throws RNCException{//okok
		this.reservas.atualizar(codigo, alterada);
	}

	public void deletar(int codigo) throws RNCException{//okok
		this.reservas.remover(codigo);
	}
	
	public String procurarReserva(int codigo) throws RNCException{//pkok
		if(!this.reservas.existe(codigo)) throw new RNCException();
		return this.reservas.procurarReserva(codigo);
	}
	/*
	public static void main(String[] args) throws HIException, NOException, RNCException  {
		NegocioReserva reserva = new NegocioReserva(2);
		PessoaFisica g = new PessoaFisica("Gabriel", "47932", "439843", "732849");
		PessoaFisica n = new PessoaFisica("Nadia", "47382", "2473849", "728343");
		PessoaFisica a = new PessoaFisica("Alysson", "74423", "47238", "4987398");
		PessoaFisica b = new PessoaFisica("nat", "das", "472dasd38", "49dasd87398");
		Demanda gg = new Demanda(g, "produto", "nao gostei");
		Demanda nn = new Demanda(n, "Atendimento", "pessimo");
		Demanda aa = new Demanda(a, "local", "fedia a xixi");
		Demanda bb = new Demanda(b, "locael", "fede a coco");
		Reserva r1,r2,r3;
		gg.setCodigo(1);
		nn.setCodigo(2);
		aa.setCodigo(3);
		bb.setCodigo(4);
		
		r1 = new Reserva(9,1,0,213,g,gg); 
		r2 = new Reserva(9,1,0,214,n,nn);
		r3 = new Reserva(9,1,0,215,a,aa);
		Reserva r4 = new Reserva(10,132,2,2123213,b,bb);
		
		reserva.cadastrar(r1);
	
		reserva.cadastrar(r2);
		reserva.cadastrar(r3);
		int codigo = r2.getCodigo();
		int cr4 = r4.getCodigo();
		reserva.atualizar(codigo, r4);
		
		System.out.println(reserva.existe(r4));
	
		System.out.println(reserva.procurarReserva(1));
		System.out.println(reserva.procurarReserva(4));
		System.out.println(reserva.procurarReserva(3));
		
		
		
	}
*/
}

