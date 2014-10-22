package de.marco;

public class KlasseC {

	// Referenz auf ein Objekt der KlasseD
	private KlasseD [] raeder = new KlasseD[] {null,null,null,null};
	
	
	
	/**
	 * stellt die Beziehung zum Objekt der KlasseB her und 
	 * fordert das Objekt der KlasseB auf, eine Beziehung
	 * zum sich(this) herzustellen
	 * 
	 * @param objB
	 */
	public void setLink(KlasseD objD){
		
		for(int i=0; i<4;i++){
			if(this.raeder[i] != null && this.raeder[i] !=objD){
				this.raeder[i].removeLink(this);
			}
		
		//prüfen, dass wir nicht wechselseitig, endlos setLink aufrufen
			this.raeder[i] = objD;
			if(objD.getLink() != this) {		
				objD.setLink(this);
			}
		}
	}
	
	public KlasseD getLink() {
		// TODO Auto-generated method stub
		for(int i=0; i<4;i++){
				return this.raeder[i];
			}
		return null;
		
	}
	
	public void removeLink(KlasseD objD) {
		for(int i=0; i<4;i++){
			if(this.raeder[i] != objD){
				return;
			}
			KlasseD tmp = this.raeder[i];
			this.raeder[i] = null;
			if(this == tmp.getLink()){
				tmp.removeLink(this);
			}
		}
	}
}
