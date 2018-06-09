package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import factory.ConnectionFactory;

public class Usuario {

	private Connection conn;
	
	public Usuario() throws SQLException {
		conn = ConnectionFactory.getConnection();
	}
	
	public void createUsuario() throws SQLException {
		String sql = "CREATE TABLE Usuario ( "
				   + "id serial CONSTRAINT key PRIMARY KEY,"
				   + "senha varchar(30),"
				   + "nome varchar(30),"
				   + "sobrenome varchar(30),"
				   + "cpf char(11)"
				   + ");";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		ps.close();
	}
	
}
