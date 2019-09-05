package inter;

import java.awt.Point;

public class Cercle implements FigureGeometrique{
	float rayon;
	Point centre;
	public Cercle(float rayon,Point centre) {
		//super();
		this.rayon = rayon;
		this.centre=centre;
	}

	public float surface() {
		System.out.println("Methode Surface de la classe Cercle");
		return   PI*rayon*rayon;
	}

	public float perimetre() {
		System.out.println("Methode Perimetre de la classe Cercle");
		
		return 2*PI*rayon;
	}

}
