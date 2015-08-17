package br.com.fatec.locadora.api.dao;

import java.util.List;

import br.com.fatec.locadora.api.entity.Fabricante;

public interface FabricanteDAO {
	
	Fabricante save(Fabricante e);
	Fabricante findBy(Long id);
	
	List<Fabricante> findAll();
	
	Fabricante update(Fabricante e);
	Fabricante delete(Fabricante e);
	

}
