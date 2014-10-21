package de.marco;

public class MainApp {
	
	public static void main(String[] args) {
		
		
		// ---------bidirektionale Assoziation mit fester 1 : 1 Multiplizität 
		KlasseA a = new KlasseA();
		KlasseB b = new KlasseB();
		a.setLink(b);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
	}
	
}
