
public interface RepositorioPessoa {

	public void inserir(Pessoa pessoa) throws UFException;

	public boolean procurar(String documento);

	public void atualizar(Pessoa pessoa, Pessoa mudar);

	public void remover(Pessoa pessoa);

}
