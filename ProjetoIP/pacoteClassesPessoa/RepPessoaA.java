package pacoteClassesPessoa;

public class RepPessoaA implements RepositorioPessoa {
	private Pessoa[] pessoaArray;
	private int indice;
	
	public RepPessoaA() {
		pessoaArray = new Pessoa[100];
		indice = 0;
	}
	@Override
	public void inserir(Pessoa pessoa) throws UFException, ACException {
		if (!this.existe(pessoa.getDocumento()) && this.indice < this.pessoaArray.length) { // se a pessoa nao existe, insere
			this.pessoaArray[indice] = pessoa;
			this.indice++;
		} else if (this.indice >= this.pessoaArray.length) {// caso array seja pequena 
			throw new ACException();
		} else {
			throw new UFException();
		}
		
	}

	@Override
	public boolean existe(String documento) {
		boolean resposta = false;
		for (int a = 0; a < indice && !resposta; a++) {
			if (this.pessoaArray[a].getDocumento().equals(documento)) {
				resposta = true;
		}
		}
		return resposta;
	}

	@Override
	public void atualizar(Pessoa pessoa, Pessoa mudar) throws UIException {
		boolean lala = pessoa.equals(pessoa);
		
		if (lala) {
			int a = this.indice(pessoa.getDocumento());
			this.pessoaArray[a] = mudar;
		} else {
			throw new UIException();
		}
		
	}

	@Override
	public void remover(Pessoa pessoa) throws UIException {
		int remove = this.indice(pessoa.getDocumento());
		
		if (remove >= 0) { //mudar porque eu vou usar procurar pessoa, entao esse remove nao usa 
		for (int c = remove; c < indice; c++) {
			
			this.pessoaArray[c] = this.pessoaArray[c+1];// ver se isso funciona, porque é null no meio 
		}
		} else {
			throw new UIException();
		}
		
		
	}
	
	public int indice (String documento) throws UIException{
		int ind = 0;
		boolean tem = false;
		for (int b = 0; b < indice && !tem; b++) {
			if (this.pessoaArray[b].getDocumento().equals(documento)) {
				tem = true;
				ind = b;
			}
		}
		if (!tem) { // ver se isso ta certo
			throw new UIException();
		}

		return ind;
	}
	
	public Pessoa procurarPessoa (String documento) throws UIException {
		//caso der problema, checar se existe 
		int indice2 = this.indice(documento);
		return this.pessoaArray[indice];
	} // pensar em casa 

}
