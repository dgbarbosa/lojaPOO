package controller;

public class Usuario {
	private int id;
	private String nome;
	private String sobrenome;
	private int cpf;
	private String senha;
	public Usuario(int id, String nome, String sobrenome, int cpf, String senha) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.senha = senha;
	}
	public int getId() {
		return id;
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
