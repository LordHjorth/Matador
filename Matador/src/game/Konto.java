package game;

public class Konto{

	//Klassen bruges til at holde styr på spillerens balance.
	
	private int kapital;

	public Konto(int kapital) {
		this.setKapital(kapital);
	}

	public int getKapital() {
		return kapital;
	}

	public void setKapital(int kapital) {
		this.kapital = kapital;
	}

}
