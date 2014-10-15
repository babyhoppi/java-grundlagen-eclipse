/**
 * 
 */
package marco.ausnahmen;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author Marco Hoppe
 */
public class DemoKlasseA {
	
	public void etwasKritisches() {
		PrintWriter ausgabe = null;
		
		
		try {
			// das erzeugen eines neuen PrintWriter-Objekts ist kritisch,
			// da unter Umständen die zu öffnende Datei nicht existiert
					
			ausgabe = new PrintWriter("outlile.txt");
			
			for(int i =0; i< 10; i++){
				
				ausgabe.println("Das ist die Ausgabezeile " +i);
			}
			
		} catch (FileNotFoundException e) {
			
			//spezielle Fehlerbehandling fü FileNotFound
			System.err.println(e.getMessage());
			e.printStackTrace();
		
		} catch (IOException e) {
			
			// spezielle Fehlerbehandling fü IO-Fehler
			System.err.println(e.getMessage());
		
		} catch (Exception e) {
			
			// ganz allgemeine Fehlerbehandlung
			System.err.println(e.getMessage());
			e.printStackTrace();
		} finally {
			if(ausgabe!= null) {
				ausgabe.close();
			}
		}
	}
		
}
