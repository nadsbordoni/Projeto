package pacoteClassesPessoa;

public class PessoaFisica extends Pessoa { // a diferen�a entre as pessoas � o documento (pessoa fisica � cpf, pessoa juridica CNPJ);
	private String CPF;

	public PessoaFisica(String nome, String zipcode, String telefone, String CPF) {
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
