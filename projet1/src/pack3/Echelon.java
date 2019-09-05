package pack3;

public class Echelon {
	public final static int ASSISTANT = 1;
	public final static int CHEFDECLINIQUE = 2;
	public final static int CHEFDESERVICE = 3;

	public static double getSalaire(int echelon) {
		double res = 0.0;
		if (echelon == ASSISTANT) {
			res = 3000;
		}
		if (echelon == CHEFDECLINIQUE) {
			res = 5000;
		}
		if (echelon == CHEFDESERVICE) {
			res = 8000;
		}
		return res;
	}
}
