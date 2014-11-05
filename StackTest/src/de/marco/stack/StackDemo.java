package de.marco.stack;

import java.util.Stack;

public class StackDemo {
	
	/**
	 *  Warum muss man es eigentlich so schreiben? 
	 *  "Stack<Integer> stack"  wenn doch aber auch "Stack stack" geht nur kommen dort dann Warnungen??????
	 *  
	 * @param stack
	 * @param zahl
	 */

	public static void main(String args[]) {
		// hier wird angegeben wieviele Objekte auf dem Stack landen sollen
		int stackobj = 20;
		EigeneStackKlasse stack = new EigeneStackKlasse();
		System.out.println("stack: " + stack);
		System.out.println("Objekte auf dem Stack: " + stack.groesse);
		StackKlasse.einfuegenStackZufall(stack, stackobj);
		StackKlasse.vomStackAbarbeiten(stack);
		System.out.println("Objekte auf dem Stack: " + stack.toString());
		// ohne try-Block würde es eine EmptyStackException geben
		// so wird sie gefangen und verarbeitet
		StackKlasse.alleAbarbeiten(stack, stackobj);
	}
	
	
}