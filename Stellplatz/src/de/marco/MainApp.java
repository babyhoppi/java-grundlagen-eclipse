package de.marco;

public class MainApp {
	public static void main(String[] args) {
		
			Stellplatz platz1 = new Stellplatz();
			Wohnung marco = new Wohnung(platz1);
			
			System.out.println(marco.getLink());
			marco.removeLink();
			System.out.println(marco.getLink());
			
			Wohnung marco1 = new Wohnung();
			System.out.println(marco1.getLink());
			marco1.setLink(platz1);
			System.out.println(marco1.getLink());
	}
}
