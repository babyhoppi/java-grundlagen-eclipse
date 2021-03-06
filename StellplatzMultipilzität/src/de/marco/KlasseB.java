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
		
		if(this.a != null && this.a !=objA){
			this.a.removeLink(this);
		}
		
		//pr�fen, dass wir nicht wechselseitig, endlos setLink aufrufen
		this.a = objA;
		if(objA.getLink() != this) {	
			objA.setLink(this);
		}
	}
	
	public KlasseA getLink() {
		// TODO Auto-generated method stub
		return this.a;
	}
	
	public void removeLink(KlasseA objA) {
		if(this.a != objA){
			return;
		}
		KlasseA tmp = this.a;
		this.a = null;
		if(this == tmp.getLink()){
			tmp.removeLink(this);
		}
	}
}
