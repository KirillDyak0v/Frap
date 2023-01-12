package com.example.frap1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class DatabaseConnection extends Config{
	Connection dbConnection;
	public Connection getDbConnection() 
			throws ClassNotFoundException, SQLException{
		String connectionString = "jdbc:mysql//" + dbHost + ":" + dbPort + ":" + dbName;
		
	Class.forName("com.mysql.jdbc.Driver");
	dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass );
	return dbConnection;
	}
}
