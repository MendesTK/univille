package ListaCircular;

import Deques.Elemento;

public class ListaCircular {

	private Elemento cabeca;
	private Elemento cauda;

	public ListaCircular() {
		cabeca = cauda = null;
	}

	public boolean isFull() {
		return false;
	}

	public boolean isEmpty() {
		return cabeca == null && cauda == null;
	}

	public void add(Object valor) throws Exception {
		System.out.println("Adicionando " + valor + " ao final da lista.");
		Elemento e = new Elemento(valor);
		if (cauda != null) {
			cauda.setProximo(e);
			
		}
		e.setAnterior(cauda);
		cauda = e;
		if (cabeca == null) {
			cabeca = cauda;
		}
		e.setProximo(cabeca);

	}

	public void addFirst(Object valor) throws Exception {
		System.out.println("Adicionando " + valor + " ao inicio da lista.");
		Elemento e = new Elemento(valor);
		if (cabeca != null) {
			cabeca.setAnterior(e);
		}
		e.setProximo(cabeca);
		cabeca = e;
		if (cauda == null) {
			cauda = cabeca;
		}
		e.setAnterior(cauda);

	}

	public void list() {
		Elemento e = cabeca;
		System.out.println("Valor " + e.getValor());
		while (e != cauda) {
			e = e.getProximo();
			System.out.println("Valor " + e.getValor());
		}

	}
	
	public void listEnd() {
		Elemento e = cauda;
		System.out.println("Valor " + e.getValor());
		while (e != cabeca) {
			e = e.getAnterior();
			System.out.println("Valor " + e.getValor());
		}
	}

}