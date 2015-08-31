package br.com.fatec.locadora.api.entity;

public class Fabricante extends IdentificadorLocadora{
	
	private String nome;
	private String nacionalidade;
	
	public static String col_nome = "nome";
	public static String col_nacionalidade = "nacionalidade";
	public static String table_name = "LOC_FABRICANTE";
	
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
