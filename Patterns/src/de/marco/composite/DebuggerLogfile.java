/**
 * 
 */
package de.marco.composite;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author Marco Hoppe
 */
public class DebuggerLogfile extends AbstrakteKomponente {

	PrintWriter Logfile = null;
	//String timestamp = new Date(year, month, date).toString();

	/**
	 * @param string
	 * @throws IOException
	 */
	public DebuggerLogfile(String dateiName) {
		try {
			this.Logfile = new PrintWriter(new FileWriter(dateiName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}
	
	/**
	 * 
	 */
	public DebuggerLogfile() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.marco.composite.AbstrakteKomponente#methodeA()
	 */
	@Override
	public void methodeA() {
		// hier "erstellen" wir dann die Logfile
		System.out.println("Logfile auf den Server von: "+ this.getClass().getSimpleName());
		try {
			if (Logfile == null) {
				this.Logfile = new PrintWriter(new FileWriter("Namenlos.txt"));
			}
			Logfile.println("Logfile auf den Server von: "+ this.getClass().getSimpleName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (Logfile != null) {
				Logfile.close();
			}
		}
	}
	
}
