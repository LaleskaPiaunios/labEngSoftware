package br.com.fatec.locadora.test.commons;

import org.junit.After;
import org.junit.BeforeClass;

import br.com.fatec.locadora.core.service.LiquibaseRunnerService;
import br.com.spektro.minispring.core.dbmapper.ConfigDBMapper;
import br.com.spektro.minispring.core.implfinder.ContextSpecifier;

public class LocadoraBaseTest {
	
	@BeforeClass
	public void setUp(){
		ContextSpecifier.getInstance().setContext("br.com.fatec.locadora.core");
		ConfigDBMapper.getInstance().setDefaultConnectionName("test");
		LiquibaseRunnerService.run();
	}
	
	@After
	public void setDown(){
		
	}

}
