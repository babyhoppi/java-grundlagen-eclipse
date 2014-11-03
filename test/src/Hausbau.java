class Hausbau {
	String hausart;
	String dachform;
	String dachfarbe;
	String heizung;
	double raumhoehe;
	double hauslaenge;
	double hausbreite;
	double etagen;
	double qmPreis;
	double Anzahl;
	
	
	
	
	public Hausbau(){
		hausart = "";
		dachform = "Es wurde keine Dachform ausgewaehlt";
		dachfarbe = "Es wurde keine Dachfarbe ausgewaehlt";
		heizung = "Es wurde keine Heizung ausgewaehlt";
		raumhoehe = 0.00;
		hauslaenge = 0.00;
		hausbreite = 0.00;
		etagen = 0.00;
		qmPreis = 0.00;
		Anzahl = qmPreis + etagen;
	}
	
//	public Hausbau(String hausart, String dachform){
//		Hausbau(hausart, dachform, "Es wurde keine Dachfarbe ausgewaehlt","Es wurde keine Heizung ausgewaehlt", 0.00, 0.00, 0.00, 0.00, 0.00 );
		
//	}
	
	public Hausbau(String hausart, String dachform, String dachfarbe, String heizung,
					double raumhoehe, double hauslaenge, double hausbreite, double etagen, double qmPreis){
		
		this.hausart=hausart;
		this.dachform=dachform;
		this.dachfarbe=dachfarbe;
		this.heizung=heizung;
		this.raumhoehe=raumhoehe;
		this.hauslaenge=hauslaenge;
		this.hausbreite=hausbreite;
		this.etagen=etagen;
		this.qmPreis=qmPreis;
	}
		
	void hausdaten () {
		System.out.println("Die Daten zum Haus:");
		System.out.println("");
		System.out.println("Die Hausart ist: "+this.hausart);
		System.out.println("Die Dachform: "+this.dachform);
		System.out.println("Die Dachfarbe: "+this.dachfarbe);
		System.out.println("Die Heizung: "+this.heizung);
		System.out.println("Die Raumhoehe: "+this.raumhoehe);
		System.out.println("Die Hauslaenge: "+this.hauslaenge);
		System.out.println("Die Hausbreite: "+this.hausbreite);
		System.out.println("Die Anzahl der Etagen: "+this.etagen);
		System.out.println("Der qm-Preis liegt bei: "+this.qmPreis);	
		System.out.println(" ");}
		
	void wohnflaechenBerechnung () {	
		System.out.println("Die Wohnflaeche betraegt: "+ this.getWohnflaecheQM() + " qm");
		System.out.println("Die Wohnflaeche betraegt: "+ this.getWohnflaecheCCM() + " qqm");
		System.out.println("");
		System.out.println("Die Kosten betragen ca.: "+ this.getWohnflaecheQM()* this.qmPreis + " Euro");
		System.out.println(" "+ this.getAnzahl());
	}
	public double getWohnflaecheQM()
	{
		return (this.hauslaenge * this.hausbreite) * this.etagen;
	}
	public double getWohnflaecheCCM()
	{
		return (this.hauslaenge * this.hausbreite * this.raumhoehe) * this.etagen;
	}
		public double getAnzahl()
	{
		return (this.qmPreis + this.etagen);
	}









}