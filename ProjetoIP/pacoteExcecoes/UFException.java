package pacoteExcecoes;

public class UFException extends Exception {
	public UFException() {
		super("Este documento j� existe no sistema, favor tentar novamente.");
	}
}
