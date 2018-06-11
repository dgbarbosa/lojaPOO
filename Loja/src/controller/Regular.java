package controller;

public class Regular extends Usuario{

	public Regular(String nome, String sobrenome, String cpf, String senha, TipoUsuario tipo) {
		super(nome, sobrenome, cpf, senha, tipo);
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
