package pacoteExcecoes;

public class EDException extends Exception {
	public EDException () {
		super ("Esta demanda j� foi cadastrada junto � esse documento, verifique sua reserva.");
	}
}
