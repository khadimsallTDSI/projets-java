package inter;

public class Carre extends Rectangle implements FigureGeometrique{
	//float coté;
 public Carre(float coté) {
	 super(coté, coté);
     //this.coté=coté;
 }
 public float perimetre() {
	 System.out.println("Methode Perimetre de la classe Carre");
	 return 4*this.longueur;
 }
 public float surface() {
	 System.out.println("Methode Surface de la classe Carre");
	 return this.longueur*this.longueur;
 }
}
