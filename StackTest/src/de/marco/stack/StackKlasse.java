/**
 * 
 */
package de.marco.stack;

import java.util.EmptyStackException;

/**
 * @Author Marco Hoppe
 */
public class StackKlasse {

	/**
	 * 
	 */
	public StackKlasse() {
	}
	
	static void einfuegenStack(EigeneStackKlasse stack, int zahl) {
		stack.push(new Integer(zahl));
		System.out.println("push(" + zahl + ")");
		System.out.println("stack: " + stack);
	}

	static void vomStackAbarbeiten(EigeneStackKlasse stack) {
		System.out.print("pop -> ");
		Integer zahl = stack.top();
		System.out.println(zahl);
		stack.pop();
		System.out.println("stack: " + stack);
	}
	
	static void alleAbarbeiten(EigeneStackKlasse stack, int stackobj) {
		try {
			for (int i = 1; i <= stackobj; i++) {
				vomStackAbarbeiten(stack);
			}
		} catch (EmptyStackException e) {
			System.out.println("Stack ist leer");
		}
	}
	
	static void einfuegenStackZufall(EigeneStackKlasse stack, int stackobj) {
		for (int i = 0; i <= stackobj; i++) {
			einfuegenStack(stack, StackKlasse.myRandom(10, 100));
		}
	}

	// Ganzzahlige Zufallszahlen zwischen >=x und <y
	public static int myRandom(int klein, int hoch) {
		return (int) (Math.random() * (hoch - klein) + klein);
	}
	
	

}
