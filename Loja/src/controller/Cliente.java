package controller;

public class Cliente {
	private int prod_id;
	private String nome;
	private int cpf;
	private String endereco;
	private int clienteUsuario_id;
	public Cliente(int id, String nome, int cpf, String endereco, int user_id) {
		this.prod_id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.clienteUsuario_id = user_id;		
	}
	public int getProd_id() {
		return prod_id;
	}
	public String getNome() {
		return nome;
	}
	public int getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public int getClienteUsuario_id() {
		return clienteUsuario_id;
	}

}
