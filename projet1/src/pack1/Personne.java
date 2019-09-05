package pack1;

import java.io.Serializable;

public class Personne implements Comparable {
	String nom;
	String prenom;
	short age;
	Adresse adr;
	Personne pere;
	Personne mere;

	public Personne(String prenom, String nom, short age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public Personne(String nom, String prenom, short age, Personne pere, Personne mere) {
		this(nom, prenom, age);
		this.pere = pere;
		this.mere = mere;
	}

	public void setPere(Personne pere) {
		this.pere = pere;
	}

	public Personne getPere() {
		return pere;
	}

	public void setMere(Personne mere) {
		this.mere = mere;
	}

	public Personne getMere() {
		return mere;
	}

	public String afficher1() {
		String res1 = " mon pere est " + " " + getNom() + " " + getPrenom();
		return res1;
	}

	public String afficher2() {
		String res1 = " ma mere est " + " " + getNom() + " " + getPrenom();
		return res1;
	}

	private String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public Adresse getAdr() {
		return adr;
	}

	public void setAdr(Adresse adr) {
		this.adr = adr;
	}

	public void afficherVrai() {
		System.out.println("je m appelle " + this.getPrenom() + " " + this.getNom() + this.getAge() + " ans "
				+ " le pere de modou diouf " + "" + "" + "est " + this.getPere());

	}

	public String afficher() {
		String res = "je m appelle " + this.getPrenom() + " " + this.getNom() + this.getAge() + " ans "
				+ " Mon pere est " + this.getPere();
		return res;
	}

	public String toString() {
		String res = "";
		if (this.nom != null) {
			res = res + "Nom= " + this.getNom();
		}
		if (this.prenom != null) {
			res = res + "\n " + "Prenom= " + this.getPrenom();
		}

		if (this.adr != null) {
			res = res + "\n" + "Adresse=" + this.getAdr() + "\n";
		}

		if (this.pere != null) {
			res = res + "  \t Pere:\n" + this.getPere().toString() + "\n";
		}

		if (this.mere != null) {
			res = res + "  \t Mere:\n" + this.getMere() + "\n";
		}

	    return res;

	}

	public int compareTo(Object pers) {
		int res;
		Personne p;
		// System.out.println("type Object passe a compareTo() " + pers.getClass());
		if (pers instanceof Personne) {
			p = (Personne) pers;
			if (this.age < p.age)
				res = -1;
			else if (this.age == p.age)
				res = 0;
			else
				res = 1;
		} else
			res = -10;

		return res;
	}

	public void comparePersonne(Personne p) {
		if (this.compareTo(p) == -1)
			System.out.println(p.nom + " Superieure à " + this.nom);
		if (this.compareTo(p) == 1)
			System.out.println(p.nom + " inferieure à " + this.nom);
		if (this.compareTo(p) == 0)
			System.out.println(p + " egale à " + this);
		if (this.compareTo(p) == -10)
			System.out.println(p + "n'est pas de type Personne ");

	}
}
