package com.mcdonalds.modelo;

public class Produtos {

	private int id_Produto;
	private String nome_Produto;
	private float valor_Unit;
	private float desconto;
	private String combo;
	
	public Produtos(){
		
	}
	
	public Produtos(int id_Produto, String nome_Produto, float valor_Unit, float desconto, String combo){
		this.id_Produto = id_Produto;
		this.nome_Produto = nome_Produto;
		this.valor_Unit = valor_Unit;
		this.desconto = desconto;
		this.combo = combo;
		
	}
	public Produtos(String nome_Produto, float valor_Unit, float desconto, String combo){
		this.nome_Produto = nome_Produto;
		this.valor_Unit = valor_Unit;
		this.desconto = desconto;
		this.combo = combo;
		
	}
	public Produtos(int id_Produto){
		this.id_Produto = id_Produto;
	}
	
	
	public int getId_Produto() {
		return this.id_Produto;
	}
	public void setId_Produto(int id_Produto) {
		this.id_Produto = id_Produto;
	}
	public String getNome_Produto() {
		return this.nome_Produto;
	}
	public void setNome_Produto(String nome_Produto) {
		this.nome_Produto = nome_Produto;
	}
	public float getValor_Unit() {
		return this.valor_Unit;
	}
	public void setValor_Unit(float valor_Unit) {
		this.valor_Unit = valor_Unit;
	}
	public float getDesconto() {
		return this.desconto;
	}
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	public String getCombo() {
		return this.combo;
	}
	public void setCombo(String combo) {
		this.combo = combo;
	}
	
	
}