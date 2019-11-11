
public class RepPessoaA implements RepositorioPessoa {
	private Pessoa[] pessoaArray;
	private int indice;
	
	public RepPessoaA() {
		pessoaArray = new Pessoa[100];
		indice = 0;
	}
	@Override
	public void inserir(Pessoa pessoa) {
		if (!this.procurar(pessoa.getDocumento()) && this.indice < this.pessoaArray.length) {
			// se a pessoa nao existe, insere
			this.pessoaArray[indice] = pessoa;
			this.indice++;
		} else if (this.indice >= this.pessoaArray.length) {//caso a array seja pequena 
		//exceção pra array pequena
		} else {
			//EXISTE PESSOA, EXCEÇÃO pra pessoa ja cadastrada
		}
		
	}

	@Override
	public boolean procurar(String documento) {
		boolean resposta = false;
		for (int a = 0; a < indice && !resposta; a++) {
			if (this.pessoaArray[a].getDocumento().equals(documento)) {
				resposta = true;
		}
		}
		return resposta;
	}

	@Override
	public void atualizar(Pessoa pessoa, Pessoa mudar) {
		boolean lala = pessoa.equals(pessoa);
		
		if (lala) {
			int a = this.indice(pessoa.getDocumento());
			this.pessoaArray[a] = mudar;
		}
		
	}

	@Override
	public void remover(Pessoa pessoa) {
		int tem = this.indice(pessoa.getDocumento());
		
		for (int c = tem; c < indice; c++) {
			
			this.pessoaArray[c] = this.pessoaArray[c+1];
		}
		
		
	}
	
	public int indice (String documento) {
		int ind = 0;
		boolean tem = false;
		for (int b = 0; b < indice && !tem; b++) {
			if (this.pessoaArray[b].getDocumento().equals(documento)) {
				tem = true;
				ind = b;
			}
		}
		if (!tem) {
			//exceção que nao tem o documento 
		}

		return ind;
	}

}
