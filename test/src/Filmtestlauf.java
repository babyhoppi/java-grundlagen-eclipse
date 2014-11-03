class Filmtestlauf {
	public static void main(String[] args) {
		Film eins = new Film();
		eins.titel= "Von der Krise verweht";
		eins.genre = "Tragisch";
		eins.vorfuehren();
		
		Film zwei = new Film();
		zwei.titel= "Vier Deadlines und ein Todesfall";
		//zwei.genre = "Komoedie";
		zwei.bewertung = 2;
		zwei.vorfuehren();
		//System.out.println(zwei.titel);
		
		Film drei = new Film();
		//drei.titel= "Byte Club";
		drei.genre = "Tragisch aber letztendlich aufbauend";
		drei.bewertung = 3;
		drei.vorfuehren();
		
				
		}
	}
