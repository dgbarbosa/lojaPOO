package controller;

import java.sql.SQLException;

import model.UsuarioDao;

public class Administrador extends Usuario{

	public Administrador(String nome, String sobrenome, String cpf, String senha, TipoUsuario tipo) {
		super(nome, sobrenome, cpf, senha, tipo);
	}
	public Administrador(String nome, String sobrenome, String cpf, String senha) {
		super(nome, sobrenome, cpf, senha);
	}
	public Administrador(int id, String nome, String sobrenome, String cpf) {
		super(id, nome, sobrenome, cpf);
	}
	public Administrador(String cpf, String senha, int tipo) {
		super(cpf, senha, tipo);
	}
	public Administrador() {
		super();
	}
	public Usuario cadastrarUsuario(String nome, String sobrenome, String cpf, String senha, TipoUsuario tipo) {
		Usuario u = new Usuario(nome, sobrenome, cpf, senha, tipo);
		UsuarioDao umodel;
		try {
			umodel = new UsuarioDao();
			umodel.insert(u);
		} catch (SQLException e) {
			System.out.println("Não foi possível inserir o usuário."+e);
		}
		return null;
	}
}
