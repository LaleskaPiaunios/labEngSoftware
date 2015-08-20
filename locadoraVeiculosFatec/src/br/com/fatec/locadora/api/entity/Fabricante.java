package br.com.fatec.locadora.api.entity;

public class Fabricante extends IdentificadorLocadora{
	
	private String nome;
	private String nacionalidade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}


}
