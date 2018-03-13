package game;

public class Chancekort {
	private int value;
	private String tekst;
	private int beløb;
	private int felt;
	
	public Chancekort(String tekst, int beløb, int felt, int value) { //bruges til at oprette chancekortene
		this.tekst=tekst;
		this.beløb=beløb;
		this.felt=felt;
		this.value=value;
	}
	public String getTekst() { 
		return tekst;
	}
	


	public int getBeløb() {
		return beløb;
	}



	public int getFelt() {
		return felt;
	}

	

	public int getValue() {
		return value;
	}

	
}
