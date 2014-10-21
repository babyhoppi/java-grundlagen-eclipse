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
	}
	
}
