public class Hausbautestlauf  {
	
	public static void main(String[] args) {
		Hausbau MFH = new Hausbau("Mehrfamilienhaus", "Satteldach", "Dachpappe", "Solarthermie",
					2.50, 20.00, 12.00, 4,1400.00);
		
		MFH.hausdaten();
		MFH.wohnflaechenBerechnung();
		
		Hausbau Bungalow  = new Hausbau();
		Bungalow.hausart = "Bungalow";
		Bungalow.dachform = "Spitzdach";
		Bungalow.dachfarbe = "Schwarz";
		Bungalow.heizung = "Erdwaerme";
		Bungalow.raumhoehe = 2.50;
		Bungalow.hauslaenge = 10.00;
		Bungalow.hausbreite = 10.00;
		Bungalow.etagen = 2;
		Bungalow.qmPreis = 1400.00;
		Bungalow.hausdaten();
		Bungalow.wohnflaechenBerechnung();
		
		Hausbau EFH  = new Hausbau();
		EFH.hausart = "Einfamilienhaus";
		EFH.dachform = "Schleppdach";
		EFH.dachfarbe = "Scharz-Gelb";
		EFH.heizung = "Solarthermie und Erdwaerme";
		EFH.raumhoehe = 2.50;
		EFH.hauslaenge = 10.00;
		EFH.hausbreite = 10.00;
		EFH.etagen = 2;
		EFH.qmPreis = 1600.00;
		EFH.hausdaten();
		EFH.wohnflaechenBerechnung();
		
		Hausbau eigentumswohnung  = new Hausbau();
		eigentumswohnung.hausart = "Eigentumswohnung";
		eigentumswohnung.raumhoehe = 2.50;
		eigentumswohnung.hauslaenge = 10.00;
		eigentumswohnung.hausbreite = 10.00;
		eigentumswohnung.etagen = 1;
		eigentumswohnung.qmPreis = 1400.00;
		eigentumswohnung.hausdaten();
		eigentumswohnung.wohnflaechenBerechnung();
		
		Hausbau sommerhaus  = new Hausbau();
		sommerhaus.hausart = "Sommerhaus";
		sommerhaus.dachform = "Spitzboden";
		sommerhaus.dachfarbe = "Rot";
		sommerhaus.heizung = "Durchlauftherme";
		sommerhaus.raumhoehe = 2.00;
		sommerhaus.hauslaenge = 5.00;
		sommerhaus.hausbreite = 10.00;
		sommerhaus.etagen = 2;
		sommerhaus.qmPreis = 800.00;
		sommerhaus.hausdaten();
		sommerhaus.wohnflaechenBerechnung();
		
/*		System.out.println("Die Wohnflaeche betraegt: "+ eins.getWohnflaecheQM() + " qm");
		System.out.println("Die Wohnflaeche betraegt: "+ eins.getWohnflaecheCCM() + " qqm");
		System.out.println("");
		System.out.println("Die Kosten betragen ca.: "+ eins.getWohnflaecheQM()* eins.qmPreis + " Euro");*/

	
	}
}