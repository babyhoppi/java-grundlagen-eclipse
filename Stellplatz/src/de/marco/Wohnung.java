package de.marco;

public class Wohnung {
private Stellplatz stellplatz;

	public Wohnung() {
		super();
	}
	
	public Wohnung(Stellplatz stellplatz) {
		super();
		this.stellplatz = stellplatz;
	}

	public void setLink(Stellplatz stellplatz){
		this.stellplatz = stellplatz;
	}
	
	public void removeLink(){
		this.stellplatz = null;
	}
	
	public Stellplatz getLink(){
		return this.stellplatz;
	}

}
