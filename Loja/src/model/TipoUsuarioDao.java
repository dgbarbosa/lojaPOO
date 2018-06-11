package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import factory.ConnectionFactory;

public class TipoUsuarioDao {
	
	private Connection conn;
	
	public TipoUsuarioDao() throws SQLException {
		conn = ConnectionFactory.getConnection();
	}
	
	public void createTable() throws SQLException {
		String sql = "CREATE TABLE TipoUsuario( "
				   + "tp_user_id 		serial PRIMARY KEY,"
				   + "nm_permissao		varchar(30),"
				   + "desc_perm			varchar(45)"
				   + ");";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		ps.close();
	}
	public void drop() throws SQLException {
		String sql = "DROP TABLE TipoUsuario";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		ps.close();
	}
	public void insert(String nm, String desc) throws SQLException {
		String sql = "INSERT INTO TipoUsuario (nm_permissao, desc_perm)"
				   + "VALUES (?,?);";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, nm);
		ps.setString(2, desc);
		ps.execute();
		ps.close();
	}
}
