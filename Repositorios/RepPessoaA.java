
public class RepPessoaA implements RepositorioPessoa {
	private Pessoa[] pessoa;
	private int indice;
	
	public RepPessoaA() {
		pessoa = new Pessoa[50];
		indice = 0;
	}
	@Override
	public void inserir(Pessoa pessoa) {
		
		
	}

	@Override
	public boolean procurar(String documento) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void atualizar(Pessoa pessoa, Pessoa mudar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}

}
