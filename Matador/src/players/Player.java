package players;

import java.util.*;

import boardContent.Property;

public class Player {
	
	private String name;
	private Account account; 
	private int position = 0;
	private boolean inPrison = false;
	private List<Property> properties = new ArrayList<>();
	private boolean pardon = false;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public boolean isInPrison() {
		return inPrison;
	}
	public void setInPrison(boolean inPrison) {
		this.inPrison = inPrison;
	}
	public List<Property> getProperties() {
		return properties;
	}
	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}
	public boolean isPardon() {
		return pardon;
	}
	public void setPardon(boolean pardon) {
		this.pardon = pardon;
	}

}
