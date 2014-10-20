/**
 * 
 */
package autobeispiel;

import java.util.Comparator;
import java.util.PrimitiveIterator;

/**
 * @Author Marco Hoppe
 */
public class HoppeCar implements Comparator<HoppeCar>,Comparable<HoppeCar> {
	private int horsePower;
	private int mileage;
	
	public int getHorsePower() {return horsePower;}
	public void setHorsePower(int horsePower) {	this.horsePower = horsePower;}

	public int getMileage() {return mileage;}
	public void setMileage(int mileage) {this.mileage = mileage;}

		public HoppeCar() {
		this.horsePower = 0;
		this.mileage = 0;
	}

	public HoppeCar(int horsePower, int milage) {
		this.horsePower = horsePower;
		this.mileage = milage;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " km: " + this.mileage + " ps: " + this.horsePower;
	}

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(HoppeCar c1, HoppeCar c2) {
			if(c1.horsePower == c2.horsePower) {
				return 0;
			}
			
			if(c1.horsePower > c2.horsePower) {
				return 1;
			}
			
			return -1;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(HoppeCar c) {
		if(this.mileage == c.mileage){
		return 0;
		}
		if(this.mileage > c.mileage){
			return 1;
		}
		return -1;
	}
}
