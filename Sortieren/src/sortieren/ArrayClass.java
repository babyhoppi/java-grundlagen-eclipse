/**
 * 
 */
package sortieren;

import java.util.Arrays;

/**
 * @Author Marco Hoppe
 */
public class ArrayClass {

	/**
	 * 
	 */
	public ArrayClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) { 	
		int z[] = { 3, 9, 5, 2, 3 }; 			
		System.out.println("z sieht vor dem sortieren so aus : " + zToString(z)); // mit der String ToString Methode --> selbst defeniert
		BubbleSort.zahlenSort(z); 
		System.out.println("z sieht nach dem sortieren so aus : "+ Arrays.toString(z)); // mit der Arrays.toString Methode --> in util.Arrays vorhanden 
	} 

	public static String zToString(int[] z) { 	
		
		String s = ""; 							
		for (int i = 0; i < z.length; i++) { 	
			s = s + z[i] + ","; 				
		} 										
		s = s.substring(0, s.length() - 1); 	
												
		s = s + "\n"; 							
		return s; 								
	}

}
