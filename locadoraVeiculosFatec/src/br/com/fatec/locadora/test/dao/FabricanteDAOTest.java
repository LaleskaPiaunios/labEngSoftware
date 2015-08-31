package br.com.fatec.locadora.test.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.fatec.locadora.api.dao.FabricanteDao;
import br.com.fatec.locadora.api.entity.Fabricante;
import br.com.spektro.minispring.core.implfinder.ImplementationFinder;

public class FabricanteDAOTest {
	
	private FabricanteDao dao;

	@Before
	public void config() {
		this.dao = (FabricanteDao) ImplementationFinder.getinstance().getImpl(
				FabricanteDao.class);
	}

	@Test
	public void saveNewTest() {
		Fabricante fabricante = new Fabricante();
		Fabricante savedFabricante = this.dao.save(fabricante);
		Assert.assertEquals(fabricante, savedFabricante);
	}

	@Test
	public void updateTest() {

	}

	@Test
	public void findAllTest() {

	}

}
