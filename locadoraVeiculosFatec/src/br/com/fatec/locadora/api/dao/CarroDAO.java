package br.com.fatec.locadora.api.dao;

import java.util.List;

import br.com.fatec.locadora.api.entity.Carro;

public interface CarroDAO {
	
	
	Carro save(Carro e);
	Carro findBy(Long id);
	
	List<Carro> findAll();
	
	Carro update(Carro e);
	Carro delete(Carro e);
	
	

}
