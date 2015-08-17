package br.com.fatec.locadora.api.dao;

import java.util.List;

import br.com.fatec.locadora.api.entity.Cliente;

public interface ClienteDAO {
	
	Cliente save(Cliente e);
	Cliente findBy(Long id);
	
	List<Cliente> findAll();
	
	Cliente update(Cliente e);
	Cliente delete(Cliente e);

}
