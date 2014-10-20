public class LKW extends Strassenfahrzeuge{
    
    short anzahlAchsen = 2;
    short gesamtgewichtAchsen = 0;
    public int kg;
    
    
    public String artDesLKW (int kg, int gesamtgewichtAchsen ) {
	int anzahlDerAchsen = kg / gesamtgewichtAchsen;
	
	if (anzahlDerAchsen == 0) return "2 Achser"; 
	if (anzahlDerAchsen == 1) return "2 Achser";
	if (anzahlDerAchsen == 2) return "2 Achser";
	if (anzahlDerAchsen == 3) return "2 Achser+ Haenger";
	if (anzahlDerAchsen == 4) return "1 Sattelschlepper mit 1 Achse"; 
	if (anzahlDerAchsen == 5) return "1 Sattelschlepper mit 2 Achse";
	if (anzahlDerAchsen == 6) return "1 Sattelschlepper mit 3 Achse";
	if (anzahlDerAchsen == 7) return "1 Schwertransport mit Sicherung";
	return " Das zulaessige Gesamtgewicht ist ueberschritten!"; 
	    }
    
    public String lichtAn (boolean lichtStatus1) {
	boolean lichtStatus = licht;
	if (lichtStatus == true) return "an.";
	return "aus.";
	
    }	
}