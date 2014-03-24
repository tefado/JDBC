package it.uniroma3.dia.db1.jdbc.persistence;

import java.sql.*;

public class DataSource {
	private String dbURI = "jdbc:postgresql://localhost:5431/university";
	private String user = "postgres";
	private String password = "siw";
	//modificare la porta se se ne usa un'altra
	//commento 2
	//saluti da davide


	public Connection getConnection()  {
		Connection connection = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(dbURI,user, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
}
