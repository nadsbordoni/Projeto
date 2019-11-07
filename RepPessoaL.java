
public class RepPessoaL implements RepositorioPessoa {
		Pessoa pessoa;
		RepPessoaL proximo;
	@Override
	public void inserir (Pessoa pessoa) {
		if (this.proximo == null) {
			this.pessoa = pessoa;
			this.proximo = new RepPessoaL();
		} else {
			this.proximo.inserir(pessoa);
		}
		
	}

	@Override
	public void procurar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover() {
		// TODO Auto-generated method stub
		
	}

}

