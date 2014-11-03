class Hund {
	int groesse;
	String rasse;
	String name;
	
	void bellen() {
		System.out.println("Wau! Wau!");
	}
}


class Hundtestlauf {
	public static void main(String[] args) {
		
		Hund h = new Hund();
		h.groesse = 40;
		h.bellen();
	}
}