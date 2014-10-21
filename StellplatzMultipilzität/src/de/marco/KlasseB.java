package de.marco;

public class KlasseB {

	// Referenz auf ein Objekt der KlasseA
	private KlasseA a = null;
	
	/**
	 * stellt die Beziehung zum Objekt der KlasseA her und 
	 * fordert das Objekt der KlasseA auf, eine Beziehung
	 * zum sich(this) herzustellen
	 * 
	 * @param objB
	 */
	/**
	 * @param objA
	 */
	public void setLink(KlasseA objA){
		
		
		//prüfen, dass wir nicht wechselseitig, endlos setLink aufrufen
		if(a == null) {
			this.a = objA;
			objA.setLink(this);
		}
		//Variante Herr Bauer
		/*this.a = objA;
		if(objA.getLink() != this){
			objA.setLink(this);
		} */
	}
}
