public class Reserva {
	private int hora;
	private int dia;
	private int mes;

	Reserva (int hora, int dia, int mes) {
		this.hora = hora;
		this.dia = dia;
		this.mes = mes;
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
	
	public void setHora() {
		this.hora = hora;
	}
	
	public void setDia() {
		this.dia = dia;
	}
	
	public void setMes() {
		this.mes = mes;
	}
	
	}
