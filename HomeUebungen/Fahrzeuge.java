public class Fahrzeuge {

    short  kmH = 0;
    String model = "";
    static double verbrauch = 0.0;
    boolean licht = false;
    String art = "";
    String lichtStatus = "";
    static double tankinhalt = 0.0;
    static double tankgroesse = 0.0;
    static double entfernung = 0.0;
    final String SpritmengeString = "Die benoetigte Spritmenge bei einem Verbrauch von: ";
    static double anzahlDerTankfuellungen = 0;
     
    
    /**
     * @param args
     */
    public static void main(String[] args) {
	
	System.gc();
	// Erstellung eines Okjektes Lkw des Typen LKW
	LKW Lkw = new LKW();
	Lkw.kg = 1500;
	Lkw.gesamtgewichtAchsen = 280;
	Lkw.anzahlAchsen = 0;
	Lkw.kmH = 90;
	Fahrzeuge.entfernung=1500;
	Lkw.licht = true;
	Lkw.lichtStatus = Lkw.lichtAn(Lkw.licht);
	Lkw.artDesLKW(Lkw.kg, Lkw.gesamtgewichtAchsen);
	Fahrzeuge.verbrauch =13.5;
	Fahrzeuge.tankgroesse = 400;
	Lkw.model = "Mercedes Actros";
	Lkw.art = Lkw.artDesLKW(Lkw.kg, Lkw.gesamtgewichtAchsen);
	Lkw.benoetigteSpritmenge(verbrauch, entfernung);
	Fahrzeuge.anzahlDerTankfuellungen(tankgroesse, tankinhalt);
	Lkw.DatenLKW();
	// Erstellung eines Okjektes Pkw des Typen PKW
	PKW Pkw = new PKW();
	Pkw.anzahlPersonen= 3;
	Pkw.art = Pkw.artDesPKW2(Pkw.anzahlPersonen);
	Pkw.model= "VW Bus";
	Pkw.lichtStatus = Pkw.lichtAn(false); // auslassen der Variable Licht
	Fahrzeuge.verbrauch = 8.5;
	Fahrzeuge.entfernung = 1200;
	Fahrzeuge.tankgroesse = 60;
	Fahrzeuge.tankinhalt = Pkw.benoetigteSpritmenge(verbrauch, entfernung);
	Fahrzeuge.anzahlDerTankfuellungen = Fahrzeuge.anzahlDerTankfuellungen(tankgroesse, tankinhalt);
	Pkw.kmH = 190;
	Pkw.DatenPKW();
	
    }
    
   void DatenPKW() {
       System.out.println("Die Daten zum PKW:");
	System.out.println("");
	System.out.println("Die Hoechstgeschwindigkeit betraegt: "+this.kmH+" km/h");
	System.out.println("Tankinhalt: "+Fahrzeuge.tankinhalt+ " Liter");
	System.out.println("Tankgroesse: "+Fahrzeuge.tankgroesse+ " Liter");
	System.out.println("Der Verbrauch liegt bei : "+Fahrzeuge.verbrauch + " Liter auf 100 km.");
	System.out.println("Das Model ist ein: "+this.model);
	System.out.println("Es wird ein: "+this.art + " benoetigt.");
	System.out.println("Das Licht ist: " + this.lichtStatus);
	System.out.println(SpritmengeString +Fahrzeuge.verbrauch+ " Liter je 100 km und einer Entfernung von: "+Fahrzeuge.entfernung+ " km ist: " +
				+Fahrzeuge.tankinhalt+ " Liter.");
	System.out.println("Sie muessten: "+anzahlDerTankfuellungen+" tanken.");
	
   }
    
    void DatenLKW() {
	System.out.println("Die Daten zum LKW:");
	System.out.println("");
	System.out.println("Die Hoechstgeschwindigkeit betraegt: "+this.kmH+" km/h");
	System.out.println("Der Verbrauch liegt bei : "+Fahrzeuge.verbrauch + " Liter auf 100 km.");
	System.out.println("Das Model ist ein: "+this.model);
	System.out.println("Tankinhalt: "+Fahrzeuge.tankinhalt+ " Liter");
	System.out.println("Tankgroesse: "+Fahrzeuge.tankgroesse+ " Liter");
	 System.out.println("Es wird ein: "+this.art + " benoetigt.");
	System.out.println("Das Licht ist: " +this.lichtStatus);
	System.out.println(SpritmengeString +Fahrzeuge.verbrauch+ " Liter je 100 km und einer Entfernung von: "+Fahrzeuge.entfernung+ " km ist: " +
				+Fahrzeuge.tankinhalt+ " Liter.");
	System.out.println("Sie muessten: "+anzahlDerTankfuellungen+" tanken.");
	System.out.println("");
	
	
    }
    
    public double benoetigteSpritmenge (double verbrauch, double entfernung  ) {
	tankinhalt = (entfernung/100)*verbrauch;
	tankinhalt = Math.round(tankinhalt * 100)/100.;
   	return  tankinhalt;
   	
   	//return tankinhalt = Math.round(tankinhalt * 100)/100.; // einfache Schreibweise	
    }
    
    public static double anzahlDerTankfuellungen(double tankgroesse, double tankinhalt) {
	anzahlDerTankfuellungen  = tankinhalt/tankgroesse;
	return anzahlDerTankfuellungen = Math.round(anzahlDerTankfuellungen * 1)/1;
    }    
}
