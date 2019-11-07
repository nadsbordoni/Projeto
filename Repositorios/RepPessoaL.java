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
	public boolean procurar(String documento) {
		boolean resposta = false;
		if (this.pessoa.getDocumento().equals(documento)) {
			resposta = true;
		} else if (this.proximo != null) {
			resposta = this.proximo.procurar(documento);
		} else {
			resposta =  false;
			//exce��o de que n�o tem o usu�rio e tem que cadastrar 
		}
		return resposta;
		
	}

	@Override
	public void atualizar(Pessoa pessoa , String documento) {
		if (this.pessoa.getDocumento().equals(pessoa.getDocumento())){
			//set
			//pesquisar como fazer um atualizar (preciso atualizar nome?)
		}
		//exce��o se nao tiver aquele documento 
	}

	@Override
	public void remover(Pessoa pessoa) {
		if (this.pessoa.getDocumento().equals(pessoa.getDocumento())) {
			this.pessoa = this.proximo.pessoa;
			this.proximo = this.proximo.proximo;
		} else if (this.proximo != null) {
			this.proximo.remover(pessoa);
		} else {
			//n�o existe usuario, tem que cadastrar 
		}
		
	}

}

