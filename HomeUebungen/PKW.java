public class PKW extends Strassenfahrzeuge{
    
    short anzahlPersonen = 2;
    public int kg;
    
    
    public String artDesPKW (int anzahlDerPersonen ) {
		
	if (anzahlDerPersonen == 1) return "2 Sitzer oder 4 Sitzer";
	if (anzahlDerPersonen == 2) return "2 Sitzer oder 4 Sitzer";
	if (anzahlDerPersonen == 3) return "4 Sitzer";
	if (anzahlDerPersonen == 4) return "4 Sitzer"; 
	if (anzahlDerPersonen == 5) return "7 Sitzer";
	if (anzahlDerPersonen == 6) return "7 Sitzer";
	if (anzahlDerPersonen == 7) return "7 Sitzer";
	return " Sie benötigen einen Bus mit 12 Sitzen!"; 
	    }
    
    public String artDesPKW2 (int anzahlDerPersonen) {
	String ausgabe = "";
	switch (anzahlDerPersonen) {
	case 1:ausgabe = "2 Sitzer oder 4 Sitzer"; break;
	case 2:ausgabe = "2 Sitzer"; break;
	case 3:ausgabe = "2 Sitzer mit Notsitz"; break;
	case 4:ausgabe = "4 Sitzer"; break;
	case 5:ausgabe = "7 Sitzer"; break;
	case 6:ausgabe = "7 Sitzer"; break;
	case 7:ausgabe = "7 Sitzer"; break;
	default: ausgabe = " Sie benötigen einen Bus mit 12 Sitzen!";
	
	}
	return ausgabe;
    }
    
    
    public String lichtAn (boolean lichtStatus1) {
	boolean lichtStatus = licht;
	if (lichtStatus == true) return "an.";
	return "aus.";
    } 
	
}