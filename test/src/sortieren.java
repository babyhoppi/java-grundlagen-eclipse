public class sortieren{

		 public static void main(String[] args){											//Begin der Methode main
				int z[] ={3,9,5,2,3};														//Zahlenreihe
			 	System.out.println("z sieht vor dem sortieren so aus : " + zToString(z));	//Ausgabe der Zahlenreihe
			 	zahlenSort(z);																//Aufruf der Methode zum sortieren
	     	 	System.out.println("z sieht nach dem sortieren so aus : " + zToString(z)); 	//Ausgabe der Zahlenreihe
		}																					//Ende der Methode main

		public static void zahlenSort(int[] z){							//Methode zum sortieren der Zahlenreihe
						int n = z.length;								//der wert n enth�lt die L�nge der Zahlenliste und ist nun unter n und auch unter z.lenght bekannt, es ist sowohl auch die L�nge der Array bekannt
						for(int i = 0; i< n; i++){						//starten bei 0, weiter solange i kleiner als die L�nge der Zahlenliste ist
						int min = z[i];									//der Wert min nimmt den kleinsten Wert an 
						int minIndex = i;								//der Wert minIndex ist nun i ( gleich 0)
								for(int j = i+1; j< n; j++){		//START 1 SCHLEIFE. Starten bei i+1 also bei 1, weiter solange j kleiner als die L�nge der Zahlenliste ist 
									if (min > z[j]){					//wen min kleiner als der Wert j ist dann***
									min = z[j];							//**dann ist das minimum der neue Wert f�r j
									i = j;						//auch der minimumInex ist nun j
									}									// Ende der neuen Wertzuweisung
								}										// ENDE DER 2 SCHLEIFE	
						z[minIndex] = z[i];								//Der minIndex wird nun wieder zum Wert i 
						z[i] = min;										//und der Wert i ist nun wieder das min
					}													// ENDE DER 2 SCHLEIFE
		}																// ENDE Der Methode		
		
		public static String zToString(int[] z){						//Begin der Methode zum umwandeln von Zahlen in eine Zeichenkette und wird durch (int[]z) mit der Zahlenliste bekannt gemacht
			String s="";
			int n = z.length;												//der Buchstabe s erhlt die Zuweisung, dass es eine Zeichenkette ist
		for(int i=0;i<n;i++){									//starten bei 0, weiter solange i kleiner als die L�nge der Zahlenliste ist
		s=s+z[i]+",";  													//f�ge hinter jedes Element ein , hinzu
		}																// ENDE
		s=s.substring(0,s.length()-1);									//Streiche den letzten Wert aus der Zeichenkette !!! substring geht schon davon aus den letzten Wert zu streichen also 10-1 plus -1!!!!!
		s=s+"\n";  														//f�ge der Zeichenkette eine neue Zeile an        
		return s; 														//Der Wert(ist nun eine  Zeichenkette) wird als s zur�ckgegeben
		}
}