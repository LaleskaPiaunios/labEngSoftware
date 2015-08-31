package br.com.fatec.locadora.api.dao;


import java.util.List;

import br.com.fatec.locadora.api.entity.Acessorio;

public interface AcessorioDAO {
	
	public Acessorio save(Acessorio e);
	
	public Acessorio findBy(Long id);
	
	public List<Acessorio> findAll();
	
	public Acessorio update(Acessorio e);
	
	public Boolean delete(Acessorio e);
	
	

}
