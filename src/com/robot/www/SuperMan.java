package com.robot.www;

public abstract class SuperMan {

	String id;
	int superAbility;
	
	public String putID() {
		return id;
	}

	public void setID(String id) {
		this.id = id;
	}

	public int putSA() {
		return superAbility;
	}

	public void setSA(int superAbility) {
		this.superAbility = superAbility;
	}
	
	abstract String judge();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


