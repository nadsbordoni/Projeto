package pacoteExcecoes;

public class RNCException extends Exception {
	public RNCException() {
		super("Reserva n�o cadastrada. Tente novamente");
	}
}
