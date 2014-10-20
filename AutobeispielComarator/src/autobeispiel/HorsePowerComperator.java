/**
 * 
 */
package autobeispiel;

import java.util.Comparator;

/**
 * @Author Marco Hoppe
 */
public class HorsePowerComperator implements Comparator<HoppeCar> {

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compare(HoppeCar c1, HoppeCar c2) {
			return c1.getHorsePower() - c2.getHorsePower();
	}

}
