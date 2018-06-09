package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import factory.ConnectionFactory;

public class VendaDao {
	private Connection conn;
	
	public VendaDao() throws SQLException {
		conn = ConnectionFactory.getConnection();
	}
	public void createVenda() throws SQLException {
		String sql = "CREATE TABLE Venda( "
				   + "venda_id			serial PRIMARY KEY,"
				   + "qtd 				integer,"
				   + "vendaCliente_id	integer REFERENCES Cliente,"
				   + "vendaProd_id		integer REFERENCES Produto,"
				   + "vendaUsuario_id	integer	REFERENCES Usuario"
				   + ");";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		ps.close();
	}
	public void dropVenda() throws SQLException {
		String sql = "DROP TABLE Venda";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		ps.close();
	}
}
