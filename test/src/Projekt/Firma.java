public class Firma {
	
	public static void main (String [] args)
	{
		
		Arbeitnehmer eins  = new Arbeitnehmer("Marco Hoppe", 1, false);
	
		Programmierer zwei  = new Programmierer("Max Mustermann", 5);
		zwei.setZufriedenheit(50);
		zwei.setUrlaub(false);
		
		Programmierer drei  = new Programmierer("Herbert Sack",4);
		drei.setZufriedenheit(75);
		drei.setUrlaub(true);
		
		Tester vier  = new Tester("Peter Zwegat", 5);
		vier.setSchlaf(50);
		vier.setUrlaub(false);
		
		GUIEntwickler fuenf  = new GUIEntwickler("Horst Huebschmann",4);
		fuenf.setKoffeingehalt(10);
		fuenf.setUrlaub(true);
	
	
	System.out.println(eins.getName() +" ist verfuegbar:  "+ eins.getVerfuegbar());
	System.out.println(eins.getName() +" hat ein Level von:  "+ eins.getErfahrungslevel());
	System.out.println();
	System.out.println(zwei.getName() +" ist verfuegbar:  "+ zwei.getVerfuegbar());
	System.out.println(zwei.getName() +" hat ein Level von:  "+ zwei.getErfahrungslevel());
	System.out.println(zwei.getName() +" hat eine Zufriedenheit von:  "+zwei.getZufriedenheit());
	System.out.println();
	System.out.println(drei.getName() +" ist verfuegbar:  "+ drei.getVerfuegbar());
	System.out.println(drei.getName() +" hat ein Level von:  "+ drei.getErfahrungslevel());
	System.out.println();
	System.out.println(vier.getName() +" ist verfuegbar:  "+ vier.getVerfuegbar());
	System.out.println(vier.getName() +" hat ein Level von:  "+ vier.getErfahrungslevel());
	System.out.println(vier.getName() +" hat einen Schlaf von:  "+vier.getSchlaf());
	System.out.println();
	System.out.println(fuenf.getName() +" ist verfuegbar:  "+ fuenf.getVerfuegbar());
	System.out.println(fuenf.getName() +" hat ein Level von:  "+ fuenf.getErfahrungslevel());
	System.out.println(fuenf.getName() +" hat einen Koffeingehalt von:  "+fuenf.getKoffeingehalt());
	}
}



