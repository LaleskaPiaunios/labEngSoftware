package br.com.fatec.locadora.api.entity;

import java.sql.Date;

public class Locacao extends IdentificadorLocadora{
	
	private Date dataLoc;
	private Date dataDev;
	private Double kmInicial;
	private Double kmFinal;
	private String cliente;
	private Long valor;
	private Long carro;
	
	
	public static String col_data_locacao = "dataLoc";
	public static String col_data_devolucao = "dataDev";
	public static String col_km_inicial = "kmInicial";
	public static String col_km_final = "kmFinal";
	public static String col_cliente = "cliente";
	public static String col_valor = "valor";
	public static String col_carro = "carro";
	
	public static String table_name = "LOC_LOCACAO";
	
	
	public Date getDataLoc() {
		return dataLoc;
	}
	public void setDataLoc(Date dataLoc) {
		this.dataLoc = dataLoc;
	}
	public Double getKmInicial() {
		return kmInicial;
	}
	public void setKmInicial(Double kmInicial) {
		this.kmInicial = kmInicial;
	}
	public Date getDataDev() {
		return dataDev;
	}
	public void setDataDev(Date dataDev) {
		this.dataDev = dataDev;
	}
	public Double getKmFinal() {
		return kmFinal;
	}
	public void setKmFinal(Double kmFinal) {
		this.kmFinal = kmFinal;
	}
	public Long getValor() {
		return valor;
	}
	public void setValor(Long valor) {
		this.valor = valor;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public Long getCarro() {
		return carro;
	}
	public void setCarro(Long carro) {
		this.carro = carro;
	}

}
