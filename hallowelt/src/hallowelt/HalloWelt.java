package hallowelt;

public class HalloWelt {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Hallo Welt");
		}
		
		MeineErsteKlasse.willkommen();
		
		//wir instanziieren die KlasseB
		
		KlasseB kb = new KlasseB(100);
		kb.ausgeben();
	}
}
