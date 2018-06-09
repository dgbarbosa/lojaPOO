package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import factory.ConnectionFactory;

public class Cliente {
	private Connection conn;
	
	public Cliente() throws SQLException {
		conn = ConnectionFactory.getConnection();
	}
	public void createCliente() throws SQLException {
		String sql = "CREATE TABLE Cliente( "
				   + "cliente_id 		serial PRIMARY KEY,"
				   + "nome 				varchar(45),"
				   + "cpf				char(11),"
				   + "endereco			varchar(45),"
				   + "clienteUsuario_id	integer	REFERENCES Usuario"
				   + ");";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		ps.close();
	}
	public void dropCliente() throws SQLException {
		String sql = "DROP TABLE Cliente";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		ps.close();
	}
}
