
public interface RepositorioPessoa {
		public void inserir(Pessoa pessoa);
		boolean procurar(String documento);
		public void atualizar(Pessoa pessoa, String documento);
		// tenho que fazer um atualizar pra cada? ou um só pra todos?
		
		public void remover(Pessoa pessoa);
		
}
