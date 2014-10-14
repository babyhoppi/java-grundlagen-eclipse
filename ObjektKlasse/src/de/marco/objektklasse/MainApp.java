package de.marco.objektklasse ;


/**
 * @Author Marco Hoppe
 */
public class MainApp {

	/**
	 * 
	 */
	public MainApp() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int x = 100;
		Integer objInt = new Integer(200);
		// hier wird der primitive Datenty in einem Zeichenkontext
		// verwendet und dessen Wert muss als Zeichenkette bereitgestellt werden
		// --> int wird geboxt zu Integer(Klasse)
		// --> für die Klasse Integer kann die Methode toString() aufgerufen werden
		// --> wird der Wert des primitiven Datentyps nicht mehr als Zeichenkette 
		//		benötigt, dann wird automatisch "zurück"geboxt
		// Autoboxing: "Alles ist ein Objekt, aber nur dann wenn es unbedingt sein muss"
		System.out.println("Der Wert von x = " + x);
		
		System.out.println("Der Wert von objInt = " + objInt);
		
		// wir experimentieren mit der KlasseMarco
		KlasseMarco km = new KlasseMarco(1000);
		
		// hier wird das Objekt in einem Zeichenkettenkontext eingesetzt
		// --> das ruft automatisch die Methode toString() auf den Plan
		System.out.println("Der Wert des Objekts km = " + km);
		System.out.println(km);
		
		//____________________________________________________________________________________
		
		int y = 100;
		
		if (x == y) {
			System.out.println("Die beiden Werte sind gleich");
		} else {
			System.out.println("Die beiden Werte sind ungleich");
		}
		
		String s1 = new String("Hallo Welt!");
		String s2 = new String("Hallo Welt!");
		
		if (s1 == s2) {
			System.out.println("Die beiden Werte sind gleich");
		} else {
			System.out.println("Die beiden Werte sind ungleich");
		}
		
		if (s1.equals(s2)) {
			System.out.println("Die beiden Werte sind gleich");
		} else {
			System.out.println("Die beiden Werte sind ungleich");
		}
		
		String meiner = "Hallo Welt!";
		StringBuffer sbl = new StringBuffer(meiner);
		StringBuffer sb2 = new StringBuffer(meiner);
		
		if (sbl == sb2) {
			System.out.println("Die beiden Werte sind gleich");
		} else {
			System.out.println("Die beiden Werte sind ungleich");
		}
		
		if (sbl.equals(sb2)) {
			System.out.println("Die beiden Werte sind gleich");
		} else {
			System.out.println("Die beiden Werte sind ungleich");
		}
		
		KlasseMarco km1 = new KlasseMarco(1000);
		KlasseMarco km2 = new KlasseMarco(1000);
		KlasseMarco km3 = new KlasseMarco(1000);
		if (km1 == km2) {
			System.out.println("Die beiden Werte sind gleich");
		} else {
			System.out.println("Die beiden Werte sind ungleich");
		}
		
		if (km1.equals(km2)) {
			System.out.println("Die beiden Werte sind gleich");
		} else {
			System.out.println("Die beiden Werte sind ungleich");
		}
		if (km2.equals(km3)) {
			System.out.println("Die beiden Werte sind gleich");
		} else {
			System.out.println("Die beiden Werte sind ungleich");
		}
		if (km1.equals(km3)) {
			System.out.println("Die beiden Werte sind gleich");
		} else {
			System.out.println("Die beiden Werte sind ungleich");
		}
		//_________________________________________________________________
		
		long demoLang =-1000l;
		
		for( int i=0; i < 32; i++){
			System.out.println(demoLang >> i);
		}
		
		for( int i=0; i < 32; i++){
			System.out.println(demoLang >>> i);
		}
		
		System.out.println((int)(demoLang ^ (demoLang>>>32)));
		
	}

}
