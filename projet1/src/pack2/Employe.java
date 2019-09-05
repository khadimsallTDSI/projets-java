package pack2;

public abstract class Employe {

	protected int noEmploye;
	protected String nom;

	public Employe(int no, String n) {

		noEmploye = no;
		nom = n;
	}

	public abstract double getSalaire();
	public String resumePaye() {
		String res = noEmploye + " " + nom + " " + this.getSalaire();
		return res;
	}
}
