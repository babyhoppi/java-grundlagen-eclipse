/**
 * 
 */
package de.marco.verketteListe;

/**
 * @Author Marco Hoppe
 */
public class VerketteListe {

	Element startElement = new Element(0, null);

	public VerketteListe() {
	}

	public void hinzufuegen(Object o) {
		Element neuesElement = new Element(o);
		Element letztesElement = getLetztesElement();
		letztesElement.setNext(neuesElement);
	}

	public Element getErstesElement() {
		return startElement;
	}

	public Element getLetztesElement() {
		Element element = startElement;
		while (element.getNext() != null) {
			element = element.getNext();
		}
		return element;
	}

	public void einfuegenDanach(Object o, Object neuesObj) {
		Element neuesElement;
		Element nextesElement;
		Element gesuchtesElement;
		gesuchtesElement = startElement.getNext();
		while (gesuchtesElement != null && !gesuchtesElement.getObj().equals(o)) {
			gesuchtesElement = gesuchtesElement.getNext();
		}
		neuesElement = new Element(neuesObj);
		nextesElement = gesuchtesElement.getNext();
		gesuchtesElement.setNext(neuesElement);
		neuesElement.setNext(nextesElement);
	}

	public void entfernen(Object o) {
		Element element = startElement;
		while (element.getNext() != null && !element.getObj().equals(o)) {
			if (element.getNext().getObj().equals(o)) {
				if (element.getNext().getNext() != null)
					element.setNext(element.getNext().getNext());
				else {
					element.setNext(null);
					break;
				}
			}
			element = element.getNext();
		}
	}

	public void ausgebenDerListe() {
		Element element = startElement;
		while (element != null) {
			System.out.println(element.getObj());
			element = element.getNext();
		}
	}
}
