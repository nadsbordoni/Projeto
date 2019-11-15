package pacoteClassesReserva;

import pacoteClassesPessoa.RepositorioPessoa;
import pacoteClassesPessoa.RepPessoaL;

public class Reserva {
	private RepositorioPessoa pessoa;  //duvida
	private int hora;
	private int dia;
	private int mes;
	private int ano;

	Reserva(int hora, int dia, int mes, int ano) {
		this.hora = hora;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.pessoa = new RepPessoaL(); //duvida
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

}
