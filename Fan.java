package edu2;

public class Fan {
	final int SLOW=1;
	final int MEDIUM=2;
	final int FAST=3;
	private int speed=SLOW;
	private boolean switchedOn=false;
	private double radius=5;
	private String color="blue";
	
	void setSpeed(int speed) {
		this.speed=speed;
	}
	void setOn(boolean switchedOn) {
		this.switchedOn=switchedOn;
	}
	void setRadius(double radius) {
		this.radius=radius;
	}
	void setColor(String color) {
		this.color=color;
	}
	
	int getSpeed() {
		return speed;
	}
	boolean getOn() {
		return switchedOn;
	}
	double getRadius() {
		return radius;
	}
	String getColor() {
		return color;
	}
	
	Fan(){
	}
	
	void toString2() {
		String finalString="";
		if(switchedOn) {
			finalString = speed + " " + radius + " " + color;
			System.out.println(finalString);
		}else {
			finalString = radius + " " + color + "\n" + "The fan is off.";
			System.out.println(finalString);
		}
	}
}
