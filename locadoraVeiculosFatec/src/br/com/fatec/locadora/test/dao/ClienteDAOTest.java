package br.com.fatec.locadora.test.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.fatec.locadora.api.dao.ClienteDao;
import br.com.fatec.locadora.api.entity.Cliente;
import br.com.fatec.locadora.test.commons.LocadoraBaseTest;
import br.com.spektro.minispring.core.implfinder.ImplementationFinder;


public class ClienteDAOTest extends LocadoraBaseTest{
	
	private ClienteDao dao;

	@Before
	public void config() {
		this.dao = (ClienteDao) ImplementationFinder.getinstance().getImpl(
				ClienteDao.class);
	}

	@Test
	public void saveNewTest() {
		Cliente cliente = new Cliente();
		Cliente savedCliente = this.dao.save(cliente);
		Assert.assertEquals(cliente, savedCliente);
	}

	@Test
	public void updateTest() {

	}

	@Test
	public void findAllTest() {

	}

}
