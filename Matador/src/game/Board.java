package game;

import java.awt.Color;

import gui_fields.GUI_Chance;
import gui_fields.GUI_Field;
import gui_fields.GUI_Jail;
import gui_fields.GUI_Refuge;
import gui_fields.GUI_Start;
import gui_fields.GUI_Street;

public class Board {
	
	final GUI_Field[] fields = new GUI_Field[40];

	
	
	public GUI_Field[] opretBreat() { //opretter Spillebræt

		Color Start = new Color(76, 153, 0);
		Color Madboder = new Color(102, 102, 0); 
		Color SlikogIs = new Color(102,178,255);
		Color Intellektuel = new Color(181, 83, 142);
		Color AktivUnderholdning = new Color(255, 243, 131);
		Color BioSpil = new Color(223, 63, 63);
		Color Butikker= new Color(245, 249, 119);
		Color ZooBowl = new Color(0, 102,51);
		Color Vand = new Color(22, 3, 152);
		
		fields[0] = new GUI_Start("START", "Modtag: 2 kr", "Du får 2 kr fra banken, hver gang du passerer start",
				Start, Color.black);
		fields[1] = new GUI_Street("Burgerbaren","Pris:1 kr","Burgerbaren","",Madboder,Color.BLACK);
		fields[2] = new GUI_Street("Pizzahuset", " Pris: 1 kr", "Pizzahuset", "", Madboder, Color.BLACK);
		fields[3] = new GUI_Chance("?", "Chance", "Prøv Lykken", Color.WHITE, Color.BLACK);
		fields[4] = new GUI_Street("Slikbutikken","Pris: 1 kr", "Slikbutikken","",SlikogIs,Color.BLACK);
		fields[5] = new GUI_Street("Iskiosken","Pris: 1 kr", "Iskiosken","",SlikogIs,Color.BLACK);
		fields[6] = new GUI_Jail();
		fields[6].setSubText("Fængsel");
		fields[6].setDescription("På besøg i fængslet");
		fields[7] = new GUI_Street("Museet", " Pris: 2 kr", " Museet", "", Intellektuel, Color.black);
		fields[8] = new GUI_Street("Biblioteket", " Pris: 2 kr", " Biblioteket", "", Intellektuel, Color.black);
		fields[9] = new GUI_Chance("?", "Chance", "Prøv Lykken", Color.WHITE, Color.BLACK);
		fields[10] = new GUI_Street("Skaterparken", " Pris: 2 kr", " Skaterparken", "", AktivUnderholdning, Color.black);
		fields[11] = new GUI_Street("Swimmingpoolen", " Pris: 2 kr", " Swimmingpoolen", "", AktivUnderholdning, Color.black);
		fields[12] = new GUI_Refuge("", "Gratis Parkering", "Gratis Parkering", "Her har du helle!", Color.WHITE, Color.BLACK);
		fields[13] = new GUI_Street("Spillehallen", " Pris: 3 kr", " Spillehallen", "", BioSpil, Color.black);
		fields[14] = new GUI_Street("Biografen", " Pris: 3 kr", " Biografen", "", BioSpil, Color.black);
		fields[15] = new GUI_Chance("?", "Chance", "Prøv Lykken", Color.WHITE, Color.BLACK);
		fields[16] = new GUI_Street("Legetøjsbutikken", " Pris: 3 kr", " Legetøjsbutikken", "", Butikker, Color.black);
		fields[17] = new GUI_Street("Dyrehandlen", " Pris: 3 kr", " Dyrehandlen", "", Butikker, Color.black);
		fields[18] = new GUI_Jail();
		fields[18].setSubText("Fængsel");
		fields[18].setDescription("Gå i fængslet");
		fields[19] = new GUI_Street("Bowlinghallen", " Pris: 4 kr", " Bowlinghallen", "", ZooBowl, Color.black);
		fields[20] = new GUI_Street("Zoo", " Pris: 4 kr", " Zoo", "", ZooBowl, Color.black);
		fields[21] = new GUI_Chance("?", "Chance", "Prøv Lykken", Color.WHITE, Color.BLACK);
		fields[22] = new GUI_Street("Vandlandet", " Pris: 5 kr", "Vandlandet", "", Vand, Color.WHITE);
		fields[23] = new GUI_Street("Strandpromenaden", " Pris: 5 kr", " Strandpromenaden", "", Vand, Color.WHITE);
		fields[24] = new GUI_Street("Strandpromenaden", " Pris: 5 kr", " Strandpromenaden", "", Vand, Color.WHITE);
		fields[25] = new GUI_Street("Strandpromenaden", " Pris: 5 kr", " Strandpromenaden", "", Vand, Color.WHITE);
		fields[26] = new GUI_Street("Strandpromenaden", " Pris: 5 kr", " Strandpromenaden", "", Vand, Color.WHITE);
		fields[27] = new GUI_Street("Strandpromenaden", " Pris: 5 kr", " Strandpromenaden", "", Vand, Color.WHITE);
		fields[28] = new GUI_Street("Strandpromenaden", " Pris: 5 kr", " Strandpromenaden", "", Vand, Color.WHITE);
		fields[29] = new GUI_Street("Strandpromenaden", " Pris: 5 kr", " Strandpromenaden", "", Vand, Color.WHITE);
		fields[30] = new GUI_Street("Strandpromenaden", " Pris: 5 kr", " Strandpromenaden", "", Vand, Color.WHITE);
		fields[31] = new GUI_Street("Strandpromenaden", " Pris: 5 kr", " Strandpromenaden", "", Vand, Color.WHITE);
		fields[32] = new GUI_Street("Strandpromenaden", " Pris: 5 kr", " Strandpromenaden", "", Vand, Color.WHITE);
		fields[33] = new GUI_Street("Strandpromenaden", " Pris: 5 kr", " Strandpromenaden", "", Vand, Color.WHITE);
		fields[34] = new GUI_Street("Strandpromenaden", " Pris: 5 kr", " Strandpromenaden", "", Vand, Color.WHITE);
		fields[35] = new GUI_Street("Strandpromenaden", " Pris: 5 kr", " Strandpromenaden", "", Vand, Color.WHITE);
		fields[36] = new GUI_Street("Strandpromenaden", " Pris: 5 kr", " Strandpromenaden", "", Vand, Color.WHITE);
		fields[37] = new GUI_Street("Strandpromenaden", " Pris: 5 kr", " Strandpromenaden", "", Vand, Color.WHITE);
		fields[38] = new GUI_Street("Strandpromenaden", " Pris: 5 kr", " Strandpromenaden", "", Vand, Color.WHITE);
		fields[39] = new GUI_Street("Strandpromenaden", " Pris: 5 kr", " Strandpromenaden", "", Vand, Color.WHITE);
		
		return fields;
		}
	public GUI_Field getFelt(int i) { //henter et felt fra fields arrayet
		return fields[i];
	}
	

}
