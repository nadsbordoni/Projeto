package pacoteClassesReserva;

import pacoteClassesPessoa.Pessoa;

public class Reserva {
	private Pessoa pessoa; 
	private int hora;
	private int dia;
	private int mes;
	private int ano;

	Reserva(int hora, int dia, int mes, int ano, Pessoa pessoa) {
		this.hora = hora;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.pessoa = pessoa;
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

	public Pessoa getPessoa() { 
		return this.pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
	public boolean igual(Reserva reserva) {
		if(this.mes == reserva.getMes() && this.hora == reserva.getHora() && this.dia == reserva.getDia() 
				&& this.ano == reserva.getAno()) {
			return true;
		}
		return false;
		
	}
	
	public boolean igualCompleto(Reserva reserva) {
		if(this.mes == reserva.getMes() && this.hora == reserva.getHora() && this.dia == reserva.getDia() 
				&& this.ano == reserva.getAno() && this.pessoa.equals(reserva.pessoa)) {
			return true;
		}
		return false;
		
	}
	
	public boolean documentoIgual(Reserva reserva) {
		if(this.pessoa.getDocumento().equals(reserva.pessoa.getDocumento())) {
			return true;
		}
		return false;
	}
	
	public boolean horaOk(Reserva reserva) {
		boolean ok = false;
		if (hora >= 9 && hora <= 18) {
			ok = true;
		}
		return ok;
	}
	
	
}
