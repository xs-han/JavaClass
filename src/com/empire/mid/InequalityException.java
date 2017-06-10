package com.empire.mid;

class InequalityException extends EmptyException{
	private String message;
	public InequalityException(String s1, String s2){
		super("");
		message = s1 + " 和 " + s2 + "不一致";
	}
	public String OutMessage(){
		return message;
	}
}
