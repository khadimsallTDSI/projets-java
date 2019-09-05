package pack1;

public class Point implements Comparable {
	float x, y;

	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}

	public int compareTo(Object pt) {
		int res=0;
		Point p = null;
		if (pt instanceof Point)
			p = (Point) pt;
		if (this.x == p.x && this.y == p.y)
			// System.out.println("Les deux points sont egaux");
			res=0;

		if (this.x > p.x && this.y > p.y)

			res= 2;
		if (this.x < p.x && this.y < p.y)

			res= -2;

		return res;
	}
	
	

}
