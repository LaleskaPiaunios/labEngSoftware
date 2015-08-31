package br.com.fatec.locadora.api.dao;

import java.util.List;

import br.com.fatec.locadora.api.entity.Fabricante;

public interface FabricanteDAO {
	
	public Fabricante save(Fabricante e);
	
	public Fabricante findBy(Long id);
	
	public List<Fabricante> findAll();
	
	public Fabricante update(Fabricante e);
	
	public Boolean delete(Fabricante e);
	

}
