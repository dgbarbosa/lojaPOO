package view;

import java.sql.SQLException;

import controller.Administrador;
import model.ClienteDao;
import model.ProdutoDao;
import model.TipoUsuarioDao;
import model.UsuarioDao;
import model.VendaDao;

public class TelaUsuario {

	public static void main(String[] args) throws SQLException {
		UsuarioDao		umodel 	= new UsuarioDao();
		ProdutoDao		pmodel 	= new ProdutoDao();
		ClienteDao		cmodel 	= new ClienteDao();	
		VendaDao		vmodel 	= new VendaDao();
		TipoUsuarioDao 	tumodel = new TipoUsuarioDao();
		Administrador	admcontrol = new Administrador();
		
		
	
//		tumodel.createTable();
//		umodel.createTable();
//		pmodel.createTable();
//		cmodel.createTable();
//		vmodel.createTable();
//		tumodel.insert("ADMIN", "Pode efetuar todas as operacoes no sistema");
//		admcontrol.cadastrarUsuario("Renan", "Esteves", "42791592890", "abcd", TipoUsuario.ADMIN);
		System.out.println("Sucesso");
	}
}
