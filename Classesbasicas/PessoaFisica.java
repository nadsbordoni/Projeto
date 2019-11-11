
public class PessoaFisica extends Pessoa {
	private String CPF;

	PessoaFisica(String nome, String zipcode, String telefone, String CPF) {
		super(nome, zipcode, telefone, CPF);
		this.CPF = CPF;

	}
	@Override
	public boolean equals(PessoaFisica pessoa) {
		if (this.CPF == pessoa.CPF)
			return true;
		else
			return false;
	}
	@Override
	public String getDocumento() {
		return this.CPF;
	}

}
