package inter;

public class Carre extends Rectangle implements FigureGeometrique{
	//float cot�;
 public Carre(float cot�) {
	 super(cot�, cot�);
     //this.cot�=cot�;
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
