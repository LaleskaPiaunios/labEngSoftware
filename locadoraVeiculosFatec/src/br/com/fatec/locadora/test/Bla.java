package br.com.fatec.locadora.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import br.com.fatec.locadora.core.service.LiquibaseRunnerService;

public class Bla {

	@Test
	public void bla() {

		try {
			Connection c = DriverManager.getConnection("jdbc:hsqldb:mem:fatec",
					"SA", "");

			LiquibaseRunnerService.run();

			PreparedStatement stmt =
			c.prepareStatement("INSERT INTO LOC_ACESSORIO VALUES(?,?);");
			stmt.setLong(1, 10);
			stmt.setString(2, "travesseiro");

			stmt.execute();
			PreparedStatement select = c
					.prepareStatement("SELECT * FROM LOC_ACESSORIO");
			ResultSet resultSet = select.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getString("NOME"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
