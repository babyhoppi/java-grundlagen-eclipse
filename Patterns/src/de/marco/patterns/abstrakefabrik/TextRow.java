package de.marco.patterns.abstrakefabrik;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextRow extends Row {

	/**
	 * der Konstruktor der Klasse reicht den Wert für den Zellinhalt direkt an
	 * den Konstruktor der Cell-Klasse weiter
	 * 
	 * @param c
	 */

	@Override
	public void display() {

			PrintWriter pWriter = null;
		// die Startmarkierung einer HTML-Zeile ausgeben
		System.out.println(zeichneRahmen());
		System.out.print("| ");
		try {
            pWriter = new PrintWriter(new FileWriter("test.txt", true), true);
            for (Cell c : this.cells) {
            	c.display();
            	pWriter.print("" + c.content + ",");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
			if (pWriter != null){
				pWriter.println(";");
                //pWriter.flush();
                pWriter.close();
            }
        }
		
		System.out.println("");
		System.out.println(zeichneRahmen());
		
		
		

		// die Endmakierung einer HTML-Zeile ausgeben
		//System.out.print("");
	}
	
	public String zeichneRahmen(){
		int x = 15;
		String plus = "+";
		String laengeName = "";
		String laengeID = "";
		String ausgabe = "";
		
		for(int i = 0; i<x-1; i++){
			laengeName = laengeName + "-";
		}
		for(int j = 0; j<x; j++){
			laengeID += "-";
		}
		ausgabe = plus + laengeID + plus + laengeName + plus;
		return ausgabe;
		
	}

}
