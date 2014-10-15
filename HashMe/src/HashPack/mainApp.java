package HashPack;

import HashPack.KlasseMarco;
/**
 * 
 */

/**
 * @Author Marco Hoppe
 */
public class mainApp {
	
	int attributA = 13;
	long attributB = 1000L;
	String attributC = new String("HashcodeString");;
	
	
	/**
	 * 
	 */
	public mainApp() {
		// TODO Auto-generated constructor stub
	
		System.out.println(attributA);
		System.out.println(attributB);
		System.out.println(attributC);
		
		
		KlasseMarco km1 = new KlasseMarco(attributA);
		KlasseMarco km2 = new KlasseMarco(attributB);
		KlasseMarco km3 = new KlasseMarco(attributC);
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

			
		if (km1.equals(km2)) {
			System.out.println("Die beiden Werte sind gleich");
		} else {
			System.out.println("Die beiden Werte sind ungleich");
		}
	}
}
