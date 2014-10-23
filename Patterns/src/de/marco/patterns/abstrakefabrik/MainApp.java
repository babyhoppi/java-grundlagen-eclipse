package de.marco.patterns.abstrakefabrik;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] data = new String[9][2];
		data[0][0] = "1";
		data[0][1] = "Borrmann";
		data[1][0] = "2";
		data[1][1] = "Köcher";
		data[2][0] = "3";
		data[2][1] = "Bahr";
		data[3][0] = "4";
		data[3][1] = "Steinhagen";
		data[4][0] = "5";
		data[4][1] = "Hoppe";
		data[5][0] = "6";
		data[5][1] = "Uhlemann";
		data[6][0] = "7";
		data[6][1] = "Bertram";
		data[7][0] = "8";
		data[7][1] = "Stabenow";
		data[8][0] = "9";
		data[8][1] = "Bauer";
		
		// wir erzeugen den neuen Client und injiziieren die HtmlTableFactory
		TabellenClient tc = new TabellenClient(new HtmlTableFactory());
		tc.showData(data);
	}

}
