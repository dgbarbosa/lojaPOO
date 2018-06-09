package view;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.ClienteDao;
import model.ProdutoDao;
import model.UsuarioDao;
import model.VendaDao;

public class TelaUsuario {

public static void main(String[] args) throws SQLException {
	UsuarioDao	umodel = new UsuarioDao();
	ProdutoDao	pmodel = new ProdutoDao();
	ClienteDao	cmodel = new ClienteDao();	
	VendaDao	vmodel = new VendaDao();
	
	umodel.createTable();
	pmodel.createProduto();
	cmodel.createTable();
	vmodel.createVenda();
	System.out.println("Sucesso");
}
}
