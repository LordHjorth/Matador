package game;

import java.awt.Color;

import gui_fields.GUI_Brewery;
import gui_fields.GUI_Chance;
import gui_fields.GUI_Field;
import gui_fields.GUI_Jail;
import gui_fields.GUI_Refuge;
import gui_fields.GUI_Shipping;
import gui_fields.GUI_Start;
import gui_fields.GUI_Street;
import gui_fields.GUI_Tax;

public class Board {
	
	final GUI_Field[] fields = new GUI_Field[40];

	
	
	public GUI_Field[] opretBreat() { //opretter Spillebræt
		Color white= Color.WHITE;
		Color Start = new Color(204,0, 0);
		Color blågruppe = new Color(51, 153, 255); 
		Color lyserødgruppe = new Color(255,130,102);
		Color grøngruppe = new Color(204, 204,0);
		Color rødgruppe = new Color(255, 51, 51);
		Color gulgruppe= new Color(255,255,102);
		Color green= new Color(0,153,0);
		Color fængsel= new Color(125,125,125);
		Color lilla= new Color(151,46,172 );

		int i=0;
		fields[i++] = new GUI_Start("START", "Modtag: 4000kr", "Du får 4000 kr fra banken, hver gang du passerer start",Start, Color.black);	
		fields[i++] = new GUI_Street("Rødovrevej","Pris:1200 kr","Rødovrevej","",blågruppe,Color.BLACK);
		fields[i++] = new GUI_Chance("?", "Chance", "Prøv Lykken", Color.BLACK, Color.WHITE);
		fields[i++] = new GUI_Street("Hvidovrevej", " Pris: 1200 kr", "Hvidovrevej", "", blågruppe, Color.BLACK);
		fields[i++] = new GUI_Tax("Betal indkomstskat", "","Betal 10% eller 4000kr." , white, Color.BLACK);
		fields[i++] = new GUI_Shipping("default","Samsøfærgen","4000kr.","Samsøfærgen","",green,Color.BLACK);
		fields[i++] = new GUI_Street("Roskildevej", " Pris: 2000 kr", " Roskildevej", "", lyserødgruppe, Color.black);
		fields[i++] = new GUI_Chance("?", "Chance", "Prøv Lykken", Color.BLACK, Color.WHITE);
		fields[i++] = new GUI_Street("Valby Langgade", " Pris: 2000 kr", "Valby Langgade", "", lyserødgruppe, Color.black);
		fields[i++] = new GUI_Street("Allégade", " Pris: 2400 kr", "Allégade", "", lyserødgruppe, Color.black);
		fields[i++] = new GUI_Jail("default","Fængsel","Fængsel","På besøg i fængsel",fængsel,Color.black);
		fields[i++] = new GUI_Street("Frederiksberg Allé", " Pris: 2800 kr", "Frederiksberg Allé", "", grøngruppe, Color.black);
		fields[i++]= new GUI_Brewery("default","Coca Cola","3000","Coca Cola","",Color.white,Color.BLACK);
		fields[i++] = new GUI_Street("Bülowsvej", " Pris: 2800 kr", "Bülowsvej", "", grøngruppe, Color.black);
		fields[i++] = new GUI_Street("Gl. Kongevej", " Pris: 3200kr","Gl. Kongevej", "", grøngruppe, Color.black);
		fields[i++] = new GUI_Shipping("default","Grenaa-Hundested","4000kr.","Grenaa-Hundested","",green,Color.BLACK);
		fields[i++] = new GUI_Street("Berntoffsvej", " Pris: 3600 kr", "Berntoffsvej", "", Color.GRAY, Color.black);
		fields[i++] = new GUI_Chance("?", "Chance", "Prøv Lykken", Color.BLACK, Color.WHITE);
		fields[i++] = new GUI_Street("Hellerupvej", " Pris: 3600 kr", "Hellerupvej", "", Color.GRAY, Color.black);
		fields[i++] = new GUI_Street("Strandvejen", " Pris: 4000 kr", "Strandvejen", "", Color.GRAY, Color.black);
		fields[i++] = new GUI_Refuge("default","Du har helle!","Parkering","Parkering",white,Color.black);
		fields[i++] = new GUI_Street("Trianglen", " Pris: 4400 kr", "Trianglen", "", rødgruppe, Color.black);
		fields[i++] = new GUI_Chance("?", "Chance", "Prøv Lykken", Color.BLACK, Color.WHITE);
		fields[i++] = new GUI_Street("Østerbrogade", " Pris: 4400 kr", "Østerbrogade", "", rødgruppe, Color.black);
		fields[i++] = new GUI_Street("Grønningen", " Pris: 4800 kr", "Grønningen", "", rødgruppe, Color.black);
		fields[i++] = new GUI_Shipping("default","Molslinjen","4000kr.","Molslinjen","",green,Color.BLACK);
		fields[i++] = new GUI_Street("Bredgade", " Pris: 5200 kr", "Bredgade", "", Color.white, Color.black);
		fields[i++] = new GUI_Street("Kgs. Nytorv", " Pris: 5200 kr", "Kgs. Nytorv", "", Color.white, Color.black);
		fields[i++]= new GUI_Brewery("default","Faxe Kondi","3000","Faxe Kondi","",Color.white,Color.BLACK);
		fields[i++] = new GUI_Street("Østergade", " Pris: 5600 kr", "Østergade", "", Color.white, Color.black);
		fields[i++] = new GUI_Jail("default","De fængsles","De fængsles","De fængsles",fængsel,Color.black);
		fields[i++] = new GUI_Street("Amagertorv", " Pris: 6000 kr", "Amagertorv", "", gulgruppe, Color.black);
		fields[i++] = new GUI_Chance("?", "Chance", "Prøv Lykken", Color.BLACK, Color.WHITE);
		fields[i++] = new GUI_Street("Vimmelskaftet", " Pris: 6000 kr", "Vimmelskaftet", "", gulgruppe, Color.black);
		fields[i++] = new GUI_Street("Nygade", " Pris: 6400 kr", "Nygade", "", gulgruppe, Color.black);
		fields[i++] = new GUI_Shipping("default","Skandinavisk Linjetrafik A/S","4000kr.","Skandinavisk Linjetrafik A/S","",green,Color.BLACK);
		fields[i++] = new GUI_Chance("?", "Chance", "Prøv Lykken", Color.BLACK, Color.WHITE);
		fields[i++] = new GUI_Street("Frederiksberg gade", " Pris: 7800 kr", "Frederiksberg gade", "", lilla, Color.black);
		fields[i++] = new GUI_Tax("Betal Ekstraordinær statsskat", "","Betal 2000kr." , white, Color.BLACK);
		fields[i++] = new GUI_Street("Rådhuspladsen", " Pris: 8000 kr", "Rådhuspladsen", "", lilla, Color.black);
		
		return fields;
		}
	public GUI_Field getFelt(int i) { //henter et felt fra fields arrayet
		return fields[i];
	}
	

}
