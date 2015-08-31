package br.com.fatec.locadora.core;

import java.sql.Connection;
import java.sql.DriverManager;

import liquibase.Liquibase;
import liquibase.database.Database;
import liquibase.database.DatabaseFactory;
import liquibase.database.jvm.JdbcConnection;
import liquibase.resource.ClassLoaderResourceAccessor;

/**
 * @author carlosolr
 * 
 * @version 1.0.0
 */
public class LiquibaseRunnerService {

	public static void run() {
		Connection conn;
		try {
			conn = DriverManager.getConnection("jdbc:hsqldb:mem:fatec", "SA", "");

			Database database = DatabaseFactory.getInstance().findCorrectDatabaseImplementation(
					new JdbcConnection(conn));
			Liquibase liquibase = new Liquibase("br/com/fatec/locadora/liquibase/changelog-master.xml",
					new ClassLoaderResourceAccessor(), database);
			liquibase.forceReleaseLocks();
			liquibase.update("fatec");
			conn.close();
		} catch (Exception e) {
			throw new RuntimeException("Erro na execução do Liquibase", e);
		}
	}
}
