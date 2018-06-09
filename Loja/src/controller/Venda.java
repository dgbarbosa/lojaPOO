package controller;

public class Venda {
	private int produto_id,quantidade_produto,cliente_id,usuario_id;
	
	public Venda(int produto_id, int quantidade_produto, int cliente_id, int usuario_id) {
		this.produto_id = produto_id;
		this.quantidade_produto = quantidade_produto;
		this.cliente_id = cliente_id;
		this.usuario_id = usuario_id;
	}

	public int getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}

	public int getProduto_id() {
		return produto_id;
	}

	public int getQuantidade_produto() {
		return quantidade_produto;
	}

	public int getCliente_id() {
		return cliente_id;
	}
	

}
