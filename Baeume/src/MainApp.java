/**
 * @Author Marco Hoppe
 */
public class MainApp {

	/**
	 * @param args
	 */
	// Testprogramm mit Zufallszahlen
	public static void main(String[] args) {

		int[] anzahl = { 200, 100, 750, 150, 225, 42 };

		// starte mit leerem Baum
		BinaereBaeume sortierBaum = new BinaereBaeume();

		// f�lle den Baum mit dem int-Array anzahl
		for (int i = 0; i < anzahl.length; i++) {
			BaumKnoten neu = new BaumKnoten(anzahl[i]);
			sortierBaum.einf�gen(neu);
		}

		// gib den Baum aus
		System.out.println(sortierBaum);
	}

}
