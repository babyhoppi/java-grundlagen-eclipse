public class GUIEntwickler extends Arbeitnehmer {

	private int koffeingehalt;
		
	public int getKoffeingehalt() {
		return koffeingehalt;
	}
	
	public void setKoffeingehalt(int koffeingehalt) {
		this.koffeingehalt = koffeingehalt;
	}
	
	public GUIEntwickler( String name, int erfahrungslevel){
		super(name,erfahrungslevel);
    	this.koffeingehalt = 100;
    	
    }
    
    public boolean huebschmachen(Arbeitspaket Testpaket){
    	this.getVerfuegbar();
    	return false;
    }
	
	
}