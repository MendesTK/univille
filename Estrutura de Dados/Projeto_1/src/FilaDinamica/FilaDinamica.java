package FilaDinamica;

public class FilaDinamica {

	private Elemento cabeca;
	private Elemento cauda;
	
	public FilaDinamica() {
		cabeca = cauda = null;
	}
	
	public boolean isFull(){
		return false;
	}
	
	public boolean isEmpty(){
		return cabeca == null && cauda == null;
	}
	
	public void add(Object valor) throws Exception{
		System.out.println("Adicionando " + valor + " a fila.");
		Elemento e = new Elemento(valor);
		if(cauda != null){
			cauda.setProximo(e);
		}
		cauda = e;
		if(cabeca == null){
			cabeca = e;
		}
		
	}
	
	public Object remove() throws Exception{
		if(this.isEmpty()){
			throw new Exception("Fila vazia");
		}
		Object o = cabeca.getValor();
		cabeca = cabeca.getProximo();
		if(cabeca == null){
			cauda = null;
		}
		System.out.println("Removendo o "+ o +" da fila.");
		
		return o;
	}
	
	public void clear(){
		while(!this.isEmpty()){
			try{
				this.remove();
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public void list(){
		Elemento e = cabeca;
		
		while(e != null){
			System.out.println("Valor "+ e.getValor());
			e = e.getProximo();
		}
		
	}
}
