package br.com.fatec.locadora.test.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.fatec.locadora.api.dao.LocacaoDao;
import br.com.fatec.locadora.api.entity.Locacao;
import br.com.fatec.locadora.test.commons.LocadoraBaseTest;
import br.com.spektro.minispring.core.implfinder.ImplementationFinder;

public class LocacaoDAOTest extends LocadoraBaseTest{
	
	private LocacaoDao dao;

	@Before
	public void config() {
		this.dao = (LocacaoDao) ImplementationFinder.getinstance().getImpl(
				LocacaoDao.class);
	}

	@Test
	public void saveNewTest() {
		Locacao locacao = new Locacao();
		Locacao savedLocacao = this.dao.save(locacao);
		Assert.assertEquals(locacao, savedLocacao);
	}

	@Test
	public void updateTest() {

	}

	@Test
	public void findAllTest() {

	}

}
