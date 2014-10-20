/**
 * 
 */
package collectionmaps;

import java.security.DigestException;
import java.util.HashMap;

/**
 * @Author Marco Hoppe
 */
public class CollectionMaps {
	
	public static void main(String[] args){
		
		//die HashMap
		HashMap<Integer, Car> hmCar = new HashMap<>();
		
		//neue Elemente werden mit der Methode put() hinzugefügt
		for(int i=0; i<20; i++) {
			hmCar.put(i,new Car(i,0,i*100));
		}
		
		//alle Autos mal Testweise ausgeben
		// für alle in der Map gespeicherten Schlüsselwerte
		for(Integer i : hmCar.keySet()){
			
			//holen wir korrespondierende Objekte und geben es aus
			System.out.println(hmCar.get(i));
		}
	}

}
