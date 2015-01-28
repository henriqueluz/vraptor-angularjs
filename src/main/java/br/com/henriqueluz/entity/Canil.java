package br.com.henriqueluz.entity;

public class Canil {

	private String afixo;
	private String responsavel;

	public Canil(String afixo, String responsavel) {
		this.afixo = afixo;
		this.responsavel = responsavel;
	}
	
	public String getAfixo() {
		return afixo;
	}

	public void setAfixo(String afixo) {
		this.afixo = afixo;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

}
