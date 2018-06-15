package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import controller.Produto;
import controller.Usuario;
import factory.ConnectionFactory;

public class ProdutoDao {
	
	private Connection conn;
	
	public ProdutoDao() throws SQLException {
		conn = ConnectionFactory.getConnection();
	}
	public void createTable() throws SQLException {
		String sql = "CREATE TABLE Produto ( "
				   + "prod_id 			serial PRIMARY KEY,"
				   + "nm_prod			varchar(30),"
				   + "preco_unitario	float8,"
				   + "qtd_prod			integer,"
				   + "tipo_prod_id		integer REFERENCES TipoProduto,"
				   + "prodUsuario_id	integer	REFERENCES Usuario"
				   + ");";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		ps.close();
	}
	public void insert(Produto p) throws SQLException {
		String sql = "INSERT INTO Produto (nm_prod, preco_unitario, qtd_prod, prodUsuario_id)"
				   + "VALUES (?,?,?,?);";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, p.getNm_produto());
		ps.setDouble(2, p.getPreco_uni());
		ps.setInt(3, p.getQtd_prod());
		ps.setInt(4, p.getQtd_prod());
		ps.setInt(5, p.getProdUsuario_id());
		ps.setInt(6, p.getTipoProduto_id());
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
