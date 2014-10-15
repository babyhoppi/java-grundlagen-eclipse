/**
 * 
 */
package marco.sortierenUndSpeichern;

/**
 * @Author Marco Hoppe
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * @author Marco Hoppe
 *
 */
public class Sortieren {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		PrintWriter unsortedAusgabe = null;
		PrintWriter sortedAusgabe = null;
		try {
			// TODO Auto-generated method stub
			int anzahlDerZahlen = 20;
			int[] zahlenArray = new int[anzahlDerZahlen + 1];
			
			// Mit der FOR Schleife wird eine Zahlenfolge erstellt die etwas komisch ist. 0,0,0,0,0,x <<--- WARUM?
			//for (int i=anzahlDerZahlen; i >= 0; i--) {
			//	zahlenArray[anzahlDerZahlen] = (int) (Math.random() * 10);
			//}
			
			while (anzahlDerZahlen >= 0) {
				zahlenArray[anzahlDerZahlen] = (int) (Math.random() * 100);
				anzahlDerZahlen--;
			}
			
			System.out.println(Arrays.toString(zahlenArray));
			unsortedAusgabe = new PrintWriter(new FileWriter("unsorted.txt"));
			unsortedAusgabe.println(Arrays.toString(zahlenArray));
			
			Bubblesort.sortieren(zahlenArray);
			
			sortedAusgabe = new PrintWriter(new FileWriter("sorted.txt"));
			System.out.println(Arrays.toString(zahlenArray));
			sortedAusgabe.println(Arrays.toString(zahlenArray));
		} finally {
			if (unsortedAusgabe != null) {
				unsortedAusgabe.close();
			}
			if (sortedAusgabe != null) {
				sortedAusgabe.close();
			}
		}
	}
}
