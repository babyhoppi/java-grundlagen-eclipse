public class Kuh {
	private String name;
	private String typ;
	private String farbe;
	
	public Kuh ( String name, String farbe) {
		this.name = name;
			if( farbe == "Schwarz" || "Braun" || "Lila"){
				this.setFarbe(farbe); 
			}else {this.setFarbe("Schwarz");}
	}

	/**
	 * @return the farbe
	 */
	public String getFarbe() {
		return farbe;
	}

	/**
	 * @param farbe the farbe to set
	 */
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
}