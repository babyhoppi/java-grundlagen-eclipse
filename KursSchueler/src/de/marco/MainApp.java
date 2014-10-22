package de.marco;

public class MainApp {
	
	public static void main(String[] args) {
		
		
		// Aufgabe
		// 1 : ein Schüler soll sich einschreiben können  			FERTIG UND GETESTET
		// 2 : alle Kursteilnehmer sollen aufgelistet werden können FERTIG UND GETESTET
		// 3 : ein Schüler soll den Kurs wieder verlassen können 
		
		//LÖSUNG HERR BAUER
		Kurs e = new Kurs();
		
		Schueler hoppe = new Schueler(1, "Marco","Hoppe");
		Schueler steinhagen = new Schueler(2, "Steffen","Steinhagen");
		Schueler koecher = new Schueler(3, "Thomas","Koecher");
		Schueler bahr = new Schueler(4, "Manuel","Bahr");
	
		
		Schueler hoppe2 = new Schueler(11,"Hoppe");
		Schueler steinhagen2 = new Schueler(22, "Steinhagen");
		Schueler koecher2 = new Schueler(33, "Koecher");
		Schueler bahr2 = new Schueler(44,"Bahr");
		
		e.einschreiben(hoppe);
		e.einschreiben(steinhagen);
		e.einschreiben(koecher);
		e.einschreiben(bahr);
		
		e.einschreiben(hoppe2);
		e.einschreiben(steinhagen2);
		e.einschreiben(koecher2);
		e.einschreiben(bahr2);
		
		e.ausschreiben(hoppe2);
		e.ausschreiben(steinhagen2);
		e.ausschreiben(koecher2);
		e.ausschreiben(bahr2);
		
		
		e.auflisten();
		
		
		
	}
	
}
