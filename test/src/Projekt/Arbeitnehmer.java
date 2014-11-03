public class Arbeitnehmer {
	private String name;
	private int erfahrungslevel;
	private boolean intern;
	private boolean urlaub;
	
	
	
	// get und set-Methoden Beginn
	public boolean getVerfuegbar(){
			if (urlaub == true)
				return false;
			else 
				if (intern == true)
					return true;
				else {
					int zufall = (int) (Math.random()*10);
					System.out.println(zufall);
					if( (zufall % 2 == 0 ))
						 return true;
					else return false;
					}
	}

	
	public boolean getUrlaub() {
		return this.urlaub;
	}
	
	public void setUrlaub(boolean urlaub) {
		this.urlaub = urlaub;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName( String name ){
		if ( name == null )
			this.name = "";
	    if ( name.length()<=255 ) 
	      	this.name = name;
	    else { this.name= name.substring(0,255);}
	}
	
	public int getErfahrungslevel() {
		return this.erfahrungslevel;
	}
	// get und set-Methoden Ende
	
    public Arbeitnehmer( String name, int erfahrungslevel){
    	this.name = name;
    	if ( erfahrungslevel <=0 && erfahrungslevel>6)
			this.erfahrungslevel = 1;
	    if ( erfahrungslevel >0 && erfahrungslevel<6 ) 
	      this.erfahrungslevel = erfahrungslevel;
	    else { System.out.println("Es wurde ein Erfahrungslevel von 1 zugewiesen, da der Wert nicht zwischen 1 und 5 lag");}
    	this.intern = true;
    	this.urlaub = false;
    }
    
    public Arbeitnehmer( String name, int erfahrungslevel, boolean intern){
    	this.name = name;
    	if ( erfahrungslevel <=0 && erfahrungslevel>6)
			this.erfahrungslevel = 1;
	    if ( erfahrungslevel >0 && erfahrungslevel<6 ) 
	      this.erfahrungslevel = erfahrungslevel;
	    else { System.out.println("Es wurde ein Erfahrungslevel von 1 zugewiesen, da der Wert nicht zwischen 1 und 5 lag");}
    	this.intern = intern;
    	this.urlaub = false;
    }
	
	
}