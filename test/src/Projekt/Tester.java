public class Tester extends Arbeitnehmer {

	private int schlaf;
	
		
	public int getSchlaf() {
		return schlaf;
	}
	
	public void setSchlaf(int schlaf) {
		this.schlaf = schlaf;
	}
	
	public Tester( String name, int erfahrungslevel){
		super(name,erfahrungslevel);
    	this.schlaf = 100;
    	
    }
    
    public boolean testen(Arbeitspaket Testpaket){
    	this.getVerfuegbar();
    	return false;
    }
	
	
}

