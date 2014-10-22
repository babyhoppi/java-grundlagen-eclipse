# Die sortierte Kollektion #

- einige Kollektionen fügen die Elemente < E > auf Basis einer Sortierreihenfolge ein
		
		- Treeset
			- TreeSet<Integer> 	--> sortiert nach Zahlenwert
			- TreeSet<String>	--> lexikografiche Ordnung

- die sortierten Kollektionen erwarten, dass die Argumente für die generische Typparameter Klassen sind, deren Objekte sich vergleichen lassen

- in diesen Sinne vergleichbar wären Klassen die 
	
			1. vom Compator ableiten
			2. Compareable implementieren

- sowohl bei der Ableitung als auch bei der Implementierung dreht sich alles um die abstrakte Methode ***compareTo***
	
			
					  			 ->	 < 0:	falls obj1 < obj2	} Interface
		int compare(obj1, obj2) |->	   0:	bei Gleichheit		} Comperator
								 ->	 > 0:	falls obj2 < obj1	}

- das Interface Comperalbe erwartet die Implementierung der abstrakten Methode ***compareTo***

					  			  ->	< 0: falls obj1 < obj2	} Interface
		int obj1.compareTo(obj2) |->	  0: bei Gleichheit		} Comperator
								  ->	> 0: falls obj2 < obj1	}