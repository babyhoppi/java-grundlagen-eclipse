package de.marco.adapterPattern;

public class Automobile {
	
	private int kilometerstand = 0;
	
	private String farbe = "";
	
	private String hersteller = "";
	
	private int hoechstGeschwindigkeit = 0;
	
	public Automobile(String h,String f, int k, int vmax) {
		
		this.hersteller = h;
		this.farbe = f;
		this.kilometerstand = k;
		this.hoechstGeschwindigkeit = vmax;
		
	}
	
	public int getKilometerstand(){
		return this.kilometerstand;
	}
	
	public String getHersteller(){
		return this.hersteller;
	}
	public String getFarbe(){
		return this.farbe;
	}
	public int getHoechstGeschwindigkeit(){
		return this.hoechstGeschwindigkeit;
	}

}
