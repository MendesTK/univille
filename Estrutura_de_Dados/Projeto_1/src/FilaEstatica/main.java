package FilaEstatica;

public class main {

	public static void main(String[] args) throws Exception  {
		FilaEstatica pilha = new FilaEstatica(10);
		
		for(int i = 1; i < 11; i++){
			pilha.add(i);
		}
		
		pilha.clear();
		
		

	}

}
