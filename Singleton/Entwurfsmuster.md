# Entwurfsmuster #

- sind in der OOP eingesetzte, praktische bewährte Herangehensweisen an bestimmte Gruppen von Aufgabenstellungen
- **"Gang of Four"** (GOF) hat Entwurfsmuster definiert nach folgenden Kategorien:
	-  (1)	Erzeugungsmuster
		-  Wie kann man Objekte **"sinnvoll"** erzeugen?
	-  (2)	Verhaltensmuster
		-  Wie kann Verhalten am besten in Klassen umgesetzt werden? (Iterator)
	-  (3)	Strukturmuster
		-  beschreiben **"sinnvolle"** Klassenhierarchien zum Speichern von Informationen
	

###Erzeugungsmuster###
	
- (1)  **Singleton**
	- stellt sicher , dass es von einer Klasse immer nur genau eine Instanz gibt
	- dazu wird die Kontrolle über das erzeugen des Objekts in die Klasse verlagert
	- die Klasse stellt eine Methode bereit, damit von aussen auf die Instanz zugegriffen werden kann. DIESE METHODE HEISST:  
		- getInstance() ---> diese Methode ist static --> KLASSE.getInstance()
	- alle anderen Möglichkeiten, Instancen der Klasse zu bekommen, werden "deaktiviert"
		- (a) die **Konstruktoren** der Klasse werden **privat**
		- (b) clone() wird privatisiert
	
	- das Muster führt zu **Klassenkontrollierten** Instanzen
	- das Muster wird immer dann eingesetzt, wenn nur eine Instanz der Klasse exestieren soll oder darf

- (2) **[Fabrik](http://www.java-blog-buch.de/b-abstract-factory/ "Fabrik")/Fabrikmethode**
	- eine Fabrik soll ähnliche Objekte erzeugen können
	- Das Muster bietet der Applikation/ dem Client eine **einheitliche Schnittstelle** zum Erzeugen verschiedener, ähnlicher Objekte
		-  erzeuge():Fahrzeuge
	- Das eigentliche Erzeugen der Objekte erfolgt in Unterklassen oder on der Fabrikmethode

-DAS STRUCKTURMUSTER ANLEITUNG
		
	(1) Schreiben Sie eine abstrakte Klasse **oder** ein Interface, die die Methoden zum Erzeugen der Objekte deklariert
	(2) Schreiben Sie konkrete Fabriklassen, die diese Erzeugenmethode implementiert
	(3) Schreiben Sie Produktklassen, die ein gemeinsames Interface implementieren
	

Beispiel:  
		
- (1) Klasse oder Interface ---> Fabrik
- (2) Fabrikklassen			---> SolarAutoFabrik, DieselAutoFabrik,TretAutoFabrik
- (3.1) Produktklassen		---> SolarAutoFabrik, DieselAutoFabrik,TretAutoFabrik- - (3.2) Interface			---> Fahrzeug				