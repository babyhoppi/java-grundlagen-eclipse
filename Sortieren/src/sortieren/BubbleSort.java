/**
 * 
 */
package sortieren;

/**
 * @Author Marco Hoppe
 */
public class BubbleSort extends ArrayClass{

	public static void zahlenSort(int[] z) { // Methode zum sortieren der Zahlenreihe
		int k;
	    for (int i = 0; i < z.length - 1; i++) {
	    	if (z[i] <= z[i + 1]) {
	    		continue;
	    	}
	    	k = z[i];
	    	z[i] = z[i + 1];
	    	z[i + 1] = k;
	    	zahlenSort(z);   		
	    }
	        
	    return;
	} 
}
