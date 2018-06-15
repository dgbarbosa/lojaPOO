package controller;

public class Produto {
	
	private int prod_id;
	private String nm_produto;
	private double preco_uni;
	private int qtd_prod;
	private int prodUsuario_id;
	private int tipoProduto_id;
	public int getProd_id() {
		return prod_id;
	}
	public String getNm_produto() {
		return nm_produto;
	}
	public double getPreco_uni() {
		return preco_uni;
	}
	public int getQtd_prod() {
		return qtd_prod;
	}
	public int getProdUsuario_id() {
		return prodUsuario_id;
	}
	public int getTipoProduto_id() {
		return tipoProduto_id;
	}
	

}