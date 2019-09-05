package pack2;
import  pack3.Echelon;

	public class Medecin extends Employe {
	private int echelon;

	public Medecin(int no, String n, int echelon) {
		super(no, n);
		this.echelon = echelon;
	}

	public double getSalaire() {
		
		return Echelon.getSalaire(echelon);
	}
	
	

}
