package de.marco.stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {
	
	/**
	 *  Warum muss man es eigentlich so schreiben? 
	 *  "Stack<Integer> stack"  wenn doch aber auch "Stack stack" geht nur kommen dort dann Warnungen??????
	 *  
	 * @param stack
	 * @param zahl
	 */

	static void einfuegenStack(Stack<Integer> stack, int zahl) {
		stack.push(new Integer(zahl));
		System.out.println("push(" + zahl + ")");
		System.out.println("stack: " + stack);
	}

	static void vomStackAbarbeiten(Stack<Integer> stack) {
		System.out.print("pop -> ");
		Integer zahl = (Integer) stack.pop();
		System.out.println(zahl);
		System.out.println("stack: " + stack);
	}

	// Ganzzahlige Zufallszahlen zwischen >=x und <y
	public static int myRandom(int klein, int hoch) {
		return (int) (Math.random() * (hoch - klein) + klein);
	}

	public static void main(String args[]) {
		// hier wird angegeben wieviele Objekte auf dem Stack landen sollen
		int stackobj = 20;
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("stack: " + stack);
		System.out.println("Objekte auf dem Stack: " + stack.size());
		for (int i = 0; i <= stackobj; i++) {
			einfuegenStack(stack, myRandom(10, 100));
		}
		vomStackAbarbeiten(stack);
		System.out.println("Objekte auf dem Stack: " + stack.size());
		// ohne try-Block würde es eine EmptyStackException geben
		// so wird sie gefangen und verarbeitet
		try {
			for (int i = 0; i <= stackobj; i++) {
				vomStackAbarbeiten(stack);
			}
		} catch (EmptyStackException e) {
			System.out.println("Stack ist leer");
		}
	}
}