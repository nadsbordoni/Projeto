package pacoteExcecoes;

public class EDException extends Exception {
	public EDException () {
		super ("A demanda já foi cadastrada.");
	}
}
