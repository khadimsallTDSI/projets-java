package mariage;

import java.util.Calendar;

public class Personne {
String nom;
String civilite;
String prenom;
int anneeNaiss;
String situationMatrimonial;
Personne conjoint;

public Personne(String civilite,String nom,String prenom,int anneeNaiss,String situationMatrimonial) {
	this.civilite=civilite;
	this.nom=nom;
	this.prenom=prenom;
	this.anneeNaiss=anneeNaiss;
	this.situationMatrimonial=situationMatrimonial;
}
public Personne(String civilite,String nom,String prenom,int anneeNaiss,String situationMatrimonial,Personne conjoint) {
	this(civilite,nom,prenom,anneeNaiss,situationMatrimonial);
	this.conjoint=conjoint;
}

public String retourneInfos() {
	if(this.civilite=="Mme" && this.conjoint!=null) {
			//this.civilite="Mme";
			//this.situationMatrimonial="mariee";
			return this.civilite+" "+this.conjoint.nom+" née "+this.nom+" "+this.prenom+" est née en "
				    +this.anneeNaiss+",elle est "+this.situationMatrimonial;
	}
    return this.civilite+" "+this.nom+" "+this.prenom+" est né en "
    +this.anneeNaiss+",il est "+this.situationMatrimonial;

}
public int age(int annee) {
	if(annee<this.anneeNaiss)
		System.out.println("annee en cours < annee de naissance");
	
	return annee-this.anneeNaiss;
}
//public int ageAuto() {
//	Calendar c=Calendar.getInstance();
//	int year=c.get(Calendar.YEAR);
//	return  year-this.anneeNaiss;
//	
//}

//public Personne(Personne p,Personne conjoint) {
//	this(p.civilite,p.nom,p.prenom,p.anneeNaiss,p.situationMatrimonial);
//	this.conjoint=conjoint;
//}
public Personne getConjoint() {
	return conjoint;
}
public void marier(Personne conjoint) {
	if(this.civilite=="M.") {
		this.conjoint=conjoint;
		conjoint.conjoint = this;
		this.situationMatrimonial="marié";
		this.conjoint.situationMatrimonial="mariée";
		this.conjoint.civilite="Mme";
	}
	if(this.civilite=="Mlle") {
		this.conjoint=conjoint;
		conjoint.conjoint = this;
		this.situationMatrimonial="mariée";
		this.conjoint.situationMatrimonial="marié";
		this.civilite="Mme";
		
	}
//	if(this.civilite=="Mme") {
//		if()
//	}
	
}
public boolean isMarier() {
	if(this.conjoint==null)
		return false;
	return true;
}


}
