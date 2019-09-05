package mariage;

import java.util.*;

public class Etudiant extends Personne {
	String numeroEtudiant;
	int anneePremiereEntreeUniv;

	public Etudiant(String civilite, String nom, String prenom, int anneeNaiss, String situationMatrimonial,
			String numeroEtudiant, int anneePremiereEntree) {
		super(civilite, nom, prenom, anneeNaiss, situationMatrimonial);
		this.numeroEtudiant = numeroEtudiant;
		this.anneePremiereEntreeUniv = anneePremiereEntreeUniv;
	}

	public String retourneInfos() {
		return super.retourneInfos()+" "+this.numeroEtudiant+" "+this.anneePremiereEntreeUniv;
//		if (this.civilite == "Mme" && this.conjoint != null) {
//			// this.civilite="Mme";
//			// this.situationMatrimonial="mariee";
//			return this.civilite + " " + this.conjoint.nom + " n�e " + this.nom + " " + this.prenom + " est n�e en "
//					+ this.anneeNaiss + ",elle est " + this.situationMatrimonial + " numero etudiant"
//					+ this.numeroEtudiant + " et annee de premiere entree" + this.anneePremiereEntreeUniv;
//		}
//		return this.civilite + " " + this.nom + " " + this.prenom + " est n� en " + this.anneeNaiss + ",il est "
//				+ this.situationMatrimonial + "\n numero etudiant " + this.numeroEtudiant + " et annee de premiere entree "
//				+ this.anneePremiereEntreeUniv;

	}

}
