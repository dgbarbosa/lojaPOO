package view;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Cliente;
import model.Produto;
import model.Usuario;
import model.Venda;

public class TelaUsuario {

public static void main(String[] args) throws SQLException {
	Usuario umodel = new Usuario();
	Produto pmodel = new Produto();
	Cliente cmodel = new Cliente();	
	Venda	vmodel = new Venda();
	
//	umodel.createUsuario();
//	pmodel.createProduto();
//	cmodel.createCliente();
//	vmodel.createVenda();
	System.out.println("Sucesso");
}
}
