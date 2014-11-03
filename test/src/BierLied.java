class BierLied{
	
	public static void main (String [] args) {
		int bierAnzahl=10;
		String wort = "Flaschen";
		
		
		while (bierAnzahl>0){
			if(bierAnzahl==1){
				wort = "Flasche";
			}
			
			System.out.println(bierAnzahl + " " + wort + " Bier im Kuehlschrank");
			System.out.println(bierAnzahl + " " + wort + " Bier.");
			System.out.println("Hol eine raus.");
			System.out.println("Und lass Sie rumgehen.");
			bierAnzahl = bierAnzahl - 1;
			
			if(bierAnzahl> 0) {
			System.out.println(bierAnzahl + " " + wort + " Bier im Kuehlschrank");
			} else {
				System.out.println("Kein Bier mehr im Kuehlschrank.");
			}
		}
	}
}