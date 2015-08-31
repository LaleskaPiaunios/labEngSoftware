package br.com.fatec.locadora.api.dao;

import java.util.List;

import br.com.fatec.locadora.api.entity.Cliente;

public interface ClienteDAO {
	
	public Cliente save(Cliente e);
	
	public Cliente findBy(Long id);
	
	public List<Cliente> findAll();
	
	public Cliente update(Cliente e);
	
	public Boolean delete(Cliente e);

}
