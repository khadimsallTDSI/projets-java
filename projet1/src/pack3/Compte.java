package pack3;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
*classe de demarrage de l'application
* @author Khadim
* version 0.1
*/
public class Compte  {
	 /**
	  * Une variable à visibilité prive
	  */
	private String numero;
	/**
	  * Une variable à visibilité prive
	  */
	private long solde;
	/**
	  * Une variable à visibilité prive et qui est initialise
	  * en meme temps
	  */
	private static long decouvertParDefaut = 20000;
	/**
	  *Une variable à visibilité public
	  */
	public long decouvert;
	/**
	  * Une variable qui est de type boolean et initialise false
	  */
	boolean decouvertRenseigné = false;
	
	long dep;
	/**
	  * Un entier à visibilité prive
	  */
	private Client client;
	/**
	  * Un constructeur qui n'a pas de
	  *  paramètre, et qui initialise les variables 
	  *  a leur valeur par defaut 
	  */
	public Compte() {
		this.numero = null;
		this.solde = 0;
		this.decouvert = 0;
		this.client = null;

	}
	/**
	  * Un constructeur avec un String
	  * en paramètre.
	  * @param numero une chaine de caractere
	  */
	public Compte(String numero) {
		this.numero = numero;

	}
	/**
	  * Un constructeur avec deux variables
	  * en paramètre
	  * @param numero une chaine de caractere
	  * @param client de type client
	  */
	public Compte(String numero, Client client) {
		this.numero = numero;
		this.client = client;

	}
	/**
	  * Un constructeur avec quatre variables en 
	  *parametre dont on fait l'appel des deux parametres
	  *a partir du constructeur precedent
	  *avec l'utilisation de this()
	  *@param solde
	  *@param decouvert
	  *@param decouvertRenseigné
	  */

	public Compte(String numero, long solde, long decouvert, Client client) {
		// super();

		this(numero, client);

		this.solde = solde;
		this.decouvert = decouvert;
		this.decouvertRenseigné = true;
	}
/**
 * la methode getNumero qui retourne le numero du compte
 * @return
 */
	public String getNumero() {
		return numero;
	}
	/**
	 * la methode setNumero qui ne retourne rien
	 * @param numero
	 */

	public void setNumero(String numero) {
		this.numero = numero;
	}
	/**
	 * la methode getSolde qui ne retourne la valeur du solde
	 * @return
	 */

	public long getSolde() {
		return solde;
	}
	/**
	 * la methode setSolde qui ne retourne rien
	 * @param solde
	 */

	public void setSolde(long solde) {
		this.solde = solde;
	}
	/**
	 * la methode getDecouvert qui  retourne la valeur du decouvert
	 * @return
	 */
	public long getDecouvert() {
		return decouvert;
	}
	/**
	 * la methode setDecouvert qui ne retourne rien
	 * @param decouvert
	 */
	public void setDecouvert(long decouvert) {
		this.decouvert = decouvert;
	}
	/**
	 * la methode getDecouvertDefaut qui retourne
	 * la valeur du decouvert par defaut
	 * @return
	 */
	public long getDecouvertParDefaut() {
		return decouvertParDefaut;
	}
	/**
	 * la methode setDecouvertParDefaut qui ne retourne rien 
	 * et qui prend en parametre une variable de type long
	 * @param decouvertParDefaut
	 */

	public void setDecouvertParDefaut(long decouvertParDefaut) {
		this.decouvertParDefaut = decouvertParDefaut;
	}
	/**
	 * la methode retirerArgent qui prend en parametre
	 * le  montant qui est le montant retire de type long 
	 * et qui retourne un boolean
	 * @param montant
	 * @ return
	 */


	public boolean retirerArgent(long montant) {
		//cette valeur doit etre initialiser
		boolean res = true;
		if (this.decouvertRenseigné == true) {
			if (montant <= this.solde) {
				this.solde = this.solde - montant;
               
			}
			if (montant > this.solde) {
				if (montant > this.solde + this.decouvert) {
					res = false;
				}
				if (montant <= this.solde + this.decouvert) {
					this.decouvert = this.decouvert - (montant - this.solde);
					this.solde = 0;
					res=true;
		
				}
				

			}
			
			
		}
		return res;
	}
	/**
	 * la methode getClient ne retourne 
	 * le client et n'a pas de parametre
	 * @return
	 */
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", solde=" + solde + ", decouvert=" + decouvert + ", client=" + client
				+ ", decouvertParDefaut=" + decouvertParDefaut + "]";
	}
	/**
	 * la methode deposerArgent qui ne retourne rien
	 *et qui prend en parametre un depot de type long
	 *@return
	 */

	public long deposerArgent(long dep) {
		return this.solde = this.solde + dep;

	}
	/**
	 * la methode historiqueCompte ne retourne rien
	 * et qui affiche l'historique de compte
	 */
	public void historiqueCompte() {
		System.out.println("vous avez  fait un retrait à " + new Date());
		// System.out.println("Vous avez effectuer un depot de "+deposerArgent(dep));

	}

}

