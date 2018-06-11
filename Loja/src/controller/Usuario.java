package controller;

public class Usuario {
	private int user_id;
	private String nome;
	private String sobrenome;
	private String cpf;
	private String senha;
	private TipoUsuario userType;
	public Usuario(String nome, String sobrenome, String cpf, String senha, TipoUsuario tipo) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.senha = senha;
		this.userType = tipo;
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
}
