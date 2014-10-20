/**
 * 
 */
package autobeispiel;

/**
 * @Author Marco Hoppe
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class AutoBeispiel {
	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		List<Car> carList = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			carList.add(new Car((i % 2 == 0), i * 100));
		}
		for (Car a : carList) {
			System.out.println(a);
		}
		HashSet<Car> hashCar = new HashSet<>();
		hashCar.add(new Car(true, 0));
		hashCar.add(new Car(true, 0));
		
		hashCar.add(new Car(true, 1000));
		hashCar.add(new Car(false, 1000));
		System.out.println("Das HashSet enthält: " + hashCar.size() + " Elemente.");
		
		
		//wir testen eine String-HashSet
		HashSet<String> hashString = new HashSet<>();
		
		hashString.add("Hallo ");
		hashString.add(" wunderschöne ");
		hashString.add(" Java-Welt!");
		
		for(String s : hashString) {
			System.out.println(s + " HashCode: " + s.hashCode());
		}

		// wir setzen auf sortierte Kollektionen, TreeSet
		// wir testen das Treeset mit Integer
		TreeSet<Integer> treeInt = new TreeSet<>();
		treeInt.add(1000);
		treeInt.add(500);
		treeInt.add(250);
		treeInt.add(750);
		treeInt.add(875);
		treeInt.add(225);
		
		for (Integer i : treeInt) {
			System.out.println(i);
		}
		
		// wir testen das Treeset mit String
				TreeSet<String> treeString = new TreeSet<>();
				treeString.add("Anton");
				treeString.add("Berta");
				treeString.add("Charlie");
				treeString.add("Dora");
				treeString.add("Willi");
				treeString.add("Xantippe");
				
				for (String i : treeString) {
					System.out.println(i);
				}
		
		// wir testen das Treeset mit String
				Comparator<Car> asc = new Comparator<Car>(){
		            @Override
		            public int compare(Car c1, Car c2) {
		                 return Double.compare(c1.hashCode(), c2.hashCode());
		            }
		        };
		        Comparator<Car> desc = new Comparator<Car>(){
		            @Override
		            public int compare(Car c1, Car c2) {
		                 return Double.compare(c2.hashCode(),c1.hashCode());
		            }
		        };
				
				TreeSet<Car> treeCar = new TreeSet<>(desc);
				treeCar.add(new Car(true, 1000));
				treeCar.add(new Car(true, 500));
				treeCar.add(new Car(true, 2000));
				
				
				for (Car i : treeCar) {
					System.out.println(i);
				}
 	}
}
