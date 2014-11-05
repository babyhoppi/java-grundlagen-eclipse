/**
 * 
 */
package de.marco.verketteListe;

/**
 * @Author Marco Hoppe
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VerketteListe list = new VerketteListe();
		list.hinzufuegen("1");
		list.hinzufuegen("2");
		list.hinzufuegen("3");
		list.hinzufuegen("4");
		list.hinzufuegen("5");
		list.einfuegenDanach("3", "neu");
		list.entfernen("3");
		list.ausgebenDerListe();
		System.out.println("Das erstes Element: " + list.getErstesElement().getObj());
		System.out.println("Das letztes Element: " + list.getLetztesElement().getObj());
		list.entfernen("4");
		list.ausgebenDerListe();
	}

}
