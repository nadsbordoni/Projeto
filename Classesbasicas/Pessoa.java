import java.util.*;
public abstract class Pessoa {
	private String nome;
	private String documento;
	private String zipcode; // endereço 
	private String telefone;

	Pessoa (String nome, String documento, String zipcode, String telefone) {
		this.nome = nome;
		this.documento = documento;
		this.zipcode = zipcode;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getDocumento() {
		return this.documento;
	}
	
	public String getZipcode() {
		return this.zipcode;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setNome() {
		this.nome = nome;
	}
	
	public void setDocumento() {
		this.documento = documento;
	}
	
	public void setZipcode() {
		this.zipcode = zipcode;
	}
	
	public void setTelefone() {
		this.telefone = telefone;
	}
	}
