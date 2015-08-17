package br.com.fatec.locadora.api.dao;

import java.util.List;

import br.com.fatec.locadora.api.entity.Locacao;

public interface LocacaoDAO {
	
	
	Locacao save(Locacao e);
	Locacao findBy(Long id);
	
	List<Locacao> findAll();
	
	Locacao update(Locacao e);
	Locacao delete(Locacao e);
	

}
