package hallowelt;

public abstract class AbstrakteKlasseA {
	
	protected int deineZahl;
	
	/**
	 * @param deineZahl
	 */
	protected AbstrakteKlasseA(int deineZahl) {
		super();
		this.deineZahl = deineZahl;
	}
	
	//abstrakte Methoden, die in den abgeleiteten Klassen implementiert werden muss

	abstract void ausgeben();

}
