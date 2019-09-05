package serialistaion1;

import java.io.*;

public class SerialisePersonne implements Serializable {

	public static void main(String[] args) {
		Personne p = new Personne("Khadim", "sall", (short) 24);
		Personne p2 = new Personne("Modou", "sall", (short) 50);
		Personne p4 = new Personne("Ndack", "sall", (short) 40);
		Personne p3 = new Personne("khadim", "sall", (short) 24, p2, p4);
		System.out.println("-------------------------------------------");
		System.out.println("La serialisation");
		System.out.println("-------------------------------------------");
		try {
			FileOutputStream fileOut = new FileOutputStream("personne.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(p3);
			out.close();
			fileOut.close();
			System.out.println("Serialisation successfully");
			System.out.println("les donnees de serialisations sont enregistres dans personne.ser");
			System.out.println("-------------------------------------------");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}
