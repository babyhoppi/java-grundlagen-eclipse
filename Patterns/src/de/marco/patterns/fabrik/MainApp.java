package de.marco.patterns.fabrik;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Wir testen unsere Fabriken und unsere Autos
		
		//... eine Solarautofabrik
		Fabrik s = new SolarAutoFabrik();
		// ... erzeugt Solarautos
		Fahrzeug fzg = s.erzeuge();
		//... die ganz leise fahren
		fzg.move();
		
		//... eine Dieselautofabrik
		Fabrik d = new DieselAutoFabrik();
		// ... erzeugt Dieselautos
		Fahrzeug fzgD = d.erzeuge();
		//... die ganz laut fahren
		fzgD.move();
		
		//... eine Tretautofabrik
		Fabrik t = new TretAutoFabrik();
		// ... erzeugt Tretautos
		Fahrzeug fzgT = t.erzeuge();
		//... die ganz anstrengend fahren
		fzgT.move();
		
		
		// ... so bitte nach Möglichkeit ***NICHT*** programmieren
		// Bei änderungen müssten dann alle Solar durch Diesel ersetzt werden
		
		// ... die konkrete PistoleFabrik
		SolarAutoFabrik sf = new SolarAutoFabrik();
		
		// .... erzeugt lt. Definition Fahrzeuge Typcast ist nicht sinnvoll
		SolarAuto sFzg = (SolarAuto)sf.erzeuge();
		
		// ... und nun lassen wir das Pistole fahren
		sFzg.move();
		
	}

}
