/**
 * 
 */
package de.marco.generics;

import javax.jws.WebResult;

/**
 * @Author Marco Hoppe
 */
public class MeineBox <T> {
	
	// der Typparameter wird verwendet, um den Datentyp von value noch offen zu halten
	private T value;

	// die Setter-Methode verwendet ebenfalls den Typparameter
	public void setValue(T wert) {
		this.value = wert;
	}
	
	// die Getter-Methode verwendet den Typparameterfür den Rückgabewert
	public T getValue() {
		return this.value;
	}
	
}
