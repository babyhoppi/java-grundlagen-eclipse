/**
 * 
 */
package de.marco.generics;

/**
 * @Author Marco Hoppe
 */
public class AppMain {

	/**
	 * 
	 */
	public static void main(String[] args) {
		
		// die generische Klasse MeineBox wird als RAW-Type verwendet
		//RAW-Type: wir lassen den Typ-Parameter bei der Instanziierung weg
		MeineBox mb = new MeineBox();
		
		mb.setValue(100);
		System.out.println(mb.getValue());
		
		mb.setValue("Hallo");
		System.out.println(mb.getValue());
		
		// die generische Klasse MeineBox wir mit Typparameter verwendet
		MeineBox<String> mbString = new MeineBox<String>();
		
		mbString.setValue("hallo");
		System.out.println(mbString.getValue());
		
		//führt zu einem Fehler, da die mbString-Box nur noch Zeichenketten akzeptiert
		//mbString.set(100);
		
		//seit JAVA 7 ist es möglich, den Dimond-Operator zu verwenden
		// der Diamond-Operator erlaubt es, den Typ-Parameter beim Aufruf des Konstruktors wegzulassen
		MeineBox<Integer> mbInt = new MeineBox<>();
		
		//Stolperstein beim Mischen von Instanzen mit Typ-Parametern und RAW-Type-Verwendung
		MeineBox rawBox = mbInt;	// ok
		
		MeineBox mbA = new MeineBox();	// eine RAW-Type-Verwendung der Klasse MeineBox
		MeineBox<Integer> mbIntA = mbA;	// ... wird einer RAW-Type-Verwendung zugeordnet
		
		mbIntA.setValue(100);
		//mbIntA.setValue("Hallo");
		mbA.setValue("Hallo");
		
		//TEST DER STATISCHEN VERGLEICHSMETHODE
		MeineBox<Integer> mBoxA = new MeineBox<>();
		MeineBox<Integer> mBoxB = new MeineBox<>();
		MeineBox<String> mBoxC = new MeineBox<>();
		
		mBoxA.setValue(100);
		mBoxB.setValue(100);
		mBoxC.setValue("100");
		
		//... alles bestens, weil der <Integer>-Parameter mit den Typ-Parametern von mBoxA und mBoxB übereinstimmen
		System.out.println(EineAndereBox.<Integer>vergleiche(mBoxA, mBoxB));
		//... hier passt es nicht, weil die mBoxC mit den Typ-Parametern <String> deklariert wurde
		//System.out.println(EineAndereBox.<Integer>vergleiche(mBoxA, mBoxC));
		
		//===========================================================================================================
		
		NochEineAndereBox<Integer> neabi = new NochEineAndereBox<>();
		NochEineAndereBox<Byte> neabb = new NochEineAndereBox<>();
		// das geht net, weil String keine Subklasse von Number ist
		// NochEineAndereBox<String> neabs = new NochEineAndereBox<>();
		
		neabi.set(new Integer(10));
		neabb.set(new Byte("10"));
		
		neabi.untersuche(new Integer(2000));
		neabb.untersuche(new Byte("20"));
		
	}
}
