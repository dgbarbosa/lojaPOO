package controller;

public class Regular extends Usuario{

	public Regular(int id, String nome, String sobrenome, String cpf, String senha, int tipo) {
		super(id, nome, sobrenome, cpf, senha, tipo);
	}
	public Regular(String nome, String sobrenome, String cpf, String senha, int tipo) {
		super(nome, sobrenome, cpf, senha, tipo);
	}
	public Regular(int id, String nome, String sobrenome, String cpf, String senha) {
		super(id, nome, sobrenome, cpf, senha);
	}
	public Regular(String nome, String sobrenome, String cpf, String senha) {
		super(nome, sobrenome, cpf, senha);
	}
	public Regular(int id, String nome, String sobrenome, String cpf) {
		super(id, nome, sobrenome, cpf);
	}
	public Regular(String cpf, String senha, int tipo) {
		super(cpf, senha, tipo);
	}
	public Regular() {
		super();
	}
}
