# Klassen und Objektbeziehungen #


![Komposition_Aggregation](http://openbook.galileocomputing.de/oo/bilder/04_29.gif)


- für die Implementierung der Beziehungen in einer OOP-Sprache sind weitere Kriterien zu beachten

		1 Richtung der Beziehung		--> in welchen Klassen 
											muss die Beziehung
											gespeichert werden
		
		2 Multiplizität/Kardinalietäten	--> Auf welche Art werden
											die Beziehungen	gespeichert
											(Skalare Objektvariablen,
											Datenstrukturen)

		
		zu 1. Richtung der Beziehung:
			 
			A ----------- B		ungerichtet, für die Implementierung eher ungünstig
			A ----------> B		unindirektional, die Beziehung wird in der Klasse A
									verwaltet
										|
					--------------------|--------> Methode, um einen Beziehung "herzustellen"
					|					|--------> Methode, um einen Beziehung "zu lösen"
					Speicherung der 	|--------> Methode, um einen Beziehung "abzufragen"
					Beziehungne
			
			  ----------> 		bidirektional, die Beziehung werden in beiden Klasse verwaltet
			A <---------- B		
			 
		2. Multiplizität/Kardinalietäten:

			1			1
		   A-------------B		feste Multiplizität
			
			1			*
		   A-------------B		variable Multiplizität BEISPIEL: 1 ---- 1...4
																 1 ---- 0...4

		2.1 Speichern der Beziehung
			0,1 	--->	skalare Variable	class A { B b= null}
			1...4	--->	Datenfelder(Array)	class A { B[] b= new b[4]} <-- Feld mit bis zu 4 Elementen
				*	--->	Kollektion			



- Methoden zum Verwalten der Beziehung
	- (1) das herstellen einer Beziehung wollen wir abstrakt als **SETLINK** bezeichnen
	- (2) das lösen einer Beziehung wollen wir abstrakt als **MOVELINK** bezeichnen 
	- (3) das abfragen einer Beziehung wollen wir abstrakt als **GetLink** bezeichnen 
	- (4) das abfragen aller Beziehung wollen wir abstrakt als **GetALLink** bezeichnen 

					
	BEISPIEL: |WOHNUNG|1------->1|Stellplatz|	1 Die Beziehung wird in der Wohnung werwaltet
												2 Die Beziehung wird in der skalaren Variablen gespeichert

	    		Wohnung										Stellplatz
    	1 - stellplatz: Stellplatz
    	
		1 + setLink(Stellplatz): void--------------------->	+toString():String
    	2 + removeLink():void
    	3 + getLink():Stellplatz