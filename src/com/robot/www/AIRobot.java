package com.robot.www;

public class AIRobot extends SuperMan implements Robot, GreenGiant{
	
	int think;

	public int putThink() {
		return think;
	}

	public void setThink(int think) {
		this.think = think;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AIRobot aRobot1 = new AIRobot();
		AIRobot aRobot2 = new AIRobot();
		System.out.println(aRobot1.flyAngle);
	}
	
	public void thinkof(){
		System.out.println("thinkof");
	}

	@Override
	public void nightFly() {
		// TODO Auto-generated method stub
		System.out.println("AI: night fly.");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("AI: jump.");
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("AI: fly.");
	}

	@Override
	public void war() {
		// TODO Auto-generated method stub
		System.out.println("AI: war.");
	}

	@Override
	String judge() {
		// TODO Auto-generated method stub
		System.out.println("AI judge");
		return "AI judge";
	}

}
