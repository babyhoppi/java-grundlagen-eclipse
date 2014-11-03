class Film {
	String titel;
	String genre;
	int bewertung;
	

	public Film (){
		bewertung = 0;
		titel = "Leider ist kein Titel hinterlegt";
		genre = "Es wurde keine Genre angegeben";
	}	
/*	public Film (int bewertung){
		this.bewertung = bewertung;
		this.titel = titel;
		this.genre = genre;
		}*/
	public Film(String titel, String genre, int bewertung){
		this.titel=titel;
		this.genre=genre;
		this.bewertung=bewertung;
		}	
	void vorfuehren() {
		System.out.println("Die Daten zum Film:");
		System.out.println("Der Titel: "+this.titel);
		System.out.println("Die Kategorie: "+this.genre);
		System.out.println("Die Bewertung: "+this.bewertung);	
		System.out.println("");
	}
}

