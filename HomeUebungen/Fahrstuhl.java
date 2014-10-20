
public class Fahrstuhl {

    private static int etage;
    private static int etagezahl;
    private static String ausgabe = "Der Fahrstuhl haelt im: ";
    private static String ausgabe1 = ausgabe;
    private static String ausgabe2 = ausgabe;

    /**
     * @param args
     */
    public static void main(String[] args) {
	Fahrstuhl10(4);
	Fahrstuhl150(3);
	
    }
	
	public static void Fahrstuhl10(int Etage) {
	    
	switch (Etage) {
		case 1:  ausgabe1 = ausgabe += "Erdgeschoss";break;
		case 2:  ausgabe1 = ausgabe += "1 Obergeschoss";break;
		case 3:  ausgabe1 = ausgabe += "2 Obergeschoss";break;
		case 4:  ausgabe1 = ausgabe += "3 Obergeschoss";break;
		case 5:  ausgabe1 = ausgabe += "4 Obergeschoss";break;
		case 6:  ausgabe1 = ausgabe += "5 Obergeschoss";break;
		case 7:  ausgabe1 = ausgabe += "6 Obergeschoss";break;
		case 8:  ausgabe1 = ausgabe += "7 Obergeschoss";break;
		case 9:  ausgabe1 = ausgabe += "8 Obergeschoss";break;
		case 10:  ausgabe1 = ausgabe += "9 Obergeschoss";break;
		default: ausgabe1+="\nEingabefehler!";
		}
	System.out.println(ausgabe1);
	}
	
	public static void Fahrstuhl150(int etagezahl) {
			
		if ( etagezahl == 1 ) {
		    ausgabe2 += "Erdgeschoss";}
		else {    
		    ausgabe2 += (etagezahl-1) + ". Obergeschoss";
		}
		System.out.println(ausgabe2);
	}

	public static int getEtage() {
	    return etage;
	}

	public static void setEtage(int etage) {
	    Fahrstuhl.etage = etage;
	}

	public static int getEtagezahl() {
	    return etagezahl;
	}

	public static void setEtagezahl(int etagezahl) {
	    Fahrstuhl.etagezahl = etagezahl;
	}
	}
    	