/**
 * 
 */

/**
 * @Author Marco Hoppe
 */
public class HashCode {

	/**
	 * 
	 */
	public HashCode() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String A = new String("HashcodeString");
	      System.out.println("Hashcode for A :" + A.hashCode() );
	      long demoLang =-1000l;
	      System.out.println((int)(demoLang ^ (demoLang>>>32)));
	}
	
	@Override
	public int hashCode(){
		// Startwert = 59 * unserer Zahl(1000) + 17(Einer wilkürlichen Zahl)
		return 59 + (int)(this.demoLong)+17;
	}
}
