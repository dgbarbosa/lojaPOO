package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	public void alterarNomeCliente(int id, String nome) throws SQLException {
		String sql = "UPDATE Cliente SET nome=? WHERE user_id=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, nome);
		ps.setInt(2, id);
		ps.execute();
		ps.close();
	}
	public Cliente listarUmCliente(int id) throws SQLException {
		String sql = "SELECT * from Cliente WHERE user_id=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		ps.close();
		return new Cliente(rs.getInt("cliente_id"),
				rs.getString("nome"),
				rs.getInt("cpf"),
				rs.getString("endereco"),
				rs.getInt("clienteUsuario_id")
				);
	}
	
	public void listar() throws SQLException {
		String sql = "SELECT * from Cliente;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getObject("id"));
			System.out.println(rs.getObject("nome"));
			System.out.println(rs.getObject("cpf"));
			System.out.println(rs.getObject("endereco"));
			System.out.println(rs.getObject("clienteUsuario_id"));
		}
		ps.close();
	}
	
	public void fechar() throws SQLException {
		conn.close();
	}
	
}
