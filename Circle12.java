package edu2;

public class Circle12 {
		private double radius=1;
		
		Circle12(){
			
		}
		
		Circle12(double newRadius){
			radius=newRadius;
		}
		double getArea() {
			return radius*radius*Math.PI;
		}
		double getPerimeter() {
			return 2*radius*Math.PI;
		}
		void setRadius(double newRadius) {
			radius=newRadius;
		}
		double getRadius() {
			return radius;
		}
}
