package testapi;

import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
		Random rnd = new Random();
		for (int i = 0; i <= 9; i++) {
			System.out.println(rnd.nextInt());
		}
		System.out.println("generation de 0 a 50 exclu ");
		for (int i = 0; i <= 9; i++) {
			System.out.println(rnd.nextInt(50));
		}
		// System.out.println(rnd.nextLong());
		System.out.println("generation de 0 a 50 exclu ");
		for (;; ) {
			System.out.println("Bonjour");
		}
	}

}
