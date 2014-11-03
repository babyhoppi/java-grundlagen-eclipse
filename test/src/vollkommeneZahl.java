class vollkommeneZahl{
	
	public static void main (String [] args) {
		int zahl =6;
		int summe = 0;
		int teiler = 0;
	
			
			for (int i = 1; i< zahl; i++){
					if (zahl%i == 0){
						teiler= i; 
						System.out.println( +teiler );
				summe = summe + i;
					}
				
			}
		if (summe == zahl){
						System.out.println("____");
						System.out.println(+zahl);
						System.out.println("Die Zahl " +zahl + " ist eine vollkommene Zahl!");
		}
		if (summe != zahl){
						System.out.println("Die Zahl: " +zahl + " ist keine vollkommene Zahl!");
		}
	}
}
					
					
					
				
