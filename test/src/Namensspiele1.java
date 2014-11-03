class Namensspiele() {
	public static void main (args[]) {
		
		// Startlisten
		String[] vornamen =  {"Jörg", "Alex", "Matthias", "Fabian", "Ulrike", "Marco", "Thomas", "Louise"};		
		String[] nachnamen = {"Eitemüller", "Weston", "Kohse", "Pampam", "Zenner", "Hoppe", "Wille", "Beilfuß"};
		
		System.out.println("Vor dem Sortieren");
        System.out.println("----------------");		
		System.out.println("Vornamen");
		gibNamenAus(vornamen);		
		System.out.println("Nachnamen");
		gibNamenAus(nachnamen);		
		
		// Aufgabe eins
		vornamen = sortiereStrings(vornamen);
		nachnamen = sortiereStrings(nachnamen);
		
		System.out.println("Nach dem Sortieren");
        System.out.println("----------------");
		System.out.println("Vornamen");
		gibNamenAus(vornamen);		
		System.out.println("Nachnamen");
		gibNamenAus(nachnamen);

		// Aufgabe zwei
		String[] kombinationen = kombiniereStrings(vornamen, nachnamen); // Diese Methode musst du schreiben
		System.out.println("Kombinierte Namen");
        System.out.println("----------------");
		gibNamenAus(kombinationen);
		
		// Aufgabe drei
		berechneLaenge(kombinationen) // diese Methode muss du schreiben. Die Ausgabe der Laenge sollte dort erfolgen
		
		// Aufgabe vier
		String kuerzesterName = findeKuerzestenNamen(kombinationen); // Diese Methode musst du schreiben
		String laengsterName  = findeLaengstenNamen(kombinationen); // Diese Methode musst du schreiben
		System.out.println("Kürzester und längster Name");
        System.out.println("----------------");
		System.out.println(kuerzesterName + " (" + kuerzesterName.length() + " Zeichen)");
        System.out.println(laengsterName  + " (" + laengsterName.length()  + " Zeichen)");
		System.out.println();
		
		// Aufgabe fünf
		String[] sortierteKombinationen = sortiereBuchstaben(kombinationen); // Diese Methode musst du schreiben
		System.out.println("Nach dem Sortieren");
        System.out.println("----------------");		
		gibNamenAus(sortierteKombinationen);		
	}

	public static String[] sortiereStrings(String[] eingabeliste) {
        for (int i = 0; i < eingabeliste.length - 1; i++) {
            for (int j = i + 1; j < eingabeliste.length; j++) {
                if ( String1KleinerString2(eingabeliste[i],eingabeliste[j]) ) { // vergleicheStrings musst du schreiben
                   String temp = eingabeliste[i];
                    eingabeliste[i] = eingabeliste[j];
                    eingabeliste[j] = temp;
                }
            }
        }
        return eingabeliste;
    }
	
	public static void gibNamenAus(String[] eingabeliste) {		
		for(int i = 0; i < eingabeliste.length; i++) {
			System.out.print(" - ");
			System.out.println(eingabeliste[i]);
		}
		System.out.println();
	}
    
    public static boolean String1KleinerString2(String string1, String string2) {
        boolean ergebnis = false;
        // Hier deine Methode zum Herausfinden ob string1 < string2
        return ergebnis;
    }