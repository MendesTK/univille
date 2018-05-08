package FilaEstatica;

public class FilaEstatica {
	
	private Object[] fila;
	private int cabeca;
	private int cauda;
	
	public FilaEstatica(int capacidade){
		fila = new Object[capacidade];
		cabeca = -1;
		cauda = -1;
	}
	
	public boolean isFull(){
		return (cauda+1) % fila.length == cabeca;
	}
	
	public boolean isEmpty(){
		return cabeca == -1;
	}
	
	public void add(Object elemento) throws Exception{
		if(this.isFull()){
			throw new Exception("Fila cheia");
		}
		System.out.println("Adicionando o "+ elemento +" a fila.");
		fila[(cauda+1)%fila.length] = elemento;
		cauda = (cauda+1)%fila.length;
		if(cabeca < 0){
			cabeca+=1;
		}
	}
	
	public Object remove() throws Exception{
		if(this.isEmpty()){
			throw new Exception("A Fila est� v�zia.");
		}
		Object o = fila[cabeca];
		fila[cabeca] = null;
		
		if(cabeca == cauda){
			cabeca=-1;
			cauda=-1;
		}
		else if(cabeca < fila.length-1){
			cabeca++;
		}
		else{
			cabeca=0;
		}
		
		System.out.println("Removendo " + o + " da fila.");
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

}
