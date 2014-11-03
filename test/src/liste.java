import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortieren{
 
public static void main(String[] args){											
				String Vorname[] =[Jörg, Alex, Matthias, Fabian, Ulrike, Marco, Thomas, Louise];
				System.out.println("z sieht vor dem sortieren so aus : " + zToString(z));	//Ausgabe der Zahlenreihe
			 	zahlenSort(z);																//Aufruf der Methode zum sortieren
	     	 	System.out.println("z sieht nach dem sortieren so aus : " + zToString(z));	
	     	 	}

public static void zahlenSort(int[] z){															
			 		
		int n = z.length;								
			
				for(int i = 0; i< n; i++){
					String name = Vorname[i];
					System.out.Printnl(name);						
					int min = z[i];									
					int minIndex = i;								
								for(int j = i+1; j< n; j++){		
									if (min > z[j]){				
									min = z[j];						
									i = j;						
									}							
								}								
						z[minIndex] = z[i];						
						z[i] = min;
									}											
		}
		public static String zToString(int[] z){						
			String s="";
			int n = z.length;											
		for(int i=0;i<n;i++){									
		s=s+z[i]+",";  											
		}														
		s=s.substring(0,s.length()-1);							
		s=s+"\n";  												
		return s; 												
		}
	}
										