package de.marco;

public class KlasseD {

	// Referenz auf ein Objekt der KlasseA
	private KlasseC c = null;
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
	public void setLink(KlasseC objC){
		
		for(int i=0; i<4;i++){
			if(this.c != null && this.c !=objC){
				this.c.removeLink(this);
			}
		
		//prüfen, dass wir nicht wechselseitig, endlos setLink aufrufen
			this.c = objC;
			if(objC.getLink() != this) {	
				objC.setLink(this);
			}
		}
	}
	
	public KlasseC getLink() {
		// TODO Auto-generated method stub
		return this.c;
	}
	
	public void removeLink(KlasseC objC) {
		if(this.c != objC){
			return;
		}
		KlasseC tmp = this.c;
		this.c = null;
		if(this == tmp.getLink()){
			tmp.removeLink(this);
		}
	}
}
