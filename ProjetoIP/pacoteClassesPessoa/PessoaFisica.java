package pacoteClassesPessoa;

public class PessoaFisica extends Pessoa {
	private String CPF;

	PessoaFisica(String nome, String zipcode, String telefone, String CPF) {
		super(nome, zipcode, telefone);
		this.CPF = CPF;

	}

	@Override
	public boolean igual(Pessoa pessoa) {
		PessoaFisica p = (PessoaFisica) pessoa;
		if (this.CPF.equals(p.CPF))
			return true;
		else
			return false;
	}

	@Override
	public String getDocumento() {
		return this.CPF;
	}

}
