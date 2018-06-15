package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.UsuarioDao;

public class Administrador extends Usuario{
	
	private List<Usuario> usuariosLista = new ArrayList<>();
	
	public Administrador(int id, String nome, String sobrenome, String cpf, String senha, int tipo) {
		super(id, nome, sobrenome, cpf, senha, tipo);
	}
	public Administrador(String nome, String sobrenome, String cpf, String senha, int tipo) {
		super(nome, sobrenome, cpf, senha, tipo);
	}
	public Administrador(int id, String nome, String sobrenome, String cpf, String senha) {
		super(id, nome, sobrenome, cpf, senha);
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
	public void cadastrarUsuario(String nome, String sobrenome, String cpf, String senha, int tipo) {
		Usuario u = new Usuario(nome, sobrenome, cpf, senha, tipo);
		UsuarioDao umodel;
		try {
			umodel = new UsuarioDao();
			umodel.insert(u);
		} catch (SQLException e) {
			System.out.println("Não foi possível inserir o usuário."+e);
		}
	}
	public void delete(int id) {
		try {
			UsuarioDao umodel = new UsuarioDao();
			Usuario userRes = umodel.select(id);
			if(userRes != null) {
				umodel.delete(userRes.getId());
			}else {
				System.out.println("Não existe usuário com tal Id");
			}
		} catch (SQLException e) {
			System.out.println("Não foi possivel efetuar o delete"+e);
		}
	}
	public List<Usuario> todosUsuarios() {
				
		try {
			UsuarioDao umodel = new UsuarioDao();
			usuariosLista = umodel.selectAll();
			if (usuariosLista.isEmpty()) {
				System.out.println("Não há usuários no banco de dados");
			}else {
				return usuariosLista;
			}
			
		} catch (SQLException e) {
			
		}
		return usuariosLista;
		
	}
}
