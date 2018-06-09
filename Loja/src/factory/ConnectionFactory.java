package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(
				   "jdbc:postgresql:ec2-23-21-129-50.compute-1.amazonaws.com:5432"
				  ,"nexwwbukiiuymx"
				  , "9df1b7ba03ebee67fa172d27192037664ad6991c78a6af4f3eef4f53f0d15e9e");
	}	
}
