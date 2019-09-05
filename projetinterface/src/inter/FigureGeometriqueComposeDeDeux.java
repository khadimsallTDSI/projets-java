package inter;

public abstract class FigureGeometriqueComposeDeDeux implements FigureGeometrique {
	FigureGeometrique f, g;
	public FigureGeometriqueComposeDeDeux(FigureGeometrique f,FigureGeometrique g) {
		this.f=f;
		this.g=g;
	}
	public  float surface() {

		return 0;
	}
}
