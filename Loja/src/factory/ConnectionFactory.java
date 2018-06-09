package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:postgresql://ec2-23-23-130-158.compute-1.amazonaws.com/ddkgokf80tmp8q?sslmode=require&user=vwqgclxfuhloqw&password=7fc9961709dc629dc0d6aee5ab6a84ebf71c66d18b18c11601aa951f9b502a8f");
	}	
}
