package pacoteExcecoes;

public class UIException extends Exception {
	public UIException() {
		super("Pessoa n�o cadastrada no sistema. Escolha a op��o de Cadastrar Pessoa em nosso site.");
	}

}
