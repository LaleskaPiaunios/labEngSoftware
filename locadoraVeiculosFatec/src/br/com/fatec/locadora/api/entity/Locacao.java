package br.com.fatec.locadora.api.entity;

import java.sql.Date;

public class Locacao extends IdentificadorLocadora{
	
	private Date dataLoc;
	private Date dataDev;
	private Double kmInicial;
	private Double kmFinal;
	private Double valor;
	
	private Long cliente;
	private Long carro;
	
	
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
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Long getCliente() {
		return cliente;
	}
	public void setCliente(Long cliente) {
		this.cliente = cliente;
	}
	public Long getCarro() {
		return carro;
	}
	public void setCarro(Long carro) {
		this.carro = carro;
	}

}
