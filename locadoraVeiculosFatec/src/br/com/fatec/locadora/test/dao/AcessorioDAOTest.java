package br.com.fatec.locadora.test.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.fatec.locadora.api.dao.AcessorioDao;
import br.com.fatec.locadora.api.entity.Acessorio;
import br.com.fatec.locadora.test.commons.LocadoraBaseTest;
import br.com.spektro.minispring.core.implfinder.ImplementationFinder;

public class AcessorioDAOTest extends LocadoraBaseTest{
	
	private AcessorioDao dao;
	
	@Before
	public void config() {
		this.dao = (AcessorioDao) ImplementationFinder.getinstance().getImpl(AcessorioDao.class);
	}
	
	@Test
	public void saveNewTest(){
		Acessorio acessorio = new Acessorio();
		Acessorio savedAcessorio = this.dao.save(acessorio);
		Assert.assertEquals(acessorio, savedAcessorio);
	}
	
	@Test
	public void updateTest(){
		
	}
	
	@Test
	public void findAllTest(){
		
	}
	
	
}
