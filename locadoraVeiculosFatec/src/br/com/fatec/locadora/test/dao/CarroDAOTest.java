package br.com.fatec.locadora.test.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.fatec.locadora.api.dao.CarroDao;
import br.com.fatec.locadora.api.entity.Carro;
import br.com.fatec.locadora.test.commons.LocadoraBaseTest;
import br.com.spektro.minispring.core.implfinder.ImplementationFinder;



public class CarroDAOTest extends LocadoraBaseTest {
	private CarroDao dao;

	@Before
	public void config() {
		this.dao = (CarroDao) ImplementationFinder.getinstance().getImpl(
				CarroDao.class);
	}

	@Test
	public void saveNewTest() {
		Carro carro = new Carro();
		Carro savedCarro = this.dao.save(carro);
		Assert.assertEquals(carro, savedCarro);
	}

	@Test
	public void updateTest() {

	}

	@Test
	public void findAllTest() {

	}

}
