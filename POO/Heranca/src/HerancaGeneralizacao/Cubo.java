package HerancaGeneralizacao;

public class Cubo extends Forma{

	private double aresta;

	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}
	
	@Override
	public double calcularVolume(){
		return Math.pow(aresta, 3);
	}
	
}
