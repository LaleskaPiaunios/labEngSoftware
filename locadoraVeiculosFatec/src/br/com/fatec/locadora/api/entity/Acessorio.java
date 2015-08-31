package br.com.fatec.locadora.api.entity;

public class Acessorio extends IdentificadorLocadora {
	
	private String nome;
	public static String col_Nome = "nome";
	public static String table_name = "LOC_ACESSORIO";

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
