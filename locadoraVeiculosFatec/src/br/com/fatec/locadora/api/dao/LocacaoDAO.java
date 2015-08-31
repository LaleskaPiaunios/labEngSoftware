package br.com.fatec.locadora.api.dao;

import java.util.List;

import br.com.fatec.locadora.api.entity.Locacao;

public interface LocacaoDAO {
	
	
	public Locacao save(Locacao e);
	
	public Locacao findBy(Long id);
	
	public List<Locacao> findAll();
	
	public Locacao update(Locacao e);
	
	public Boolean delete(Locacao e);
	

}
