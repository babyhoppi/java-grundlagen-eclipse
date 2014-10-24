package de.marco.patterns.abstrakefabrik;


public class TabellenClient {

	private TableFactory factory = null;

	/**
	 * Konstruktor bekommt die zu verwendende Ausgabefabrik injiziert
	 * 
	 * @param t
	 */
	public TabellenClient(TableFactory t) {
		this.factory = t;
	}

	public void showData(String[][] data) {

		// es soll eine Tabelle ausgegeben werden, also brauchen wir die Tabelle
		// zum erzeugen der Tabelle benutzen wir die abstrakten Methoden
		// der abstrakten Fabrik... erst zur Laufzeit des Programms
		// steht dann fest, was es dann für eine Tabelle sein soll
		Table t = this.factory.createTable();

		// jetzt analysieren wir die übergebenen Daten des zweidimensionales
		// Felds
		// und erzeugen aus der 1.Dimension des Felds die Zeilen, aus der 2
		// Dimension
		// die Zellen der Tabelle
		for (int i = 0; i < data.length; i++) {
			// wir erzeugen eine neue Tabellenzeile
			Row r = this.factory.createRow();

			// .. und fügen diese zur Tabelle hinzu
			t.addRow(r);

			// wir lesen die Zellen der Zeile ein
			for (int j = 0; j < data[j].length; j++) {

				// die neue Zeile mit dem Wert aus dem Datenfeld füttern
				Cell c = this.factory.createCell(data[i][j]);

				// .. und zur Zeile hinzufügen
				r.addCell(c);
			}
		}
		// die Daten sind vollständig verarbeitet worden --> die Tabelle ist
		// fertig
		// und kann ausgegeben werden
		t.display();
		
	}
}
