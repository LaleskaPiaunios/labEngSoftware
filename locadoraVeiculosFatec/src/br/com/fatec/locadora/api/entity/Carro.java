package br.com.fatec.locadora.api.entity;

public class Carro {
	
	private String modelo;
	private String placa;
	private String cor;
	private Integer anoModelo;
	private Integer anoFabricaco;
	
	private Long fabricante;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}

	public Integer getAnoFabricaco() {
		return anoFabricaco;
	}

	public void setAnoFabricaco(Integer anoFabricaco) {
		this.anoFabricaco = anoFabricaco;
	}

	public Long getFabricante() {
		return fabricante;
	}

	public void setFabricante(Long fabricante) {
		this.fabricante = fabricante;
	}
	

}