package FilaDinamica;

public class main {

	public static void main(String[] args) throws Exception {
		FilaDinamica fila = new FilaDinamica();
		
		fila.add(20.0);
		fila.add(20.8);
		fila.add(20.3);
		fila.add(44.5);
		fila.add(33.33);
		fila.add(20.9);
		
		fila.list();
		
		fila.remove();
		fila.remove();
		
		fila.list();
		
		fila.clear();
		

	}

}
