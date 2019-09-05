package pack1;

import java.io.*;
public class TestPersonne implements Serializable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne p = new Personne("Khadim", "sall", (short) 24);
		Personne p2 = new Personne("Modou", "sall", (short) 50);
		Personne p4 = new Personne("Ndack", "sall", (short) 40);
		Personne p3 = new Personne("khadim", "sall", (short) 24, p, p2);
		
		System.out.println("Debut de la serialisation");
		String fileName = "personne.ser";
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
			os.writeObject(p);
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" serialisation Successfully");
		System.out.println("-------------------------------------");
		System.out.println("Debut de la deserialisation");
		// deserialisation en java
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName));
			Personne P = (Personne) is.readObject();
			System.out.println(p.nom + " " + p.prenom + " " + p.age + " ");
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("deserialisation Successfully");

		// System.out.println(p3.afficher());
		// System.out.println(p2.afficher1());
		// System.out.println(p4.afficher2());
		// Adresse a= new Adresse();
		// System.out.println(p.getNom());
		// System.out.println(p.getAge());
		// System.out.println(a);
		// System.out.println(p.afficher());
		//p2.comparePersonne(p4);
		//System.out.println("-------------------------------------");
		// p2.afficherVrai();
	}

}
