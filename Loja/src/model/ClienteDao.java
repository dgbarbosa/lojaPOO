package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import controller.Cliente;
import factory.ConnectionFactory;

public class ClienteDao {
	private Connection conn;
	
	public ClienteDao() throws SQLException {
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
	public void insert(Cliente c) throws SQLException {
		String sql = "INSERT INTO Cliente (nome, cpf, endereco, clienteUsuario_id)"
				   + "VALUES (?,?,?,?);";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, c.getNome());
		ps.setInt(2, c.getCpf());
		ps.setString(2, c.getEndereco());
		ps.setInt(2, c.getClienteUsuario_id());
		ps.execute();
		ps.close();
	}
	public void deletarCliente(int id) throws SQLException {
		String sql = "DELETE from Cliente WHERE cliente_id=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ps.execute();
		ps.close();
	}
	
}
