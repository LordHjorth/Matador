package game;

import java.util.*;

public class SpilController {
	
	private int startKapital;
	private final int STARTFELT = 0;
	private boolean noWinner = true;
	private GUIController guiController;
	private NySpiller[] spillere;
	
	private TerningController terning =new TerningController();
	private ChancekortController chancekortControl = new ChancekortController();
	private Board braetController = new Board();

	public void playGame() { //opsamler metoder og objekter i en enkelt metode, som derefter kan kaldes i main.
		this.guiController = new GUIController(braetController.opretBreat());
		initializeGame();
		gameloop();
	}

	private void gameloop() { 
		while (noWinner) {
			for (int i = 0; i < spillere.length; i++) {
				int faceValue = guiController.setDice(terning);

				guiController.setBilFalse(spillere[i].getPlacering(), i, braetController); //fjerner nuværende bil fra brættet

				if (spillere[i].getPlacering() + faceValue > 39) { //i tilfælde af at arrayets størrelse overskrides, startes en ny runde. (passerer start)
					passerStart(i);
					spillere[i].setPlacering(spillere[i].getPlacering() + faceValue - 40);

				} else {
					spillere[i].setPlacering(spillere[i].getPlacering() + faceValue);
				}

				guiController.setBilTrue(spillere[i].getPlacering(), i, braetController); //sætter ny bil for spilleren
				konsekvensAfFelter(i); //finder konsekvensen af det felt man lander på.
				guiController.setNyBalance(i, spillere[i].getKonto().getKapital()); //opdaterer spillerens balance

				System.out.println("Spiller navn: " + spillere[i].getNavn() + " Spiller kapital: "
						+ spillere[i].getKonto().getKapital() + " Spiller placering: " + spillere[i].getPlacering()); 
				//udskriver spillerens navn, kapital og placering for at udviklingen af spillet, kan følges i konsollen.
				
				pickAWinner(i); //tjekker om der er nogen vinder
			}
		}
	}

	private void pickAWinner(int spiller) { //tjekker for vindere
		int vinderBalance = 0;
		List<String> vinderNavn = new ArrayList<String>();

		if (spillere[spiller].getKonto().getKapital() < 0) {
			noWinner = false;
			for (int i = 0; i < spillere.length; i++) {
				if (spillere[i].getKonto().getKapital() > vinderBalance) {
					vinderNavn.clear();
					vinderNavn.add(spillere[i].getNavn());
					vinderBalance = spillere[i].getKonto().getKapital();
				} else if (spillere[i].getKonto().getKapital() == vinderBalance) {
					vinderNavn.add(spillere[i].getNavn());
					vinderBalance = spillere[i].getKonto().getKapital();
				}
			}
			guiController.getVinderBesked(vinderNavn);
			System.exit(0); //lukker guien og spiller stopper når en vinder er fundet.
		}
	}

	private void initializeGame() {
		// Finder antal af spillere
		int antalSpillere = guiController.getAntalSpillere();
		
		if (antalSpillere == 2) {
			startKapital = 20;
		}
		if (antalSpillere == 3) {
			startKapital = 18;
		}
		if (antalSpillere == 4) {
			startKapital = 16;
		}

		this.spillere = new NySpiller[antalSpillere]; //opretter et nyt arrayer for NySpiller

		for (int i = 0; i < this.spillere.length; i++) { //sætter spillerne i arrayet
			String navn = guiController.getNavnPåSpiller();
			this.spillere[i] = new NySpiller(navn, startKapital, STARTFELT);
		}
		guiController.addPlayers(spillere,braetController); //tilføjer spillerne til gui'en
		chancekortControl.opretChancekort(); //opretter chancekortene
	}

