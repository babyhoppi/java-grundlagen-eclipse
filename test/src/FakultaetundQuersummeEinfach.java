public class FakultaetundQuersummeEinfach
{
    	public static void main (String [] args)
	{	
		int input;
		input = 20;			
				
		System.out.println(fakultaet(input));
		System.out.println(quersumme(fakultaet(input)));
		
		input = input - 10;
		
		System.out.println(fakultaet(input));
		System.out.println(quersumme(fakultaet(input)));
		System.out.println(input);
	
//		System.out.println("Die Anzahl der Sonntage die auf einen 1 des Monats fallen sind: "+sonntagewhile(jahrBeginn, jahrEnde));
      
	 }
    
		      	public static long fakultaet(int zahl){
			      		
		 				long ergebnis = 1L;
		 						     						     	
		         		for (int i=1; i<=zahl; i++)
					      {
					      ergebnis = ergebnis*i;			          
				          }
				          return ergebnis;
		             	}



				public static long quersumme(long zahl) {
						long quersumme = 0; 
							
						while ( zahl > 0 ) {
							quersumme = quersumme + (zahl % 10);
							zahl = zahl / 10;
							}	
						return quersumme;
					}
}
