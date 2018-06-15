package controller;

import java.sql.SQLException;

import model.UsuarioDao;

public class Usuario {
	private int user_id;
	private String nome;
	private String sobrenome;
	private String cpf;
	private String senha;
	private TipoUsuario userType;
	public Usuario(int id, String nome, String sobrenome, String cpf, String senha, int tipo) {
		this.user_id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.senha = senha;
		TipoUsuario typeUser = TipoUsuario.values()[tipo];
		this.userType = typeUser;
	}
	public Usuario(String nome, String sobrenome, String cpf, String senha, int tipo) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.senha = senha;
		TipoUsuario typeUser = TipoUsuario.values()[tipo];
		this.userType = typeUser;
	}
	public Usuario(int id, String nome, String sobrenome, String cpf, String senha) {
		this.user_id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.senha = senha;
	}
	public Usuario(String nome, String sobrenome, String cpf, String senha) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.senha = senha;
	}
	public Usuario(int id, String nome, String sobrenome, String cpf) {
		this.user_id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}
	public Usuario(String cpf, String senha, int tipo) {
		this.cpf = cpf;
		this.senha = senha;
		TipoUsuario typeUser = TipoUsuario.values()[tipo];
		this.userType = typeUser;
	}
	public Usuario() {
	}
	public int getId() {
		return user_id;
	}
	public String getNome() {
		return nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getSenha() {
		return senha;
	}
	public TipoUsuario getUserType() {
		return userType;
	}
	public int getIntUserType() {
		return userType.ordinal();
	}
	public Object Login(String cpf, String Senha) {
		Usuario user;
		try {
			UsuarioDao udao = new UsuarioDao();
			user = udao.select(cpf, Senha);
			if (cpf == user.getCpf() && Senha == user.getSenha()) {
				if(user.getUserType().equals(TipoUsuario.ADMIN)) {
					Administrador a = new Administrador(
							user.getId(),
							user.getNome(),
							user.getSobrenome(),
							user.getCpf(),
							user.getSenha()
							);
					return a;
				}else {
					Regular r = new Regular(
							user.getId(),
							user.getNome(),
							user.getCpf(),
							user.getSenha()
							);
					return r;
				}					
			}
		} catch (SQLException e) {
			System.out.println("Não foi possivel efetuar login.");
		}
		return null;		
	}
}
