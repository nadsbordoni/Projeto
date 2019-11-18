package pacoteClassesDemanda;

import pacoteClassesPessoa.*;

public class Demanda {
	private String area;
	private String demanda;
	private String num_proc;

	Demanda(String area, String demanda, String num_proc) {
		this.area = area;
		this.demanda = demanda;
		this.num_proc = num_proc;
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

	public String getNum_proc() {
		return num_proc;
	}

	public void setNum_proc(String num_proc) {
		this.num_proc = num_proc;
	}

}
