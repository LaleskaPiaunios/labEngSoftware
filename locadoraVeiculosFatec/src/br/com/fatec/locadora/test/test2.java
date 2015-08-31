package br.com.fatec.locadora.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.fatec.locadora.core.service.LiquibaseRunnerService;

public class test2 {

	@Test
	public void teste() {
		Connection c;
		try {
			c = DriverManager.getConnection("jdbc:hsqldb:mem:fatec", "SA", "");

			LiquibaseRunnerService.run();

			PreparedStatement stmt;

			stmt = c.prepareStatement("INSERT INTO LOC_ACESSORIO VALUES(?,?);");

			stmt.setLong(1, 10);

			stmt.setString(2, "travesseiro");

			stmt.execute();

			PreparedStatement select = c
					.prepareStatement("SELECT * FROM LOC_ACESSORIO");
			assertEquals("travesseiro", select);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
