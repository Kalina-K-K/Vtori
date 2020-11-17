package edu2;

public class RegularPolygonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon a = new RegularPolygon();
		RegularPolygon b = new RegularPolygon(6,4);
		RegularPolygon c = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println(a.getParameter());
		System.out.println(a.getArea());
		System.out.println(b.getParameter());
		System.out.println(b.getArea());
		System.out.println(c.getParameter());
		System.out.println(c.getArea());
	}

}
