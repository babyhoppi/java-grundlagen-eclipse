public class Programmierer extends Arbeitnehmer {

	private int zufriedenheit;
	
		
	public int getZufriedenheit() {
		return zufriedenheit;
	}
	
	public void setZufriedenheit(int zufriedenheit) {
		this.zufriedenheit = zufriedenheit;
	}
	
	public Programmierer( String name, int erfahrungslevel){
		super(name,erfahrungslevel);
    	this.zufriedenheit = 100;
    	
    }
    
    public boolean programmieren(Arbeitspaket Testpaket){
    	this.getVerfuegbar();
    	return false;
    }
	
	
}