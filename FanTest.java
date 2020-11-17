package edu2;

public class FanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan1=new Fan();
		Fan fan2=new Fan();
		boolean on=true;
		fan1.setSpeed(3);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		
		fan2.setSpeed(2);
		fan2.setRadius(5);
		fan2.setColor("blue");
		
		fan1.toString2();
		fan2.toString2();
	}

}
