# Das Collection-Framework #

- Rahmenwerkzeug für Datenstrukturen (dynamische)
- im Collection-Framework finden wir:
	1. Interfaces (Verhalten von Datenstrukturen)
	2. Implementierungen (Klassen, die die Interfaces implementieren)
	3. Algorithmen, die nützliche Funktionen für Datensammlungen bereitstellen


**Vorteile:**
	
	- reduziert den Programmieraufwand
 	- verbessert die Qualität der Software
 	- verbessert die Zusammenarbeit mit anderen durch wohldefinierte Schnittstellen


###Das Collection Interface###

	ist die Wurzel der meisten Implementierungen

					Collection							MAP
						|								 |
	_____________________________________				 |
	|			|			|			|				 |	

	Set			List		Queue		Degue			SortedMap

Sammlungen von Objekten, die als Element bezeichnet werden. 

In der Doku : Collection < E > , e --> 	_ _ _.add(<E>)		


**SET:** Menge von Objekten ohne Duplikate

**LIST:** Liste von Objekten die Duplikate entahlten haben und sortiert ist

**Queue:** Warteschlange, FIFO "FIRST IN FIRST OUT" nach dem Motto "wer zuerst, mahlt zuerst"

**Degue:** double ended queue Warfteschlange, FIFO, LIFO --> Kellerspeicher,Stack

**Map:** Schlüsselwert --> Wert	 bedeutet   key		   --> value


    Interface
    	|
    	v
    List<Integer> intListe = new ArrayList<>();
	_____________ ________		 ___________
	DATENTYP	  Objekt-			Objekt
				  variable
		^                              ^
		|		Polymorphie			   |
		--------------------------------
		(Einschränkung der Signatur / 
		des Portokolls)

