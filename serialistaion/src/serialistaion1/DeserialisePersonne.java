package serialistaion1;

import java.io.*;

public class DeserialisePersonne {

	public static void main(String[] args) {
		Personne p = null;

		System.out.println("-------------------------------------------");
		System.out.println("La deserialisation");
		System.out.println("-------------------------------------------");
		try {
			FileInputStream fileIn = new FileInputStream("personne.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			p = (Personne) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Personne class not found");
			c.printStackTrace();
			return;
		}

		System.out.println("Deserialized Personne...");
		System.out.println("Nom: " + p.nom);
		System.out.println("Prenom: " + p.prenom);
		System.out.println("Age: " + p.age);
		System.out.println("Pere: " + p.pere);
		System.out.println("Mere: " + p.mere);
	}

}
