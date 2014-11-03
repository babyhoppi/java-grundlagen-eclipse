package de.marco.array;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class MainApp {
	public static List<String> test = new ArrayList<String>();
	public static final String KONSTANTE_STRING_1 = "Ausgabe der aktuellen Liste ";
	public static final int KONSTANTE_INT_1EINTRAG = test.indexOf(test)+1;

	public static void main(String[] args) {

		test.add("ALTER ANFANG");
		test.add("in");
		test.add("der");
		test.add("ALTE MITTE");
		test.add("und");
		test.add("am");
		test.add("ALTES ENDE");

		// Ein Objekt oder Element am ANFANG löschen und wieder hinzufügen
		System.out.println("_________________NEUER ANFANG_________________");
		System.out.println(KONSTANTE_STRING_1 + "mit alten Eintrag am Angfang: "+test);
		System.out.println("Der Eintrag: "+test.get(0) + " soll gelöscht werden.");
		test.remove(KONSTANTE_INT_1EINTRAG);
		System.out.println(KONSTANTE_STRING_1 + "ohne den ersten Eintrag: "+test);
		test.add(KONSTANTE_INT_1EINTRAG, "NEUER ANFANG");
		System.out.println("Der Eintrag: "+test.get(0) + " wurde hizugefügt.");
		System.out.println("Ausgabe der aktuellen Liste mit neuem Eintrag am Angfang: "+test);

		// Ein Objekt oder Element in der MITTE löschen und wieder hinzufügen
		System.out.println("_________________NEUE MITTE_________________");
		System.out.println(KONSTANTE_STRING_1 + " mit alten Eintrag in der Mitte: "+test);
		System.out.println("Der Eintrag: "+test.get(test.size() / 2) + " soll gelöscht werden.");
		test.remove(test.size() / 2); // damit man die Mitte findet ;-)
		System.out.println(KONSTANTE_STRING_1 + " ohne den alten Eintrag in der Mitte: "+test);
		test.add(test.size() / 2, "NEUE MITTE");
		System.out.println(KONSTANTE_STRING_1 + " mit neuem Eintrag in der Mitte: "+test);

		// Ein Objekt oder Element in der MITTE löschen und wieder hinzufügen
		System.out.println("_________________NEUES ENDE_________________");
		System.out.println(KONSTANTE_STRING_1 + " mit alten Eintrag am Ende: "+test);
		// test.remove("der"); // es kann auch ein String übergeben werden dafür
		// gibt es dann die Methode remove die ein Objekt erwartet
		System.out.println("Der Eintrag: "+test.get(test.lastIndexOf(test) + test.size()) + " soll gelöscht werden.");
		test.remove(test.lastIndexOf(test) + test.size());
		System.out.println(KONSTANTE_STRING_1 + " ohne den alten Eintrag am Ende: "+test);
		test.add("NEUES ENDE");
		System.out.println(KONSTANTE_STRING_1 + " mit neuem Eintrag am Ende: "+test);

	}

	public static void remove(Object zuLoeschen) {
		try {
			for (Object a : test) {
				if (a.equals(zuLoeschen)) {
					test.remove(a);

				}
			}
			// Beschreibung
			// Diese Exception wird ausgelöst, wenn ein Thread eine Kollektion verändert,
			// während ein anderer Thread über diese Kollektion iteriert und die Kollektion
			// keine Manipulationen während der Iteration zuläßt.
		} catch (ConcurrentModificationException e) {
			System.out.println("Exception when deleting \""
					+ zuLoeschen.toString() + "\"");
		}

	}

}
