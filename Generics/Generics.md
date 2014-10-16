##Generics ##

**WOZU GENERICS ?**

- Generics sind Typparameter für Klassen
		- BSP: nicht paramisierte Klassen

			class Box Int {
				private int a;
				.....
			} 
			
			class Box String {
				private String a;
				.....
			}

			class Box .... {
				private .... a;
				.....
			}  
- mit Gernerics lässt sich die konkrete Verwendung einer Klasse zu dem Zeitpunkt festlegen, wenn die Instanz der Klasse gebildet wird
					
							- Box mit Integer
		Box allgemein	new
							- Box mit Zeichenkette


-Beispiel:

		public class MeineBox <T> {
		
		// der Typparameter wird verwendet, um den Datentyp von value noch offen zu halten
		private T value;
		}
 
####**FAZIT:**####

		- um Klassen besser wiederverwenden zu können
		- um Fehler bereits zur Übersetzungszeit zu finden
				|
				 -> Compiler prüft Typverträglichkeit

**EINSTAZ VON GENERISCHEN KLASSEN, MÖGLICHST IMMER UNTER ANGABE DER TYPPARAMETER, DA BEI RAW-TYPE-VERWENDUNG DER COMPILER DIE TYPPRÜFUNG NICHT DURCHFÜHRT (UNCHECKED CONVERSION)**

----------


Typparameter dürfen auch bei der Definition von Methoden eingesetzt werden
		
    public static <T> boolean vergleiche(MeineBox<T> mb1, MeineBox<T> mb2) {
    		
    return mb1.getValue().equals(mb2.getValue());
    			
    }


der Einsatz der Typparameter für Methoden sorgt wiederum für Typsicherheit


Die Entwicklung der Klasse fällt selten auf den gleichen Zeitpunkt, wie deren Verwendung.
	Das kann zu Problemen führen, weil u.U. die Implementierung der Methode einer Klasse nicht zu den später verwendeten Typargumenten passt
		
			- BSP: ">" ins für String nicht definiert
aus diesem Grund lässt sich der Typparameter einer Klasse einschränken

	class Klasse <T extends Numbers>