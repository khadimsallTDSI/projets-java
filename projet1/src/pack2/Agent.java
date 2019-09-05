package pack2;

public class Agent extends Employe {
	private int noHeure;
	private double indice;

	public Agent(int no, String n, int noHeure, double indice) {
		super(no, n);
		this.noHeure = noHeure;
		this.indice = indice;
	}

	public double getSalaire() {
		return noHeure * indice;
	}

	
}
