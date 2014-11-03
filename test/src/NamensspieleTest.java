class NamensspieleTest{
	
public static void main(String[] args) {
		
		// Startlisten
		String[] vornamen =  {"Joerg", "Alex", "Matthias", "Fabian", "Ulrike", "Marco", "Thomas", "Louise"};		
		String[] nachnamen = {"Eitemueller", "Weston", "Kohse", "Pampam", "Zenner", "Hoppe", "Wille", "Bleifuss"};
		
		System.out.println("Vor dem Sortieren");
        System.out.println("----------------");		
		System.out.println("Vornamen");
		gibNamenAus(vornamen);		
		System.out.println("Nachnamen");
		gibNamenAus(nachnamen);		
		

		// Aufgabe zwei
		String[] kombinationen = kombiniere(vornamen, nachnamen); // Diese Methode musst du schreiben
		System.out.println("Kombinierte Namen");
        System.out.println("----------------");
		gibNamenAus(kombinationen);
		


  } 

	
	public static void gibNamenAus(String[] eingabeliste) {		
		for(int i = 0; i < eingabeliste.length; i++) {
			System.out.print(" - ");
			System.out.println(eingabeliste[i]);
		}
		System.out.println();
	}
    

    
	private static void kombiniere(String[] vornamen, String[] nachnamen) {
        if (vornamen.length != nachnamen.length) {
            int i = 0 / 0;
        }
        for (int i = 0; i < vornamen.length * vornamen.length; i++) {
            System.out.println(vornamen[i / vornamen.length] + " " + nachnamen[i % vornamen.length]);
        }
    }      
 }   


