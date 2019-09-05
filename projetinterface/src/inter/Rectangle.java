package inter;

public class Rectangle implements FigureGeometrique{
    protected float longueur;
    protected float largeur;
    
	public Rectangle(float longueur, float largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public float surface() {
		System.out.println("Methode Surface de la classe rectangle");
		return this.longueur*this.largeur;
	}

	public float perimetre() {
		System.out.println("Methode Perimetre de la classe  rectangle");
		return 2*(this.longueur+this.largeur);
	}
	

}
