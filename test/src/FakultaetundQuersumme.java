public class FakultaetundQuersumme {
    	public static void main (String [] args){				//Beginn der Methode main	
		
		int input;												//input als int deklarieren und bekannt machen
		input = 20;												//dem datentyp int den wert 20 zuweisen
		
		long zwischenergebnis = fakultaet(input);				//zwischenergebnis als long deklarieren und dem wert aus fakultaet(input) zuweisen
																//Die Methode fakultaet wird aufgerufen und durchgefürt mit dem Wert Zahl***
		long endergebnis = quersumme(zwischenergebnis);			//endergebnis als long deklarieren und dem wert aus quersumme(zwischenergebnis) zuweisen
																//Die Methode quersumme wird aufgerufen und durchgefürt mit dem Wert long Zahl***
		System.out.println(fakultaet(input));					//Ausgabe des Wertes aus der Berechnung der Methode fakultaet(input)
		System.out.println(quersumme(zwischenergebnis));		//Ausgabe des Wertes aus der Berechnung der Methode(quersumme(zwischenergebnis))
		input = input - 10;										//hier wird der Wert input geändert (kein Einfluss auf das Ergebnis der Methoden)
		System.out.println(input);								//Ausgabe des Wertes input (20 - 10)
	 }															//Main-Methode beendet
    
		      	public static long fakultaet(int zahl){			//Beginn der Methode fakultaet ubergabe des wertes zahl (20)
			      		
		 				long ergebnis = 1L;						//ergebnis als long deklarieren und bekannt machen
		 						     						     	
		         		for (int i=1; i<=zahl; i++)				//Beginn der for schleife den Wert i solange hochzählen bis ZAHL(20) erreicht ist
					      {										
					      ergebnis = ergebnis*i;				//Das Ergebnis wird immer wieder mit dem ergebnis*i hochgerechnet
				          }										//
				          return ergebnis;						//Ausgabe des Ergebnis es wäre hier 2432902008176640000
		             	}										//Ende der Methode fakultaet

				public static long quersumme(long zahl) {		//Beginn der Methode quersumme ubergabe des wertes zahl (2432902008176640000)
						long quersumme = 0; 					//ergebnis als long deklarieren und bekannt machen
							
						while ( zahl > 0 ) {					//Beginn der while schleife solange der wert Zahl nicht null ist wiederholt sich die schleife
							quersumme = quersumme + (zahl % 10);//die Quersumme wird aus der komplettenZahl berechnet die einen innerhalb von 10 liegen. s.Bild
							zahl = zahl / 10;					//die Zahl muss durch 10 teilbar sein
							}									//Ende der Whileschleife
						return quersumme;						//die quersumme wird als ergebnis zurückgeliefert (hier 54)
					}											//Ende der Methode quersumme
}