package pacoteClassesReserva;

import pacoteClassesPessoa.RepositorioPessoa;
import pacoteClassesPessoa.Pessoa;
import pacoteClassesPessoa.RepPessoaL;

public class Reserva {
	private Pessoa pessoa;  //duvida
	private int hora;
	private int dia;
	private int mes;
	private int ano;

	Reserva(int hora, int dia, int mes, int ano, Pessoa pessoa) {
		this.hora = hora;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.pessoa = pessoa; //duvida
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
		return this.getPessoa();
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public RepositorioReserva getReserva() {
		return this.getReserva();
	}
	
	public void setReserva(Reserva reserva) {
		this.mes = reserva.getMes();
	}
	
	public boolean igual(Reserva reserva) {
		if(this.mes == reserva.getMes() && this.hora == reserva.getHora() && this.dia == reserva.getDia() 
				&& this.ano == reserva.getAno()) {
			return true;
		}
		return false;
		
	}
}
