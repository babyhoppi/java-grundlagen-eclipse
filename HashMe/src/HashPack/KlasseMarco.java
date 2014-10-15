/**
 * 
 */
package HashPack;

/**
 * @Author Marco Hoppe
 */
public class KlasseMarco {
	
	private int startWert;
	private int meinHashCodeWert;
	private int attributA;
	private long attributB;
	private String attributC;
	
	//Standardkonstruktor
	public KlasseMarco() {
		// TODO Auto-generated constructor stub
		this.startWert = 19;
	}
	
	//parameterbehafteter Konstruktor
	public KlasseMarco(int attributA) {
		// TODO Auto-generated constructor stub
		this.attributA = attributA;
	}
	
	public KlasseMarco(long attributB) {
		// TODO Auto-generated constructor stub
		this.attributB = attributB;
	}
	
	public KlasseMarco(String attributC) {
		// TODO Auto-generated constructor stub
		this.attributC = attributC;
	}
	
	// da uns die "Ausgabe" via Object.toSring() missfällt, **überschreiben**
	// wir diese Methode
	
	@Override
	public String toString() {
		return "Die Klasse " + this.getClass().getSimpleName()+ " sagt: " + this.attributA;
	}
	
	@Override
	public boolean equals(Object obj){
		// Reflexivität
		if(this == obj)
			return false;
		
		//der Vergleich mit null muss FALSE liefern
		if(obj == null)
			return false;
		
		//Test auf Vergleichbarakeit
		if(this.getClass() != obj.getClass())
		return false;

		// Test **aller** Attribute
		if(this.attributA !=((KlasseMarco)obj).attributA)
			return false;
		
		// nach dem Test aller Attribute steht die Gleichheit fest
		return true;
	}
	
	@Override
	public int hashCode(){
		// Startwert = 59 * unserer Zahl(1000) + 17(Einer wilkürlichen Zahl)
		meinHashCodeWert = 59 + (int)(this.attributA)+17;
		meinHashCodeWert = 59 + meinHashCodeWert + (int)(this.attributB ^ (this.attributB>>>32));
		meinHashCodeWert = 59 + meinHashCodeWert + this.attributC.hashCode();
		return meinHashCodeWert & 0x7FFFFFFF;
		
	}

}
