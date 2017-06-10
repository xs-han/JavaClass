package com.empire.mid;

public class EmptyException extends Exception {
	private String message;
	public EmptyException(String mess){
		message = mess;
	}
	
	public String OutMessage(){
		return message;
	}
}
