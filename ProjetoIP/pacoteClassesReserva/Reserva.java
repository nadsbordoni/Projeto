package pacoteClassesReserva;

import pacoteClassesPessoa.RepositorioPessoa;
import pacoteClassesPessoa.RepPessoaL;

public class Reserva {
	private RepositorioPessoa pessoa;  //duvida
	private int hora;
	private int dia;
	private int mes;
	private int ano;
	private RepositorioReserva reserva;  //duvida tambem

	Reserva(int hora, int dia, int mes, int ano) {
		this.hora = hora;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.pessoa = new RepPessoaL(); //duvida
		this.reserva = new RepReservaL(); //duvidaaaaaa
	}

	public int getHora() {
		return this.hora;
	}

	public int getDia() {
		return this.dia;
	}

	public int getMes() {
		return this.mes;
	}

	public int getAno() {
		return this.ano;
	}

	public void setHora() {
		this.hora = hora;
	}

	public void setDia() {
		this.dia = dia;
	}

	public void setMes() {
		this.mes = mes;
	}

	public void setAno() {
		this.ano = ano;
	}

	public RepositorioPessoa getPessoa() { 
		return this.pessoa;
	}

	public void setPessoa(RepositorioPessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public RepositorioReserva getReserva() {
		return this.reserva;
	}
	
	public void setReserva(RepositorioReserva reserva) {
		this.reserva = reserva;
	}
	
	public boolean igual(Reserva reserva) {
		return false;
		
	}
}
