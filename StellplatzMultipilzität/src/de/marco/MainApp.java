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
		c.setLink(new KlasseD());
		c.setLink(new KlasseD());
		c.setLink(new KlasseD());
		//d.setLink(c1);
		//c1.removeLink(d);
		System.out.println(d.toString());
		System.out.println(c.toString());
		System.out.println(c1.toString());
		
		//LÖSUNG HERR BAUER
		KlasseE e = new KlasseE();
		e.setLink(new KlasseF()); //0
		e.setLink(new KlasseF()); //1
		e.setLink(new KlasseF()); //2
		e.setLink(new KlasseF()); //3
		e.setLink(new KlasseF()); // dürfte schon nicht mehr gehen
		
		for (KlasseF objF : e.getAllLink()) {
			System.out.println(objF);
		}
		
	}
	
}
