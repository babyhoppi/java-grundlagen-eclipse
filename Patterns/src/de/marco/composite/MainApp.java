/**
 * 
 */
package de.marco.composite;

/**
 * @Author Marco Hoppe
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Test unseres Composite-Patterns
		 */

		// wir erzeugen den Wurzelknoten
		Kompositum k = new Kompositum();

		// wir bauen ein zweites Kompositum
		Kompositum k2 = new Kompositum();
		k2.hinzufuegen(4,new DebuggerLogfile("a.txt"));
		k2.hinzufuegen(5,new DebuggerLogfile("b.txt"));
		k2.hinzufuegen(6,new DebuggerLogfile());

		// ... und fügen einen DebuggerLogfile hinzu
		k.hinzufuegen(2,k2);

		// wir bauen ein drittes Kompositum
		Kompositum k3 = new Kompositum();
		k3.hinzufuegen(7,new DebuggerEmail());
		k3.hinzufuegen(8,new DebuggerSMS());

		// ... und fügen einen DebuggerLogfile hinzu
		k2.hinzufuegen(3,k3);

		// ... und fügen einen DebuggerEmail hinzu
		k.hinzufuegen(9,new DebuggerEmail());

		// ... und fügen einen DebuggerSMS hinzu
		k.hinzufuegen(10,new DebuggerSMS());

		// das "zusammengesetzte" Debugger-Objekt betrachten win nun als großes
		// Ganzen
		k.methodeA();
		k.entfernen(9);
		k.methodeA();
		

	}

}
