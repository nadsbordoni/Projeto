package pacoteClassesDemanda;

import pacoteClassesPessoa.*;

public class Demanda {
	private Pessoa pessoa;
	private String area;
	private String demanda;

	Demanda(Pessoa pessoa, String area, String demanda) {
		this.pessoa = pessoa;
		this.area = area;
		this.demanda = demanda;

	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getDemanda() {
		return demanda;
	}

	public void setDemanda(String demanda) {
		this.demanda = demanda;
	}

	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public boolean igual(Demanda demanda) {
		if (this.pessoa == demanda.pessoa) {
			return true;
		} else {
			return false;
		}
	}

}