	private void konsekvensAfFelter(int i) { //finder konsekvensen af et vilkårligt felt

		switch (spillere[i].getPlacering() + 1) { //spillerens placering bestemmer hvilken case man ender i.

		case 1: // start
			break;
		case 2:
			landOnField(i, -1);
			break;
		case 3:
			landOnField(i, -1);
			break;
		case 4:// chance
			landOnChancekort(i);
			break;
		case 5:
			landOnField(i, -1);
			break;
		case 6:
			landOnField(i, -1);
			break;
		case 7:// jail på besøg
			guiController.showMessage("PÅ BESØG");
			break;
		case 8:
			landOnField(i, -2);
			break;
		case 9:
			landOnField(i, -2);
			break;
		case 10: // chance
			landOnChancekort(i);
			break;
		case 11:
			landOnField(i, -2);
			break;
		case 12:
			landOnField(i, -2);
			break;
		case 13:// free parking
			guiController.showMessage("FREE PARKING");
			break;
		case 14:
			landOnField(i, -3);
			break;
		case 15:
			landOnField(i, -3);
			break;
		case 16:// chance
			landOnChancekort(i);
			break;
		case 17:
			landOnField(i, -3);
			break;
		case 18:
			landOnField(i, -3);
			break;
		case 19: // Go to jail
			guiController.showMessage("GÅ I FÆNGSEL");
			guiController.setBilFalse(spillere[i].getPlacering(), i, braetController);
			spillere[i].setPlacering(spillere[i].getPlacering()-12);
			guiController.setBilTrue(spillere[i].getPlacering(), i, braetController);
			break;
		case 20:
			landOnField(i, -4);
			break;
		case 21:
			landOnField(i, -4);
			break;
		case 22:// chance
			landOnChancekort(i);
			break;
		case 23:
			landOnField(i, -5);
			break;
		case 25:
			landOnField(i, -5);
			break;
		case 26:
			landOnField(i, -5);
			break;
		case 27:
			landOnField(i, -5);
			break;
		case 28:
			landOnField(i, -5);
			break;
		case 29:
			landOnField(i, -5);
			break;
		case 30:
			landOnField(i, -5);
			break;
		case 31:
			landOnField(i, -5);
			break;
		case 32:
			landOnField(i, -5);
			break;
		case 33:
			landOnField(i, -5);
			break;
		case 34:
			landOnField(i, -5);
			break;
		case 35:
			landOnField(i, -5);
			break;
		case 36:
			landOnField(i, -5);
			break;
		case 37:
			landOnField(i, -5);
			break;
		case 38:
			landOnField(i, -5);
			break;
		case 39:
			landOnField(i, -5);
			break;
		case 40:
			landOnField(i, -5);
			break;
		}
	}

	private void landOnChancekort(int i) { //konsekvenser for at lande på et chancekort
         
		Chancekort chancekortet = chancekortControl.getChancekort();
		
		guiController.setBilFalse(spillere[i].getPlacering(), i, braetController);
		
		switch (chancekortet.getValue()) {
		case 1:   //ryk til start
			spillere[i].setPlacering(chancekortet.getFelt()); 
			guiController.setBilTrue(spillere[i].getPlacering(), i, braetController);
			guiController.showMessage(chancekortet.getTekst());
			passerStart(i);
			break;
		case 2:   // ryk 5 felter frem. speciel da boardet ender ved 24. Hvis man står på felt 21 (chance) skal man således rykkes 2 felter forbi start
			if(spillere[i].getPlacering() == 21){ 
			spillere[i].setPlacering(spillere[i].getPlacering()-19); 
			guiController.setBilTrue(spillere[i].getPlacering(), i, braetController);
			guiController.showMessage(chancekortet.getTekst());	
			passerStart(i);
			konsekvensAfFelter(i);
			}
			else {
			spillere[i].setPlacering(spillere[i].getPlacering()+chancekortet.getFelt()); 
			guiController.setBilTrue(spillere[i].getPlacering(), i, braetController);
			guiController.showMessage(chancekortet.getTekst());	
			konsekvensAfFelter(i);
			}
			break;
		case 3:
			spillere[i].setPlacering(spillere[i].getPlacering()+chancekortet.getFelt()); 
			guiController.setBilTrue(spillere[i].getPlacering(), i, braetController);
			guiController.showMessage(chancekortet.getTekst());	
			konsekvensAfFelter(i);
			break;
		case 5:
			spillere[i].setPlacering(chancekortet.getFelt());            //strand promenaden
			guiController.setBilTrue(spillere[i].getPlacering(), i, braetController);
			guiController.showMessage(chancekortet.getTekst());
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() +chancekortet.getBeløb());
			break;
		case 4:
		case 6:
		case 7:
			guiController.setBilTrue(spillere[i].getPlacering(), i, braetController);
			guiController.showMessage(chancekortet.getTekst());	
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital()+chancekortet.getBeløb());
			break;}
		
		
		}
		
		


	private void landOnField(int i, int nyBalance) { //opdaterer blance for at lande på et "normalt" felt.
		spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + nyBalance);
	}
	private void passerStart(int i) { //giver spillere 2 point for at passere start
		spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + 2);
	}

}
