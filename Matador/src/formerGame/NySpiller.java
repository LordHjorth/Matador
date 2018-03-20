package formerGame;


public class NySpiller{
	
	//bruges til at oprette spillere, som derefter kan sættes ind i GUI'ens GUI_Player.
	//spilleren her har et navn, kapital, og et startfelt. 
	//Løbende kan de 3 parametre opdateres ved brug af getters og setters.
	
	private Konto konto;
	private String navn;
	private int placering;
	
	public NySpiller(String navn, int kapital, int startfelt) {
		this.setKonto(new Konto(kapital));
		this.setNavn(navn);
		this.setPlacering(startfelt);
	}


	
	
	public String getNavn() {
		return navn;
	}

	public Konto getKonto() {
		return konto;
	}

	public void setKonto(Konto konto) {
		this.konto = konto;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getPlacering() {
		return placering;
	}

	public void setPlacering(int placering) {
		this.placering = placering;
	}


}
