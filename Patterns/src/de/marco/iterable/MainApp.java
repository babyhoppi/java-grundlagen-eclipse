package de.marco.iterable;

/**
 * @Author Marco Hoppe
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Menge m = new Menge();
		
		for(Integer i : m) {
			System.out.println(i);
		}
	}

}
