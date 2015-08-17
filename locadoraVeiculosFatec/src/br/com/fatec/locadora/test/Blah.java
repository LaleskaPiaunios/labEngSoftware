package br.com.fatec.locadora.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.junit.Test;

import br.com.fatec.locadora.core.LiquibaseRunnerService;

public class Blah {

/*	@Test
	public void test() {
		LiquibaseRunnerService.run();
	}*/
	
	@Test
	public void testeConnection(){
		Connection conn = null;
		
		try {
			LiquibaseRunnerService.run();
			
			conn = DriverManager.getConnection("jdbc:hsqldb:mem:fatec", "SA", "");

			PreparedStatement stmt = conn.prepareStatement("insert into LOC_ACESSORIO values (?,?);");
	
			stmt.setLong(1, 10);
			stmt.setString(2, "Roda de liga leve");
			
			stmt.executeQuery();
			stmt.execute();
			
		} catch (Exception e) {
			throw new RuntimeException("Erro na execução do Liquibase", e);
		}
	}

}
