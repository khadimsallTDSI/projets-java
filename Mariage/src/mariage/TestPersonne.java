package mariage;
import java.util.*;
public class TestPersonne {

	public static void main(String[] args) {
		int annee=2015;
		Personne p1=new Personne("M.","Gueye","saliou",1992,"celibataire");
		Personne p2=new Personne("M.","Diallo","Tidiane",1995,"celibataire");
		Personne p3=new Personne("M.","Diouf","Diegane",1993,"celibataire");
		Personne p4=new Personne("Mlle","lo","Ndioba",1993,"celibataire",p1);
		Personne p5=new Personne("Mlle","kane","fatima",1993,"celibataire");
		Etudiant e1=new Etudiant("M.","gueye","saliou",1993,"celibataire", "2015088BL", annee);
		System.out.println(e1.retourneInfos());
		System.out.println("------------------------------------");
		
		System.out.println(p5.retourneInfos());
		
		p2.marier(p5);
		System.out.println(p2.retourneInfos());
		System.out.println(p5.retourneInfos());

		System.out.println(p2.retourneInfos());	
		
		p5.marier(p2);
		System.out.println(p5.retourneInfos());
		System.out.println(p5.conjoint.retourneInfos());
		System.out.println(p2.retourneInfos());
//		if(p2.isMarier()) {
//			System.out.println(p2.civilite+" "+p2.nom+" "+p2.prenom+" est marié(e) avec ");
//			System.out.println("son conjoint est");
//			System.out.println(p2.conjoint.retourneInfos());
//		}
		
//		System.out.println("\n\n");
//		int age=p1.age(1990);
//		System.out.println(age);
	}

}
