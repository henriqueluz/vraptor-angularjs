package br.com.henriqueluz.entity;

import java.time.LocalDate;

public class Cachorro {

	private String nome;
	private String cor;
	private LocalDate dataDeNascimento;
	private Double peso;
	private Double tamanho;
	private Raca raca;
	private Canil canil;

	public Cachorro(String nome, String cor, Raca raca, Canil canil) {
		this.nome = nome;
		this.cor = cor;
		this.raca = raca;
		this.canil = canil;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getTamanho() {
		return tamanho;
	}

	public void setTamanho(Double tamanho) {
		this.tamanho = tamanho;
	}

	public Raca getRaca() {
		return raca;
	}

	public void setRaca(Raca raca) {
		this.raca = raca;
	}

	public Canil getCanil() {
		return canil;
	}

	public void setCanil(Canil canil) {
		this.canil = canil;
	}

}
