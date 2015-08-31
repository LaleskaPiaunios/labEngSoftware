package br.com.fatec.locadora.api.dao;

import java.util.List;

import br.com.fatec.locadora.api.entity.Carro;

public interface CarroDAO {
	
	
	public Carro save(Carro e);
	
	public Carro findBy(Long id);
	
	public List<Carro> findAll();
	
	public Carro update(Carro e);
	
	public Boolean delete(Carro e);
	
	

}
