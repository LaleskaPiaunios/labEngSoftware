package br.com.fatec.locadora.api.dao;


import java.util.List;

import br.com.fatec.locadora.api.entity.Acessorio;

public interface AcessorioDAO {
	
	Acessorio save(Acessorio e);
	Acessorio findBy(Long id);
	
	List<Acessorio> findAll();
	
	Acessorio update(Acessorio e);
	Acessorio delete(Acessorio e);
	
	

}
