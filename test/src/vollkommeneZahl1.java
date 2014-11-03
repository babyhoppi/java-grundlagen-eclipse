class vollkommeneZahl1{
	
	public static void main (String [] args) {
		long zahl = 0L;
		long x = 21474836474L;
			while(zahl <= x) {
			   long summe = 0L;
			   int teiler = 1;
			   
				 while(teiler < zahl) {
				       if (zahl % teiler == 0) {
				           summe = summe + teiler;
				       }
				     		teiler++;
				 }
					   if (summe == zahl && zahl != 0) {
						       System.out.println(zahl + " ist perfekt");
						}
						   	zahl++;
			}
        }
    }

    