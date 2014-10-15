/**
 * 
 */
package marco.sortierenUndSpeichern;

/**
 * @Author Marco Hoppe
 */
public class Bubblesort {
	/**
	 * @param args
	 */
	static void sortieren(int[] x) {
		for (int i = x.length; i > 1; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (x[j] > x[j + 1]) {
					int temp = x[j];
					x[j] = x[j + 1];
					x[j + 1] = temp;
				}
			}
		}
	}
}
