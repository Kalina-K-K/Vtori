package edu2;

public class RegularPolygon {
	private int n=3;
	private double sideLength=1;
	private double x=0;
	private double y=0;
	
	RegularPolygon(){
	}
	RegularPolygon(int n, double length){
		this.n=n;
		sideLength=length;
	}
	
	RegularPolygon(int n, double length, double x, double y){
		this.n=n;
		sideLength=length;
		this.x=x;
		this.y=y;
	}
	
	void setN(int n){
		this.n=n;
	}
	void setSideLength(double length){
		sideLength=length;
	}
	void setX(double x){
		this.x=x;
	}
	void setY(double y){
		this.y=y;
	}
	
	int getN() {
		return n;
	}
	double getSideLength() {
		return sideLength;
	}
	double getX() {
		return x;
	}
	double getY() {
		return y;
	}
	
	double getParameter() {
		return n*sideLength;
	}
	double getArea() {
		double area=(n*sideLength*sideLength)/(4*Math.tan(Math.PI/n));
		return area;
	}
}
