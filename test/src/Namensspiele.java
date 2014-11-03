import java.util.Arrays;
import java.util.*;
import java.text.Collator;
import java.util.Comparator;
import java.io.*;
import java.lang.String;

class Namensspiele{
	
	public static void main (String [] args) {
		
		// Startlisten
		String[] vornamen =  {"Joerg", "Alex", "Matthias", "Fabian", "Ulrike", "Marco", "Thomas", "Louise"};		
		String[] nachnamen = {"Eitemueller", "Weston", "Kohse", "Pampam", "Zenner", "Hoppe", "Wille", "Beilfuss"};
		
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
		String[] kombinationen = kombiniere(vornamen, nachnamen); // Diese Methode musst du schreiben
		System.out.println("Kombinierte Namen");
        System.out.println("----------------");
		gibNamenAus(kombinationen);
		
		// Aufgabe drei
//		berechneLaenge(kombiniere) // diese Methode muss du schreiben. Die Ausgabe der Laenge sollte dort erfolgen
		
		// Aufgabe vier
		String kuerzesterName = findeKuerzestenNamen(kombinationen); // Diese Methode musst du schreiben
		String laengsterName  = findeLaengstenNamen(kombinationen); // Diese Methode musst du schreiben
		System.out.println("Kuerzester und laengster Name");
        System.out.println("----------------");
		System.out.println(kuerzesterName + " (" + kuerzesterName.length() + " Zeichen)");
	    System.out.println(laengsterName  + " (" + laengsterName.length()  + " Zeichen)");
		System.out.println();
		
/*		// Aufgabe fünf
		String[] sortierteKombinationen = sortiereBuchstaben(kombiniere); // Diese Methode musst du schreiben
		System.out.println("Nach dem Sortieren");
        System.out.println("----------------");		
		gibNamenAus(sortierteKombinationen);	*/
	}

	public static String[] sortiereStrings(String[] eingabeliste) {
        for (int i = 0; i < eingabeliste.length - 1; i++) {
            for (int j = i + 1; j < eingabeliste.length; j++) {
                if ( String1kleinerString2(eingabeliste[i],eingabeliste[j]) ) { // vergleicheStrings musst du schreiben
                   String temp = eingabeliste[i];
                    eingabeliste[i] = eingabeliste[j];
                    eingabeliste[j] = temp;
                }
            }
        }
        return eingabeliste;
    }
   
   	public static boolean String1kleinerString2(String vornamen, String nachnamen) {
        for (int i = 0; i < vornamen.length() && i < nachnamen.length(); i++) {
            if (vornamen.charAt(i) != nachnamen.charAt(i)) {
                return vornamen.charAt(i) > nachnamen.charAt(i);
            }
        }
        return vornamen.length() < nachnamen.length();
    }
    
	
	public static void gibNamenAus(String[] eingabeliste) {		
		for(int i = 0; i < eingabeliste.length; i++) {
			System.out.print(" - ");
			System.out.println(eingabeliste[i]);
		}
		System.out.println();
	}
	
	private static String[] kombiniere(String[] vornamen, String[] nachnamen) {
		String[] kombinationen =new String[vornamen.length * nachnamen.length];
		int k=0;
        for (int i = 0; i < vornamen.length; i++) {
        	for (int j = 0; j < nachnamen.length; j++){
        		kombinationen[k++]= vornamen[i]+" "+ nachnamen[j]+" "+ (vornamen[i].length()+nachnamen[j].length()+1);
        	}
            
        }
        return kombinationen;
    }    
    
    private static String findeKuerzestenNamen(String[] kombinationenAusNamen) {
		String kuerzesterName= kombinationenAusNamen[0];
		
		for (int i = 1; i < kombinationenAusNamen.length; i++) {
        	if (  (kuerzesterName.length() > kombinationenAusNamen[i].length()) ) {
        	   	kuerzesterName = kombinationenAusNamen[i];                  
            }
        }
        return kuerzesterName;
	}
	
	private static String findeLaengstenNamen(String[] kombinationenAusNamen) {
		String laengsterName= kombinationenAusNamen[0];
		
		for (int i = 1; i < kombinationenAusNamen.length; i++) {
        	if (  (laengsterName.length() < kombinationenAusNamen[i].length()) ) {
        	   	laengsterName = kombinationenAusNamen[i];                  
            }
        }
        return laengsterName;
	}
	
	
}