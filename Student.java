package edu2;

public class Student {
	String ime;
	double uspeh;
	
	Student(){
	}
	Student(String name, double grades){
		ime=name;
		uspeh=grades;
	}
	boolean stipendiq(Student b) {
		if(b.uspeh>=5.50) {
			return true;
		}else {
			return false;
		}
	}
}
