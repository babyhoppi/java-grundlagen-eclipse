/**
 * 
 */
package de.marco.objektklasse;

/**
 * @Author Marco Hoppe
 */
public class KlasseMarco {
	
	private int meinWert;
	
	
	//Standardkonstruktor
	public KlasseMarco() {
		// TODO Auto-generated constructor stub
		this.meinWert = 0;
	}
	
	//parameterbehafteter Konstruktor
	public KlasseMarco(int meinWert) {
		// TODO Auto-generated constructor stub
		this.meinWert = meinWert;
	}
	
	// da uns die "Ausgabe" via Object.toSring() missf�llt, **�berschreiben**
	// wir diese Methode
	
	@Override
	public String toString() {
		return "Die Klasse " + this.getClass().getSimpleName()+ " sagt: " + this.meinWert;
	}
	
	@Override
	public boolean equals(Object obj){
		// Reflexivit�t
		if(this == obj)
			return false;
		
		//der Vergleich mit null muss FALSE liefern
		if(obj == null)
			return false;
		
		//Test auf Vergleichbarakeit
		if(this.getClass() != obj.getClass())
		return false;

		// Test **aller** Attribute
		if(this.meinWert !=((KlasseMarco)obj).meinWert)
			return false;
		
		// nach dem Test aller Attribute steht die Gleichheit fest
		return true;
	}
	
	@Override
	public int hashCode(){
		// Startwert = 59 * unserer Zahl(1000) + 17(Einer wilk�rlichen Zahl)
		return 59 + (int)(this.meinWert)+17;
	}

}
