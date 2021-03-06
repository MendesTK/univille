package com.produto;
import java.util.ArrayList;
import java.util.List;

public class AdicionarProdutos {

	public static void main(String[] args) {
		
		ProdutosView view = new ProdutosView();
		
		List<Produto> produtos = AdicionarProdutos.getProdutos();
		
		OrdenarPeloPreco ordenarPreco = new OrdenarPeloPreco();
		OrdenarPorNome ordenarNome = new OrdenarPorNome();
		
		view.print(produtos, "Produtos desordenados");


		List<Produto> produtosPrecoOrdenadoDecrescente = ordenarPreco.ordenarDecrescente(produtos);
		view.print(produtosPrecoOrdenadoDecrescente, "Produtos ordenados por pre�os decrescente");
				
		List<Produto> produtosPrecoOrdenadoCrescente = ordenarPreco.ordenarCrescente(produtos);
		view.print(produtosPrecoOrdenadoCrescente, "Produtos ordenados por pre�os crescente");
		

		List<Produto> produtosNomeOrdenadoDecrescente = ordenarNome.ordenarDecrescente(produtos);
		view.print(produtosNomeOrdenadoDecrescente, "Produtos ordenados por nomes decrescente");
		
		List<Produto> produtosNomeOrdenadoCrescente = ordenarNome.ordenarCrescente(produtos);
		view.print(produtosNomeOrdenadoCrescente, "Produtos ordenados por nomes crescente");

	}

	private static List<Produto> getProdutos() {
		List<Produto> listaProdutos = new ArrayList();
		
		Produto TV = new Produto();
		TV.setNome("TV");
		TV.setPreco(541454);
		
		Produto Vodka = new Produto();
		Vodka.setNome("Vodka");
		Vodka.setPreco(456456);
		
		Produto Cachaca = new Produto();
		Cachaca.setNome("Cachaca");
		Cachaca.setPreco(5454564);
		
		Produto Celular = new Produto();
		Celular.setNome("Celular");
		Celular.setPreco(579678);
		
		Produto Cocaina = new Produto();
		Cocaina.setNome("Cocaina");
		Cocaina.setPreco(5.25);
		
		Produto Margarina = new Produto();
		Margarina.setNome("Margarina");
		Margarina.setPreco(6.25);
		
		Produto Cerva = new Produto();
		Cerva.setNome("Cerva");
		Cerva.setPreco(10.00);
		
		Produto Monitor = new Produto();
		Monitor.setNome("Monitor");
		Monitor.setPreco(3.50);
		
		Produto Vinho = new Produto();
		Vinho.setNome("Vinho");
		Vinho.setPreco(3.50);
		
		Produto Mesa = new Produto();
		Mesa.setNome("Mesa");
		Mesa.setPreco(3.50);
		
		listaProdutos.add(TV);
		listaProdutos.add(Vodka);
		listaProdutos.add(Cachaca);
		listaProdutos.add(Celular);
		listaProdutos.add(Cocaina);
		listaProdutos.add(Margarina);
		listaProdutos.add(Cerva);
		listaProdutos.add(Monitor);
		listaProdutos.add(Vinho);
		listaProdutos.add(Mesa);

		return listaProdutos;
	}
}
