/**
 * 
 */
package marco.ausnahmen;

import java.io.IOException;

/**
 * @Author Marco Hoppe
 */
public class DemoKlasseB {

	/**
	 * meine Methode wirft eine Exception
	 * 
	 * @throws Exception
	 */
	public void ichWerfeWas() throws Exception,IOException {
		String s = new String("I'm not a BUG, I'am a Future");
		
		//wir werfen eine lustige Exception
		if(s==null)
			throw new Exception("Lirum Larum");
		
		//....
		
		// zu einem beliebigen späteren Zeitpunkt
		throw new IOException("Nur mal ein Test");
	}

}
