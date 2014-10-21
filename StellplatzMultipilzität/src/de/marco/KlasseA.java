package de.marco;

public class KlasseA {

	// Referenz auf ein Objekt der KlasseA
	private KlasseB b = null;
	
	/**
	 * stellt die Beziehung zum Objekt der KlasseB her und 
	 * fordert das Objekt der KlasseB auf, eine Beziehung
	 * zum sich(this) herzustellen
	 * 
	 * @param objB
	 */
	public void setLink(KlasseB objB){
		
		if(objB.getLink() != this) {
			this.b = objB;	
			objB.setLink(this);
		}
	}
	
	public KlasseB getLink() {
		// TODO Auto-generated method stub
		return this.b;
	}
	
	public void removeLink(KlasseB objB) {
		if(this.b != objB){
			return;
		}
		KlasseB tmp = this.b;
		this.b = null;
		if(this == tmp.getLink()){
			tmp.removeLink(this);
		}
	}
}
