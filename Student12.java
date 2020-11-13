package edu2;

public class Student12 {
	private String ime;
	private double uspeh;
	
	Student12(){
	}
	Student12(String name, double grades){
		ime=name;
		uspeh=grades;
	}
	
	void setName(String name) {
		ime=name;
	}
	void setGrade(double grade) {
		uspeh=grade;
	}
	String getName() {
		return ime;
	}
	double getGrade() {
		return uspeh;
	}
	
//	boolean stipendiq(Student b) {
//		if(b.uspeh>=5.50) {
//			return true;
//		}else {
//			return false;
//		}
//	}
}
