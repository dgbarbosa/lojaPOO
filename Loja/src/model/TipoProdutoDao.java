package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import factory.ConnectionFactory;

public class TipoProdutoDao {
	
	private Connection conn;
	
	public TipoProdutoDao() throws SQLException {
		conn = ConnectionFactory.getConnection();
	}

	public void createTable() throws SQLException {
		String sql = "CREATE TABLE Produto ( "
				   + "tipo_prod_id 		serial PRIMARY KEY,"
				   + "nm_tipo_prod		varchar(30),"
				   + "desc_tipo_prod	varchar(45)"
				   + ");";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		ps.close();
	}
	
}
