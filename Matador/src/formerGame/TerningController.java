package formerGame;

import java.util.Random;

public class TerningController {

	// Terningens værdi er baseret på java.util.Random, som bruges til at fremskaffe
	// en tilfældig værdi. Denne kan tilgås ved brug af getters

	Random random = new Random();

	private int terning;

	public TerningController() {

	}

	

	public void kastTerning() {
		terning = random.nextInt(6) + 1;

	}

	public int getTerning() {
		return terning;
	}

}
