
public class RepPessoaL implements RepositorioPessoa {

	private Pessoa pessoa;
	private RepPessoaL proximo;


	public RepPessoaL() {
		this.pessoa = null;
		this.proximo = null;
	}
	@Override
	public void inserir(Pessoa pessoa) {
		//exce��o quando tentar inserir
		
		if (this.proximo == null) {
			this.pessoa = pessoa;
			this.proximo = new RepPessoaL();
		} else {
			this.proximo.inserir(pessoa);
		}
	}

	@Override
	public boolean procurar(String documento) {
		boolean resposta = false;
		if (this.pessoa.getDocumento().equals(documento)) {
			resposta = true;
		} else if (this.proximo != null) {
			resposta = this.proximo.procurar(documento);
		} else {
			resposta = false;
			// exce��o de que n�o tem o usu�rio e tem que cadastrar
		}
		return resposta;

	}

	@Override
	public void atualizar(Pessoa pessoa, Pessoa mudar) {
		// ver se a lista ta vazia --> erro
		if (this.pessoa.equals(pessoa))
			// tem que criar uma pessoa
			this.pessoa = mudar;

		// exce��o se nao tiver aquele documento
		// exce��o se nao tiver a pessoa
	}

	@Override
	public void remover(Pessoa pessoa) {
		if (this.pessoa.getDocumento().equals(pessoa.getDocumento())) {
			this.pessoa = this.proximo.pessoa;
			this.proximo = this.proximo.proximo;
		} else if (this.proximo != null) {
			this.proximo.remover(pessoa);
		} else {
			// n�o existe usuario, tem que cadastrar
		}

	}
	


}

