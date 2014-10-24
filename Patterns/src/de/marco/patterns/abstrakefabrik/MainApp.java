package de.marco.patterns.abstrakefabrik;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] data = new String[10][2];
		data[0][0] = "ID";
		data[0][1] = "Nachname";
		data[1][0] = "1";
		data[1][1] = "Borrmann";
		data[2][0] = "2";
		data[2][1] = "Köcher";
		data[3][0] = "3";
		data[3][1] = "Bahr";
		data[4][0] = "4";
		data[4][1] = "Steinhagen";
		data[5][0] = "5";
		data[5][1] = "Hoppe";
		data[6][0] = "6";
		data[6][1] = "Uhlemann";
		data[7][0] = "7";
		data[7][1] = "Bertram";
		data[8][0] = "8";
		data[8][1] = "Stabenow";
		data[9][0] = "9";
		data[9][1] = "Bauer";

		// wir erzeugen den neuen Client und injiziieren die HtmlTableFactory
		TabellenClient tc = new TabellenClient(new TextTableFactory());
		tc.showData(data);
	}
}
