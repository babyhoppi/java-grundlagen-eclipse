public class QuersummeQuadratsumme 
{
	public static void main(String[] args) {

		int input;												
		input = 100;
		long differenz;
		differenz = 0;											
		
		long zwischenergebnis = quadratsumme(input);			
															
		long endergebnis = quersumme(input);
		differenz = (quersumme(input)- quadratsumme(input));		
															
		System.out.println("Die Summe der Quadrate ist: "+quadratsumme(input));				
		System.out.println("Die quadriert Summe ist: "+quersumme(input));
		System.out.println("Die Differenz betraegt: "+differenz);
	}

	public static long quadratsumme(long zahl)
		{	
		int ergebnis = 0;
			
		for(int i=0; i<=zahl; i++)
		{
			ergebnis += (i*i);
		}
		return ergebnis;
	}

	public static long  quersumme(long zahl)
	{
		int summe = 0;
		int ergebnis = 0;
			
		for(int i=0; i<=zahl; i++)
		{
			summe = summe + i;
		}
		ergebnis = summe * summe;
		return ergebnis;
	}
}