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
		
		if(b == null) {
			this.b = objB;
			objB.setLink(this);
			
		}
		
		
		//Variante Herr Bauer
		/*this.b = objB;
		
		if(objB.getLink() != this){
			objB.setLink(this);
		}*/
		
	}
}
