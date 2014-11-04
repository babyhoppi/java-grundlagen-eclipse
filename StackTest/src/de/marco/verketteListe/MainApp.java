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
		list.einfuegenDanach("2", "neu");
		list.entfernen("3");
		list.ausgebenDerListe();
		System.out.println("erstes Element: " + list.getErstesElement().getObj());
		System.out.println("ist '3' enthalten? " + list.find("3"));
		System.out.println("ist '5' enthalten? " + list.find("5"));
		System.out.println("letztes Element: " + list.getLetztesElement().getObj());
	}

}
