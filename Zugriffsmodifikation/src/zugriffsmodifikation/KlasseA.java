package zugriffsmodifikation;
/**
 * 
 */

/**
 * @Author Marco Hoppe
 */
public class KlasseA {

	// etwas sehr Privates
	public int pinNummer = 1111;

	/**
	 * @return the pinNummer
	 */
	public int getPinNummer() {
		return pinNummer;
	}

	/**
	 * @param pinNummer
	 *            the pinNummer to set
	 */
	public void setPinNummer(int pinNummer) {
		this.pinNummer = pinNummer;
	}
}
