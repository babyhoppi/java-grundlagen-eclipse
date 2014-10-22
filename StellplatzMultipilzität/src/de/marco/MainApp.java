package de.marco;

public class MainApp {
	
	public static void main(String[] args) {
		
		
		// ---------bidirektionale Assoziation mit fester 1 : 1 Multiplizität 
		KlasseA a = new KlasseA();
		KlasseB b = new KlasseB();
		KlasseB b1 = new KlasseB();
		a.setLink(b);
		a.setLink(b1);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		// ---------bidirektionale 
		KlasseD d = new KlasseD();
		KlasseC c = new KlasseC();
		KlasseC c1 = new KlasseC();
		d.setLink(c);
		d.setLink(c1);
		System.out.println(c.toString());
	}
	
}
