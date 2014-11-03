public class immerWiederSonntag
{

        
	public static void main (String args[])
	{		
		int jahrBeginn = 2012;
		int jahrEnde = 2013;
		System.out.println("Die Anzahl der Sonntage die auf einen 1 des Monats fallen sind: "+sonntagefor(jahrBeginn, jahrEnde));	
		System.out.println("Die Anzahl der Sonntage die auf einen 1 des Monats fallen sind: "+sonntagewhile(jahrBeginn, jahrEnde));
	}	
	 	
	 public static int sonntagefor(int jahrBeginn, int jahrEnde) 
	 	{	 		
			 int summeSonntage = 0;
			 int monatBeginn = 1;
			 int tagBeginn = 1;
			 int tagEnde;
			 int wochentag =7;
			 	 
			 for(int jahr = jahrBeginn; jahr <= jahrEnde; jahr++) {
		          	for(int monat = monatBeginn; monat <= 12; monat++) {
		          		if(wochentag == 7) { 
		          			summeSonntage++;
		          			System.out.println("Jahr: "+jahr + " Monat: " + monat);
		          		}	
		          		if ( monat == 4 ||monat == 6 ||monat == 9 ||monat == 11 ) tagEnde = 30;
							else if ( monat == 2 ){ 
									if (istSchaltjahr(jahr)) tagEnde = 29;
									else tagEnde = 28;
									}
								 else tagEnde = 31;
  							
		          		for(int tag = tagBeginn; tag <= tagEnde; tag++){
		          			wochentag++;
		              		if (wochentag== 8) wochentag=1;
		              	}				          	
		          	}
          	}
          	return summeSonntage;
         }
         
    public static boolean istSchaltjahr(int jahr){	
		if (jahr%4==0){
		 return true;
		 } else if (jahr%100==0){
		 	return false;
		 	}else if (jahr%400==0){		
				return true;
				}
				return false;
	}
	public static int sonntagewhile(int jahrBeginn, int jahrEnde) 
	 	{	 		
			 int summeSonntage = 0;
			 int monatBeginn = 1;
			 int tagBeginn = 1;
			 int tagEnde;
			 int wochentag =7;
			 int jahr;
			 jahr = jahrBeginn;
			 int monat;
			 monat = monatBeginn;
			 int tag;
			 tag = tagBeginn;
			 	 
			 while(jahr <= jahrEnde) {		 	 
		     	while(monat <= 12) {
		          		if(wochentag == 7) { 
		          			summeSonntage++;
		          			System.out.println("Jahr: "+jahr + " Monat: " + monat);
		          		}	
		          		if ( monat == 4 ||monat == 6 ||monat == 9 ||monat == 11 ) tagEnde = 30;
							else if ( monat == 2 ){ 
									if (istSchaltjahr(jahr)) tagEnde = 29;
									else tagEnde = 28;
									}
								 else tagEnde = 31;
  							
		          		while(tag <= tagEnde){
		          			wochentag++;
		              		if (wochentag== 8) wochentag=1;
		              		tag++;
		              		}
		              	tag=tagBeginn;
						monat++;				          	
		          }
		        monat=monatBeginn;
		      	jahr++;
          	}
          	return summeSonntage;
         }
}  				

	      		
