package pack3;

import java.util.Arrays;
import java.util.Date;
/**
*classe client de l'application
* @author Khadim
* version 0.1
*/
public class Client {
	/**
	  * Une variable à visibilité prive
	  */
	private String nom;
	/**
	  * Une variable à visibilité prive
	  */
	private String prenom;
	/**
	  * Une variable à visibilité prive
	  */
	private String adresse;
	/**
	  * Une variable à visibilité prive
	  */
	private int tel;
	/**
	  * Une variable à visibilité prive
	  */
	private Date dateNaiss;
	/**
	  * Une variable à visibilité prive
	  */
	private String cin;
	/**
	  * Une variable à visibilité prive
	  */
	private Compte[] compteClient;
	/**
	  * Un constructeur qui n'a pas de
	  *  paramètre 
	  */
	 private int nbClients=0;
	    private Client [] clients=new Client[100];
	    
	   
	public Client() {

	}
	/**
	  * Un constructeur avec quatre variables en 
	  *parametre dont on fait l'appel des deux parametres
	  *a partir du constructeur precedent
	  *avec l'utilisation de this()
	  *@param nom 
	  *@param prenom
	  *@param adresse
	  *@param tel
	  *@param date_naiss
	  *@param cin
	  */

	public Client(String nom, String prenom, String adresse, int tel, Date date_naiss, String cin) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.tel = tel;
		this.dateNaiss = date_naiss;
		this.cin = cin;
	}
	
	 public void ajouterClient() {
			nbClients+=1;
			clients[nbClients]=new Client(nom,prenom,adresse,tel,dateNaiss,cin);
			System.out.println(clients[nbClients]);
		    }
	
	/**
	 * la methode getNom qui  retourne le nom
	 * @return
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * la methode setNom qui ne retourne rien
	 * @param nom
	 */

	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * la methode getNom qui ne retourne rien
	 * @return
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * la methode getPrenom qui ne retourne rien
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * la methode getAdresse qui ne retourne rien
	 * @return
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * la methode setAdresse qui prend en parametre
	 * un argument
	 * @param adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * la methode getTel qui retourne le numero de
	 * telephone du client
	 * @return
	 */
	public int getTel() {
		return tel;
	}
	/**
	 * la methode setTel qui prend en parametre un
	 * argument et qui retourne rien
	 * @param tel
	 */

	public void setTel(int tel) {
		this.tel = tel;
	}
	/**
	 * la methode getDate_naiss qui  retourne 
	 * la date de naissance du client
	 * @return
	 */

	public Date getDate_naiss() {
		return dateNaiss;
	}
	/**
	 * la methode setDate_naiss qui ne retourne rien
	 * et  qui initialise la date de naissance 
	 * @param date_naiss
	 */

	public void setDate_naiss(Date date_naiss) {
		this.dateNaiss = date_naiss;
	}
	/**
	 * la methode getCin qui  retourne 
	 * le numero de carte national d'identite
	 * @return
	 */

	public String getCin() {
		return cin;
	}
	/**
	 * la methode setCin qui ne retourne rien et qui
	 * prend en parametre une chaine de caractere
	 * @param cin
	 */
	public void setCin(String cin) {
		this.cin = cin;
	}
	/**
	 * la methode getCompteClient qui  retourne les
	 * comptes du client
	 * 
	 */
	public Compte[] getCompteClient() {
		return this.compteClient;
	}
	/**
	 * la methode setCompteClient qui ne retourne rien et qui
	 * prend en parametre une chaine de caractere
	 * @param compteClient
	 */

	public void setCompteClient(Compte[] compteClient) {
		this.compteClient = compteClient;
	}
	/**
	 * la methode deposerArgent qui  associe le montant 
	 * depose par le client a son compte et qui prend
	 * en parametre 2 arguments
	 * elle retourne un resultat de type long
	 * @param montant
	 * @param compte
	 * @return
	 */

	public long deposerArgent(long montant, Compte c) {
		long res = c.deposerArgent(montant);
		return res;

	}
	/**
	 * la methode retirerArgent qui  associe le montant 
	 * retire par le client a son compte
	 * elle retourne un resultat de type long
	 * @param montant
	 * @param compte
	 * @return
	 */

	public void retirerArgent(long montant, Compte c) {
		boolean res = true;
		if (c.retirerArgent(montant))
			System.out.println("retrait bien effectue");
		else {
			System.out.println("retrait impossible");
		}
		
	}
/**
 * la methode toString qui affiche les informations du client
 */
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", tel=" + tel + ", dateNaiss="
				+ dateNaiss + ", cin=" + cin + ", compteClient=" + Arrays.toString(compteClient) + "]";
	}

}
