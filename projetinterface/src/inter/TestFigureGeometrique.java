package inter;

import java.awt.Point;

public class TestFigureGeometrique {

	public static void main(String[] args) {
//		Rectangle r=new Rectangle(12,5);
//		System.out.println(r.surface());
//		System.out.println(r.perimetre());
//		Carre c=new Carre(8);
//		System.out.println(c.surface());
//		System.out.println(c.perimetre());
		Cercle cerc=new Cercle(4,new Point(2,3));
		System.out.println(cerc.surface());
		System.out.println(cerc.perimetre());
		FigureGeometrique f1;
		f1=new Rectangle(12,5);
		System.out.println(f1.surface());
		System.out.println(f1.perimetre());
		FigureGeometrique f2=new Carre(8);
		System.out.println(f2.surface());
		System.out.println(f2.perimetre());
		
		
	}

}
