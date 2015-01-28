package br.com.henriqueluz.enumeration;

public enum Sexo {

	MASCULINO("M", "Masculino"),
	FEMININO("F", "Feminino");
	
	private String codigo;
	private String tipo;
	
	private Sexo(String codigo, String tipo) {
		this.codigo = codigo;
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return this.tipo;
	}
	
	public String getCodigo() {
		return codigo;
	}
}
