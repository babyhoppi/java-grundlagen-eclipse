/**
 * 
 */
package hallowelt;

/**
 * @author platz
 *
 */
public class KlasseC extends AbstrakteKlasseA {
	
	

	/**
	 * @param deineZahl
	 */
	protected KlasseC(int deineZahl) {
		super(deineZahl);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see hallowelt.AbstrakteKlasseA#ausgeben()
	 */
	@Override
	void ausgeben() {
		// TODO Auto-generated method stub
		System.out.println(this.deineZahl);

	}

}
