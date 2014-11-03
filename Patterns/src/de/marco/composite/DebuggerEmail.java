/**
 * 
 */
package de.marco.composite;

/**
 * @Author Marco Hoppe
 */
public class DebuggerEmail extends AbstrakteKomponente {

	
	/* (non-Javadoc)
	 * @see de.marco.composite.AbstrakteKomponente#methodeA()
	 */
	@Override
	public void methodeA() {
		// hier "versenden wir dann die E-Mail
		System.out.println("Email an den Chef von: " +this.getClass().getSimpleName());
	}

}
