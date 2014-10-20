/**
 * 
 */
package collectionmaps;

/**
 * @Author Marco Hoppe
 */
public class Car {
	
	private int id;
	private int mileage;
	private int horsePower;
		
	
	public Car() {
	}
	/**
	 * @param id
	 * @param mileage
	 * @param horsePower
	 */
	public Car(int id, int mileage, int horsePower) {
		super();
		this.id = id;
		this.mileage = mileage;
		this.horsePower = horsePower;
	}
	
	public int getHorsePower() {return horsePower;}
	public int getId() {return id;}
	public int getMileage() {return mileage;}
	public void setHorsePower(int horsePower) {this.horsePower = horsePower;}
	public void setId(int id) {this.id = id;}
	public void setMileage(int mileage) {this.mileage = mileage;}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "Car [id=" + id + ", mileage=" + mileage + ", horsePower=" + horsePower + "]";
	}
	
	
	

}
