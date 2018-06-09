package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controller.Usuario;
import factory.ConnectionFactory;

public class UsuarioDao {

	private Connection conn;
	
	public UsuarioDao() throws SQLException {
		conn = ConnectionFactory.getConnection();
	}
	
	public void createTable() throws SQLException {
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
	public void drop() throws SQLException {
		String sql = "DROP TABLE Usuario";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		ps.close();
	}

	public void insert(Usuario u) throws SQLException {
		String sql = "INSERT INTO Usuario (senha, nome, sobrenome, cpf)"
				   + "VALUES (?,?,?,?);";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, u.getSenha());
		ps.setString(2, u.getNome());
		ps.setString(3, u.getSobrenome());
		ps.setInt(4, u.getCpf());
		ps.execute();
		ps.close();
	}
	public void delete(int id) throws SQLException {
		String sql = "DELETE from Usuario WHERE user_id=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ps.execute();
		ps.close();
	}
	public void updateNome(int id, String nome) throws SQLException {
		String sql = "UPDATE Cliente SET nome=? WHERE user_id=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, nome);
		ps.setInt(2, id);
		ps.execute();
		ps.close();
	}
	public Usuario select(int id) throws SQLException {
		String sql = "SELECT user_id, nome, sobrenome, cpf from Usuario WHERE user_id=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		ps.close();
		return new Usuario(
				rs.getInt("user_id"),
				rs.getString("nome"),
				rs.getString("sobrenome"),
				rs.getInt("cpf")
				);
	}
	
	public void select() throws SQLException {
		String sql = "SELECT user_id, nome, sobrenome, cpf from Usuario;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt("user_id"));
			System.out.println(rs.getString("nome"));
			System.out.println(rs.getString("sobrenome"));
			System.out.println(rs.getInt("cpf"));
		}
		ps.close();
	}
	
	public void fechar() throws SQLException {
		conn.close();
	}
	
}
