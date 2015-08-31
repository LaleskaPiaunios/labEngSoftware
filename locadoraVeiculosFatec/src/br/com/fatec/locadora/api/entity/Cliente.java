package br.com.fatec.locadora.api.entity;

public class Cliente extends IdentificadorLocadora{
	
	private String nome;
	private Integer cpf;
	private Integer rg;
	private String telefone;
	private String endereco;
	
	public static String col_nome = "nome";
	public static String col_cpf = "cpf";
	public static String col_rg = "rg";
	public static String col_telefone = "telefone";
	public static String col_endereco = "endereco";
	public static String table_name = "LOC_CLIENTE";
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	public Integer getRg() {
		return rg;
	}
	public void setRg(Integer rg) {
		this.rg = rg;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	

}
