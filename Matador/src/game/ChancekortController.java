package game;

import java.util.Random;

public class ChancekortController {

	


	
	private Chancekort[] chancekortController = new Chancekort[7];
	
	public void opretChancekort() { //opretter chancekort arrayet (String tekst, int beløb, int felt, int value)
		chancekortController[0] = new Chancekort("Ryk frem til Start og modtag 2 kroner", 2, 0, 1);
		chancekortController[1] = new Chancekort("Ryk 5 felter frem", 0, 5, 2);
		chancekortController[2] = new Chancekort("Ryk et felt frem", 0, 1, 3);
		chancekortController[3] = new Chancekort("Du har spist for meget slik. Betalt 2 kroner", -2, 0, 4);
		chancekortController[4] = new Chancekort("Ryk frem til Strandpromenaden", -5, 23, 5);
		chancekortController[5] = new Chancekort("Det er din fødselsdag! Tillykke! Du modtager 1 krone", 1, 0, 6);
		chancekortController[6] = new Chancekort("Du har lavet alle dine lektier. Du modtager 2 kroner", 2, 0, 7);
	}

	public Chancekort getChancekort() { //henter et tilfældigt chancekort
		Random random = new Random();
		int i = random.nextInt(chancekortController.length);
		return chancekortController[i];
	}

	

}
