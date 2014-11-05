package de.marco.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Marco Hoppe
 */
public class EigeneStackKlasse {

	List<Integer> stackList;
	int groesse = -1;

	public EigeneStackKlasse() {
		stackList = new ArrayList();
	}

	void push(Integer i) {
		groesse++;
		stackList.add(i);
	}

	void pop() {
		stackList.remove(groesse);
		groesse--;
	}

	Integer top() {
		return stackList.get(groesse);
	}

	boolean isEmpty() {
		if (groesse >= 0) {
			return false;
		} else {
			return true;
		}
	}

	EigeneStackKlasse copy() {
		EigeneStackKlasse sOut = new EigeneStackKlasse();
		EigeneStackKlasse sTab = new EigeneStackKlasse();
		while (!this.isEmpty()) {
			sTab.push(this.top());
			this.pop();
		}
		while (!sTab.isEmpty()) {
			this.push(sTab.top());
			sOut.push(sTab.top());
			sTab.pop();
		}
		return sOut;
	}

	void out() {
		while (!this.isEmpty()) {
			System.out.println(this.top());
			this.pop();
		}
	}
	public String toString() {
		if(stackList.size() != 0){
		return stackList + ",";
		}
		return "Die Stackliste ist leer.";
	}
}
