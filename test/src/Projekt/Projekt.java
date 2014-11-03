public class Projekt {

	private String name;
	private Arbeitspaket[]GUI;
	private Arbeitspaket[]Programmieren;
	private Arbeitspaket[]Tester;
	
	
	public String getName() {
		return this.name;
	}
	
	public void setName( String name ){
		this.name = name;
	}
	
	public int getAnzahlApTester() {
		return GUI.length + Programmieren.length;
	}
	
	public int getAnzahlApGesamt() {
		return (this.GUI.length + this.Programmieren.length)+getAnzahlApTester();
	}
	
	public Projekt(String name,int APProgrammieren,int APGUI) {
		this.name = name;
		GUI = new Arbeitspaket[APGUI];
		Programmieren = new Arbeitspaket[APProgrammieren];
		Tester = new Arbeitspaket[getAnzahlApTester()];
	}
	
	public int fortschrittGUI() {
		return rechneFortschrittArbeitspakete(GUI);	
	}
	
	public int fortschrittProgrammieren() {
		return rechneFortschrittArbeitspakete(Programmieren);
	
	}
	
	public int fortschrittTesten() {
		return rechneFortschrittArbeitspakete(Tester);	
	}
	
	private int rechneFortschrittArbeitspakete(Arbeitspaket[] arbeitspakete) {		
		int istAP = 0;
		int fortschritt = 0;
		for (int i=0; i< arbeitspakete.length; i++){
				if (arbeitspakete[i].gefuellt() == true)
				istAP++;
		}
		fortschritt = (istAP/arbeitspakete.length)*100;
		return fortschritt;
	}
	 
	
}