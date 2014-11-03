/**
 * 
 */
package de.marco.composite;

/**
 * @Author Marco Hoppe
 */
public class DebuggerSMS extends AbstrakteKomponente {

	
	/* (non-Javadoc)
	 * @see de.marco.composite.AbstrakteKomponente#methodeA()
	 */
	@Override
	public void methodeA() {
		//  hier "versenden" wir dann die SMS
		System.out.println("SMS an den Admin von: " +this.getClass().getSimpleName());
		
	}

}
