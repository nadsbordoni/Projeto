
public class PessoaJuridica extends Pessoa {
	private String CNPJ;

	PessoaJuridica(String nome, String zipcode, String telefone, String CNPJ) {
		super(nome, zipcode, telefone);
		this.CNPJ = CNPJ;
	}
	@Override
	public boolean equals(PessoaJuridica pessoa) {
		if (this.CNPJ == pessoa.CNPJ)
			return true;
		else
			return false;
		
	}
	@Override
	public String getDocumento() {
		return this.CNPJ;
	}
}
