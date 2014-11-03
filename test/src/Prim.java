class Prim  {
    
    public static void main(String[] args)  {
       
        boolean ergebnis=false;
        int i;
		int Zahl = 6;
		
	        for(i=2;i<Zahl;i++){
	        	 
	        	if((Zahl%i)==0)
	        	{ergebnis=true;}
	        }
       
        if(ergebnis==false){
        System.out.println("Die Zahl: "+Zahl + " ist eine Primzahl");}
       
        else{System.out.println("Die Zahl: "+Zahl + " ist keine Primzahl");}
            
	} 
}