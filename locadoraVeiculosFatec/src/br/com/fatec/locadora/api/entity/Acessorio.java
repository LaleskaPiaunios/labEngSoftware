package br.com.fatec.locadora.api.entity;

public class Acessorio extends IdentificadorLocadora {
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public static String TABLE_ACESSORIO;
	public static String COL_NOME;
	

}
