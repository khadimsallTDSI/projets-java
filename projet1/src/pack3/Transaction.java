package pack3;

import java.io.*;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

/**
 * classe Principale de l'application
 * 
 * @author Khadim version 0.1
 */
public class Transaction {

	/**
	 * Une variable static
	 */
	static int choix;
	static long depot;
	static int saisiCompte;
	static int saisiClient;
	static Scanner sc = new Scanner(System.in);

	public static void menu() {
		do {
			System.out.println("------------------------------------------------");
			System.out.println("Bienvenu dans votre menu principal");
			System.out.println("------------------------------------------------");
			System.out.println("1- Gestion de Compte");
			System.out.println("------------------------------------------------");
			System.out.println("2- Gestion de Client");
			System.out.println("------------------------------------------------");
			System.out.println("3- pour quitter");
			System.out.println("------------------------------------------------");
			System.out.println("Faite votre choix:-\n");
			choix = sc.nextInt();

		} while (choix < 1 || choix > 3);

	}

	/**
	 * La méthode main ...
	 * 
	 * @param args
	 *            les arguments de la méthode main
	 */
	public static void main(String[] args) {
		Date d = new Date();
		Client cl1 = new Client("niang", "modou", "fac", 7777555, d, "177777");
		System.out.println("Gestion Bancaire");
		//cl1.ajouterClient();
		Compte c1 = new Compte("001", cl1);
		Compte c2 = new Compte("0A4R", 40000, 15000, cl1);
		Compte c3 = new Compte("0A4R", 40000, 15000, cl1);
		Compte c4 = new Compte("0003", 30000, 50000, cl1);
		menu();
		switch (choix) {
		case 1:
			System.out.println("Bienvenu dans votre menu Gestion de compte...");
			System.out.println("1- Creer Compte");
			System.out.println("2- Lister Compte");
			System.out.println("3- Modifier Compte");
			System.out.println("4- Retour au menu principal");
			System.out.println("0- Quitter");
			saisiCompte = sc.nextInt();
			if (saisiCompte == 1) {
				System.out.println("Entrez le numero de compte");
				int num = sc.nextInt();
				System.out.println("Entrez le decouvert du compte");
				long dec = sc.nextInt();
				System.out.println("Entrez le decouvert par defaut");
				long decParDefaut = sc.nextInt();
				System.out.println("numero  de compte : " + num + "\n Decouvert " + dec + "\n Decouvert par defaut:"
						+ decParDefaut);
				menu();

			}
			if (saisiCompte == 2) {
				/*cl1.deposerArgent(12000, c4);
				System.out.println(c4);
				cl1.deposerArgent(1000000, c4);
				System.out.println(c4);
				System.out.println(c4);
				cl1.deposerArgent(44600, c4);
				System.out.println(c4);
				cl1.retirerArgent(70000, c4);*/
				menu();

			}
			if (saisiCompte == 3) {
				System.out.println("Voulez vous modifier le compte \n:1- oui \n:2- non");
				int choix1 = sc.nextInt();
				if (choix1 == 1)
					System.out.println("Modification");
				if (choix1 == 2)
					menu();
			}
			if (saisiCompte == 4)
				menu();

			if (saisiCompte == 0)
				System.exit(0);
			break;
		case 2:
			do {

				System.out.println("----Bienvenu dans le menu Gestion Client----");
				System.out.println("1- Creer Client");
				System.out.println("2- Lister Client");
				System.out.println("3- Modifier Client");
				System.out.println("4- Transaction");
				System.out.println("5- Retour au menu principal");
				System.out.println("0- Quitter");
				saisiClient = sc.nextInt();
				if (saisiClient == 1) {

					System.out.println("Entrez le nom du client");
					String no = sc.nextLine();
					System.out.println("Entrez le prenom du client");
					String pre = sc.nextLine();
					System.out.println("Entrez l'adresse du client");
					String adr = sc.nextLine();
					System.out.println("Entrez le numero de telephone");
					int tel = sc.nextInt();
					System.out.println("Entrez l'anne de naissance");
					int annee = sc.nextInt();
					System.out.println("Entrez le numero de carte d'identite national");
					String cin = sc.nextLine();
					Client cl2 = new Client(no, pre, adr, tel, d, cin);
					System.out.println("Prenom : " + pre + "\n nom: " + no + "\n Adresse:" + adr + "\n Telephone: " + tel
							+ "\n age: " + (2019 - annee));
					//cl1.ajouterClient();
					menu();

				}
				if (saisiClient == 2) {
					System.out.println("Liste des clients");
					cl1.ajouterClient();
					menu();


				}
				if(saisiClient==3) {
					System.out.println("Voulez vous modifier le client \n:1- oui \n:2- non");
					int choix1 = sc.nextInt();
					if (choix1 == 1)
						System.out.println("Modification");
					if (choix1 == 2)
						menu();
				}
				if(saisiClient==4) {
					System.out.println("-------Transaction--------");
					System.out.println("Voulez vous faire un retrait ou un depot\n 1: retrait\n 2:depot");
					int trans=sc.nextInt();
					if(trans==1) {
						System.out.println("Entrez la somme");
						long somme=sc.nextLong();
						cl1.retirerArgent(somme, c4);
						System.out.println("Solde actuel est: "+c4.getSolde()+" fcfa");
						menu();
					}
					if(trans==2) {
						System.out.println("Entrez la somme");
						long somme=sc.nextLong();
						cl1.deposerArgent(somme, c4);
						System.out.println("Solde actuel est: "+c4.getSolde()+" fcfa");
						menu();
					}
				}
			} while (saisiClient < 0 || saisiClient > 5);
			break;

		case 3:

			System.out.println("Voulez vouvraiment quitter le programme \n:1- oui \n:2- non");
			int choix1 = sc.nextInt();
			if (choix1 == 1) 
				System.exit(0);
			if (choix1 == 2)
				menu();
			break;		
		}

		/**
		 * Creation de nouveaux objets references par des variables
		 */

		/*cl1.deposerArgent(12000, c4); System.out.println(c4);
		cl1.deposerArgent(1000000, c4); System.out.println(c4);
		System.out.println(c4); cl1.deposerArgent(44600, c4); System.out.println(c4);
		cl1.retirerArgent(70000, c4);


		 System.out.println(c4.getNumero()+" solde: "+c4.getSolde());
		  System.out.println(c4.getNumero()+" decouvert: "+c4.getDecouvert());
		  System.out.println(c4.getSolde()); 
		 try { FileOutputStream fos=new
		  FileOutputStream(
		  "C:\\Users\\BAMBA\\Documents\\angular_projet\\mon-projet-angular\\projet1\\ser.txt"
		  ); ObjectOutputStream os=new ObjectOutputStream(fos); os.writeObject(c4);
		  System.out.println("La serialization s'est bien passée"); os.close();
		  System.out.println("fin de la serialization"); } catch (Exception e) { TODO
		  Auto-generated catch block e.printStackTrace(); }

		  try { FileInputStream iis=new FileInputStream(
		  "C:\\Users\\BAMBA\\Documents\\angular_projet\\mon-projet-angular\\projet1\\deser.txt"
		  ); ObjectInputStream os=new ObjectInputStream(iis); Compte c=(Compte)
		  os.readObject(); System.out.println("La deserialization s'est bien passée");
		  os.close(); System.out.println("fin de la deserialization"); } catch
		  (Exception e) { TODO Auto-generated catch block e.printStackTrace(); }

		  c4.historiqueCompte(); depot=c4.deposerArgent(5000)-30000;
		  System.out.println("Vous venez de deposer " +depot +
		  " Votre nouveau solde est:" + c4.deposerArgent(5000));
		  System.out.println(c4.retirerArgent(1000));
		  System.out.println(c2.getSolde()); 
		  System.out.println(c3);
		  System.out.println(c2); 
		  System.out.println("valeur de C2 "+c2);
		  c1.setDecouvert(18000); 

		  System.out.println(c1);
		  System.out.println(c1.decouvert);
		   System.out.println(c2.decouvert);

		  c1.setSolde(500000); c1.setDecouvert(20000); System.out.println(c1); Compte
		  c2 =new Compte("002", 315000, 45000); System.out.println(c2);
		  System.out.println(c1); c1.setDecouvert(15000); System.out.println(c1);
		  System.out.println(c2); System.out.println(c1.decouvert);
		  System.out.println(Compte.decouvert);

		  System.out.println(c1.getDecouvert());
		  System.out.println(Compte.getDecouvert());*/


	}
}
