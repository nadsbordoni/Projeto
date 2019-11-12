
public abstract class Pessoa {
	private String nome;
	private String zipcode; // endereço
	private String telefone;

	Pessoa(String nome, String zipcode, String telefone) {
		this.nome = nome;
		this.zipcode = zipcode;
		this.telefone = telefone;
	}

	public String getNome() {
		return this.nome;
	}
	
	public String getZipcode() {
		return this.zipcode;
	}

	public String getTelefone() {
		return this.telefone;
	}
	public String getDocumento() {
		return null;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;

	}

	public boolean equals(PessoaFisica pessoa) {
		return false;
	}

	public boolean equals(PessoaJuridica pessoa) {
		return false;
	}
	


}
