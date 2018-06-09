package controller;

public class Usuario {
	private int user_id;
	private String nome;
	private String sobrenome;
	private int cpf;
	private String senha;
	public Usuario(int id, String nome, String sobrenome, int cpf, String senha) {
		this.user_id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.senha = senha;
	}
	public Usuario(int id, String nome, String sobrenome, int cpf) {
		this.user_id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
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
	public int getCpf() {
		return cpf;
	}
	public String getSenha() {
		return senha;
	}
}
