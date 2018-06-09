package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import factory.ConnectionFactory;

public class ProdutoDao {
	
	private Connection conn;
	
	public ProdutoDao() throws SQLException {
		conn = ConnectionFactory.getConnection();
	}
	public void createProduto() throws SQLException {
		String sql = "CREATE TABLE Produto ( "
				   + "prod_id 			serial PRIMARY KEY,"
				   + "nome 				varchar(30),"
				   + "preco_unitario	float8,"
				   + "qtd 				integer,"
				   + "prodUsuario_id	integer	REFERENCES Usuario"
				   + ");";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		ps.close();
	}
	public void dropProduto() throws SQLException {
		String sql = "DROP TABLE Produto";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		ps.close();
	}
}
