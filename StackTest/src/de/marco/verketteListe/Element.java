package de.marco.verketteListe;

public class Element {

		private Object element;
		private Element next;
	
	public Element() {
		this(null,null);
		
	}

	/**
	 * @param object
	 * @param object2
	 */
	public Element(Object e, Element n) {
		element = e;
		next = n;
	}
	
	public Element(Object e) {
		element = e;
		next = null;
	}
	
	public Object getObj() {
        return element;
    } 
	
	Object getElement(){
		return element;
	}
	
	Element getNext(){
		return next;
	}
	
	void setElement(Object newElement){
		element = newElement;
	}
	
	void setNext(Element newNext){
		next = newNext;
	}
	
	

}
