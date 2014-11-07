/**
 * 
 */
package de.marco.AufgabeFahrzeuge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author Marco Hoppe
 */
public class DateiEinlesen {

	public List<Car> autoliste = new ArrayList<Car>();
	
	public List<Car> dateiEinlesen(String file) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String zeile = null;
			String spalten[] = null;
			while((zeile = reader.readLine()) != null){
			
			spalten = zeile.split(",");
			autoliste.add(new Car(spalten[0], spalten[1], Integer.parseInt(spalten[2]), Integer.parseInt(spalten[3])));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return autoliste;
		
	}
}
