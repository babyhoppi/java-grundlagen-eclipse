/**
 * 
 */
package marco.ausnahmen;

/**
 * @Author Marco Hoppe
 */
public class MainApp {

	/**
	 * 
	 */
	public MainApp() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		DemoKlasseA da = new DemoKlasseA();
		
		da.etwasKritisches();
		
		//wir verwenden die Klasse DemoKlasseB
		
		DemoKlasseB dkb = new DemoKlasseB();
		try {
			dkb.ichWerfeWas();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
	}

}
