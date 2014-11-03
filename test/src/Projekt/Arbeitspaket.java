public class Arbeitspaket {

	private String typ;
	private String soll;
	private String ist;
	private String beschreibung;
	boolean geprueft;
	
	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public String getSoll() {
		return soll;
	}

	public void setSoll(String soll) {
		this.soll = soll;
	}

	public String getIst() {
		return ist;
	}

	public void setIst(String ist) {
		this.ist = ist;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public boolean isGeprueft() {
		return geprueft;
	}

	public void setGeprueft(boolean geprueft) {
		this.geprueft = geprueft;
	}
	
	boolean gefuellt(){
		if (getIst() =="") return false;
		else { return true;}
	}
	
	public Arbeitspaket(){
		this.beschreibung = "";
		this.typ="";
		this.soll="";
		this.ist="";
	}
	
	public Arbeitspaket(String soll, String ist){
		this.beschreibung = "";
		this.typ="";
		this.soll=soll;
		this.ist=ist;
	}
	
	

	
}