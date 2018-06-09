package view;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Usuario;

public class TelaUsuario {

public static void main(String[] args) throws SQLException {
	Usuario umodel = new Usuario();
	umodel.createUsuario();
	System.out.println("Sucesso");
}
}
