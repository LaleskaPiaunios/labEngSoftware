package br.com.fatec.locadora.api.dao;

import java.util.List;

import br.com.fatec.locadora.api.entity.IdentificadorLocadora;

public interface IdentificadorLocadoraDAO {
	
	
	IdentificadorLocadora save(IdentificadorLocadora e);
	IdentificadorLocadora findBy(Long id);
	
	List<IdentificadorLocadora> findAll();
	
	IdentificadorLocadora update(IdentificadorLocadora e);
	IdentificadorLocadora delete(IdentificadorLocadora e);
	

}
