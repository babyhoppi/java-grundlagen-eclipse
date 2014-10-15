##Exception ##

**Fehlerbehandlung mit Exception**



- 	Die Exception treten zur Laufzeit auf
	- Objekte der Klasse Exception bzw. von deren Subklasse(Exception sind Thowable)

**Arten von Exception**

-	**Checked exception: **	
	-	 Ausnahmen die vorhersehbar sind
	-	Ausnahmen die durch den Programmierer selbst behandelt werden können (catch)

-	**ERROR**
	-	Ausnahmen die nicht durch den Programmierer behandelt werden kann

-	**Runtime-Exception**
	-	Können nicht gefangen werden
	-	„programmierbare“ Ausnahmen
	-	**BEISPIEL:**

			-	A) „Division durch  0“
			-	B) NullPointerException

-	Ausnahmen werden behandelt, indem die geworfene Ausnahme gefangen(catch) wird
-	das Fangen von Ausnahmen erfolgt in einem

				  try... catch... finally
    						BLOCK

- 	**try - Block:** kapselt den kritischen Programmabschnitt, der mutmaßlich eine Ausnahme wirf

- 	**catch - Block:** fängt die geworfene Ausnahme und reagiert darauf
		
		- 	es dürfen mehrere Catch-Blöcke pro try-Block definiert werden
		-	HINWEIS: -keine leeren catch-Blöcke
		-	nach Möglichkeit spezifische Ausnahmen fangen
		-	vermeide catch(Exception e){...} <-- IST DIE OBERSTE ALLER EXCEPTION

-   **finally - Block:	** wird **immer** ausgeführt, sobald der try-Block oder der 							Catch-Block endet 



##DAS THEMA ERSTELLEN VON EIGENEN EXCEPTION##
 

	**throw new Exception(....);**

		- Exception ex = new Exception(...);
		- throw ex;
		- ex = "Das ist eine neue Fehlermeldung"

-

