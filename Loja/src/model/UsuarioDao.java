package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import factory.ConnectionFactory;

public class UsuarioDao {

	private Connection conn;
	
	public UsuarioDao() throws SQLException {
		conn = ConnectionFactory.getConnection();
	}
	
	public void createUsuario() throws SQLException {
		String sql = "CREATE TABLE Usuario ( "
				   + "user_id			serial PRIMARY KEY,"
				   + "senha 			varchar(30),"
				   + "nome 				varchar(30),"
				   + "sobrenome 		varchar(30),"
				   + "cpf 				char(11)"
				   + ");";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		ps.close();
	}
	public void dropUsuario() throws SQLException {
		String sql = "DROP TABLE Usuario";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		ps.close();
	}
	
}
